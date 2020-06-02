package com.selenium.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://mail.google.com/");
		System.out.println(driver.getTitle());
		String str=driver.getCurrentUrl();
		System.out.println(str);
		
		String newUrl="https://facebook.com/";
		System.out.println(newUrl);
		String h=driver.getCurrentUrl();
		if(newUrl.equalsIgnoreCase(h)) {
			System.out.println(h);
		}
		else {
			System.out.println("Invalid url");
		}
		
		
		driver.close();

	}

}
