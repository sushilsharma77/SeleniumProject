package com.selenium.homePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class Practice extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		WebElement userName=driver.findElement(By.id("txtUsername"));
		sendText(userName, ConfigsReader.getProperty("username"));
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		
		tearDown();
		

	}

}
