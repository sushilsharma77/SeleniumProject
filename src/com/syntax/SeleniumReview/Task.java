package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		// Go to amazon.com
//		 * select books from the search dropdown
//		 * type Harry potter
//		 * and click on Search
//		 * check Unofficial CookBook checkbox on the left under Book Series
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");

		WebElement element = driver.findElementById("twotabsearchtextbox");
		element.sendKeys("Books");
		driver.findElementByClassName("nav-input").click();
		driver.findElementById("twotabsearchtextbox").sendKeys("Harry potter");
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@type='submit']").click();
		Thread.sleep(2000);
		List<WebElement> dd = driver.findElementsByClassName("a-spacing-micro");
		System.out.println(dd.size());
		for (WebElement ddAll : dd) {
			String all = ddAll.getText();
			 System.out.println(all);
			 
			 Thread.sleep(2000);
			 
			 if(all.equalsIgnoreCase("Unofficial CookBook")) {
				 ddAll.click();
				 break;
			 }
		}

		// driver.close();
	}

}
