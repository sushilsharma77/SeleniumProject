package com.selenium.class4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WE {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/ajax.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement>element=driver.findElements(By.name("name"));
		System.out.println("Numbers of elements is "+element.size());
		
		for(int i=0;i<element.size();i++) {
			System.out.println("Radio button text: "+element.get(i).getAttribute("value"));
		}
	
	}

}
