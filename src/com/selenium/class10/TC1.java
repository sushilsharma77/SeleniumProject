package com.selenium.class10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC1 {

	public static void main(String[] args) throws InterruptedException {
//		Open chrome browser
//		Go to “http://www.uitestpractice.com/”
//		Click on “Droppable” link
//		Using mouse drag “Drag me to my target” to the “Drop Here”
//		Close the browser

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.uitestpractice.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		
		
		Thread.sleep(5000);
		driver.close();

	}

}
