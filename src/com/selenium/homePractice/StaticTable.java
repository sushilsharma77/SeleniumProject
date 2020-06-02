package com.selenium.homePractice;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.nvcc.edu/calendars/academic/fall20.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='tbldisplay']/tbody/tr"));
		System.out.println(rows.size());
		for (WebElement row : rows) {
			String texts = row.getText();
			System.out.println(texts);

			if (texts.equals("15-Week Session")) {
				WebElement oneRow = driver.findElement(By.xpath("//*[@id=\"tbldisplay\"]/tbody/tr[11]"));
				System.out.println("-------------------------");
				System.out.println(oneRow.getText());
				break;
			}

		}
		Thread.sleep(2000);
		driver.close();
	}

}
