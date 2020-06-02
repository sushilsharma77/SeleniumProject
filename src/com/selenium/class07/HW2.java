package com.selenium.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {

	public static void main(String[] args) throws InterruptedException {
//		 TC 2: Verify element is enabled
//		Open chrome browser
//		Go to “https://the-internet.herokuapp.com/”
//		Click on “Click on the “Dynamic Controls” link
//		Click on enable button
//		Enter “Hello” and verify text is entered successfully
//		Close the browser 

		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		
        Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		ele.click();
		ele.sendKeys("Hello");
		
		boolean dis=ele.isDisplayed();
		System.out.println(dis);
		if(dis==true) {
			String text=ele.getText();
			System.out.println(text);
		}
		
		
		

	}

}
