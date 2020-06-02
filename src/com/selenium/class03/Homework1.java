package com.selenium.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework1 {

	public static void main(String[] args) throws InterruptedException {
		String url="http://newtours.demoaut.com/";
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get(url);
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Sushil");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Sharma");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("4567891011");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("susarma54@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("7176 Staunton Cir");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Manassas");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("VA");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("20109");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("susarma54@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sushil1234");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Sushil1234");
		driver.findElement(By.xpath("//input[contains(@src,'forms')]")).click();
		
		Thread.sleep(4000);
		
		driver.close();
		
		
		
		

	}

}
