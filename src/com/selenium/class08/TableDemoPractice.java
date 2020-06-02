package com.selenium.class08;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class TableDemoPractice {

	public static void main(String[] args) {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/table-search-filter-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		Iterator<WebElement>it=rows.iterator();
		while(it.hasNext()) {
			WebElement totalRows=it.next();
			System.out.println(totalRows.getText());
		}
		System.out.println();
		
		List<WebElement>cols=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
		System.out.println(cols.size());
		
		Iterator<WebElement>its=cols.iterator();
		while(its.hasNext()) {
			String totalColumns=its.next().getText();
			System.out.println(totalColumns);
		}
		


	}

}
