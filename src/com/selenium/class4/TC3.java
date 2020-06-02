package com.selenium.class4;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3 {

	public static void main(String[] args) throws InterruptedException {
		// Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
		//Click on “Input Forms” links
		//Click on “Simple Form Demo” links
	    //Get all input boxes from the page
	   //Enter “Hello” to each text box and Close browser.
		String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(url);
		
		WebElement element=driver.findElementByClassName("dropdown-toggle");
		element.click();
		Thread.sleep(2000);
		driver.findElementByLinkText("Simple Form Demo").click();
		
		List<WebElement>list=driver.findElementsById("user-message");
		for(WebElement ele:list) {
			ele.sendKeys("Hello");
		}
		
		


	}

}
