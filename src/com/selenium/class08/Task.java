package com.selenium.class08;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
//		TC 1: Table headers and rows verification
//		Open chrome browser
//		Go to “http://166.62.36.207/syntaxpractice/”
//		Click on “Table” link
//		Click on “ITable Data Search” link
//		Verify second table consist of 5 rows and 4 columns
//		Print name of all column headers 
//		Print data of all rows
//		Quit Browser

		String url = "http://166.62.36.207/syntaxpractice/table-search-filter-demo.html";
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		List<WebElement> colsHeader = driver.findElements(By.xpath("//table[@class='table']//thead"));
		int size = colsHeader.size();
		System.out.println(size);

		Iterator<WebElement> it = colsHeader.iterator();
		while (it.hasNext()) {
			WebElement text = it.next();
			System.out.println(text.getText());
		}

		System.out.println("-----------------------");

		List<WebElement> rows = driver.findElementsByXPath("//table[@class='table']//tr");
		for (int i = 0; i < rows.size(); i++) {
			String rowsText = rows.get(i + 2).getText();
			System.out.println(rowsText);

		}
		
		driver.quit();

	}

}
