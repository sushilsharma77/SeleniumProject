package com.selenium.class4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();

		WebElement userName = driver.findElementById("txtUsername");
		userName.sendKeys("Admin");
		WebElement password = driver.findElementById("txtPassword");
		password.sendKeys("Hum@nhrm123");
		WebElement login = driver.findElementById("btnLogin");
		login.submit();

		WebElement logo = driver.findElementByXPath("//img[contains(@alt,'OrangeHRM')]");
		Thread.sleep(2000);
		
         logo.click();
         
         if(logo.isDisplayed()) {
        	 System.out.println("Test case is passed");
         }else {
        	 System.out.println("Test case is failed");
         }

	}

}
