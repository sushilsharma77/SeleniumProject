package com.selenium.class4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {

	public static void main(String[] args) {
//  HRMS Application Negative Login:Open chrome browser
//  Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//  Enter valid username and Leave password field empty
//  Verify error message with text “Password cannot be empty” is displayed.
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.findElementById("txtUsername").sendKeys("Admin");
		driver.findElementById("btnLogin").click();
		
		WebElement message=driver.findElementById("spanMessage");
		System.out.println(message.getText());
		if(message.isDisplayed()) {
			System.out.println("Test case is passed");
		}else {
			System.out.println("Test case is failed");
		}

	}

}
