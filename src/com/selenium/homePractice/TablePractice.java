package com.selenium.homePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://testingpool.com/data-types-in-java/");
		driver.manage().window().maximize();

		List<WebElement> rows = driver
				.findElements(By.xpath("//*[@class='su-table su-table-alternate']/table/tbody/tr"));
		int rowsSize = rows.size();
		System.out.println(rowsSize);

		for (WebElement r : rows) {
			String rowText = r.getText();
			System.out.println(rowText);
		}

		System.out.println("------------------------");

		List<WebElement> cols = driver
				.findElements(By.xpath("//*[@class='su-table su-table-alternate']/table/tbody/tr[1]/td"));
		int colsSize = cols.size();
		System.out.println(colsSize);

		for (WebElement c : cols) {
			String colsText = c.getText();
			System.out.println(colsText);
		}

		System.out.println("------------------------");

		for (int i = 1; i <= rowsSize; i++) {
			for (int j = 1; j <= colsSize; j++) {
				WebElement allData = driver.findElement(
						By.xpath("//*[@class='su-table su-table-alternate']"
								+ "/table/tbody/tr[" + i + "]/td[" + j + "]"));

				System.out.println(allData.getText());
			}
		}
		driver.close();

	}

}
