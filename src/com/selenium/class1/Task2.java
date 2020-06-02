package com.selenium.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2 {

	public static void main(String[] args) {
		// TC 2: Opening Page on Firefox Browser: Open Firefox browser
		//Navigate to “https://www.redfin.com/”
		//Verify that you have navigated to (https://www.redfin.com/)
		//End the Session (close the browser).
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redfin.com/");
		if(driver.getCurrentUrl().equalsIgnoreCase("https://www.redfin.com/")) {
			System.out.println(driver.getCurrentUrl());
		}else {
			System.out.println("Not verified url");
		}
		driver.close();


	}

}
