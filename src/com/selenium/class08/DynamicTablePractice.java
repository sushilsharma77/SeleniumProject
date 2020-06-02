package com.selenium.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTablePractice {

	public static void main(String[] args) throws InterruptedException {
		String url = " http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

		String expectValue = "Bob Feather";

		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		List<WebElement> rows = driver.findElementsByXPath("//table[@id='ctl00_MainContent_orderGrid']//tr");
		int rowSize = rows.size();
		System.out.println(rowSize);

		for (int i = 0; i < rowSize; i++) {
			String text = rows.get(i + 1).getText();
			System.out.println(text);

			if (text.contains(expectValue)) {
				driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[1]")).get(i).click();
				break;
			}

		}
		Thread.sleep(5000);
		driver.close();
	}

}
