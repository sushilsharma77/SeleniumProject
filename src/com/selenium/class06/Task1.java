package com.selenium.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
//		Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//			Click on “Alerts & Modals” links,Click on “Javascript Alerts” links
//			Click on button in “Java Script Alert Box” section
//			Verify alert box with text “I am an alert box!” is present
//			Click on button in “Java Script Confirm Box” section
//			Verify alert box with text “Press a button!” is present
//			Click on button in “Java Script Alert Box” section
//			Enter text in the alert boxQuit browser
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		Thread.sleep(3000);
		driver.findElementByLinkText("Alerts & Modals").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//a[contains(@href,'alert-box-demo.html')]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//button[@class='btn btn-default']").click();
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(2000);

		driver.findElementByXPath("//button[@onclick='myPromptFunction()']").click();
		Alert alert2 = driver.switchTo().alert();
		String alert2Text = alert2.getText();
		Thread.sleep(2000);
		System.out.println(alert2Text);
		alert2.sendKeys("Hello");
		Thread.sleep(2000);
		alert2.accept();
		Thread.sleep(2000);

		driver.close();

	}

}
