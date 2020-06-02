package com.selenium.class10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4 {

	public static void main(String[] args) {
//		Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//			Login to the application by writing xpath based on “following and preceding siblings”
//			click login button using JS executer.
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement userName=driver.findElement(By.xpath("//*[text()='Username']/preceding-sibling::input"));
		userName.sendKeys("Admin");
		WebElement password=driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input"));
		password.sendKeys("Hum@nhrm123");
		
		WebElement login=driver.findElement(By.xpath("//div[@id='divLoginButton']/input"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", login);
		
		driver.close();


	}

}
