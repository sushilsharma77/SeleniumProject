package com.selenium.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {

	public static void main(String[] args) throws InterruptedException {
//		TC 3: Windows Handling
//		Open chrome browser
//		Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//		Click on “Javascript Alerts” link
//		Click on “Window Popup Modal” link
//		Click on the “ Follow On Instagram” button
//		Verify title of the page is “Syntax Technologies (@syntaxtechs) • Instagram photos and videos” 
//		Click on the “Like us On Facebook ” button
//		Verify title of the page is “Go to Facebook Home” 
//		Quit the browser
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Alerts & Modals")).click();
		driver.findElement(By.linkText("Javascript Alerts")).click();



	}

}
