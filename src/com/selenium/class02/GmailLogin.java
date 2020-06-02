package com.selenium.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		String url="https://www.gmail.com";
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.id("identifierId")).sendKeys("susarma54@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
