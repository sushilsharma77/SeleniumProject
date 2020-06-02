package com.selenium.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
	// TC 1: Amazon Page Title Verification: Open chrome browser
	//Go to “https://www.amazon.com/”Verify Title “Amazon.com: 
//Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("Amazon.com: Online Shopping for Electronics,"
				+ " Apparel, Computers, Books, DVDs & more")) {
			System.out.println(title);
		}else {
			System.out.println("Invalid title");
		}
		driver.close();

	}

}
