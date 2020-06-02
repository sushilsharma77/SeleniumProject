package com.selenium.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {

	public static void main(String[] args) {
		String url="http://newtours.demoaut.com/";
		System.setProperty("webdriver.chrome.driver", "drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("susarma54@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Sushil1234");
		driver.findElement(By.cssSelector("input[type='image']")).click();

	}

}
