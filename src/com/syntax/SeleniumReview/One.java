package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class One {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		
		List<WebElement>links=driver.findElementsByTagName("a");
		int sizeOfLink=links.size();
		System.out.println(sizeOfLink);
		boolean listIsEmpty=links.isEmpty();
		System.out.println(listIsEmpty);
		
		for(WebElement allLinks:links) {
			String all=allLinks.getText();
			String urls=allLinks.getAttribute("href");
			System.out.println(all+"::"+urls);
			
		}
		
		
		

	}

}
