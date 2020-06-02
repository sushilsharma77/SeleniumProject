package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/index.html");
		
		List<WebElement>dds=driver.findElementsByTagName("a");
		int ddsize=dds.size();
		System.out.println(ddsize);
		for(WebElement all:dds) {
			String alls=all.getText();
			System.out.println(alls);
			Thread.sleep(2000);
			if(alls.equals("Progress Bars")) {
				all.click();
				break;
			}
		
			
			}
		
		
	}

}
