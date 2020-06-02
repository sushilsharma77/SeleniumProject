package com.selenium.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		
		WebElement help=driver.findElementByLinkText("Help");
		help.click();
		Thread.sleep(2000);
		String mainTitle=driver.getTitle();
		System.out.println(mainTitle);
		
		Set<String>allWindow=driver.getWindowHandles();
		System.out.println(allWindow.size());
		
		Iterator<String> it=allWindow.iterator();
		String mainWindow=it.next();
		System.out.println(mainWindow);
		String childWindow=it.next();
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		String childTitle=driver.getTitle();
		System.out.println(childTitle);
		
		driver.findElement(By.linkText("Sign in"));
		Thread.sleep(2000);
		
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
