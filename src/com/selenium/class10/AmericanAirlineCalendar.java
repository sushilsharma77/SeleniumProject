package com.selenium.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class AmericanAirlineCalendar {
	/*
	 * TC 1: Calendar headers and rows verification Open chrome browser Go to
	 * �https://www.aa.com/homePage.do� Enter From and To Select departure as July
	 * 14 of 2020 Select arrival as November 8 of 2020 Close browser
	 */

	public static void main(String[] args) throws InterruptedException {

		// Open chrome browser Go to �https://www.aa.com/homePage.do�
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aa.com/homePage.do");
		driver.manage().window().fullscreen();

		// Enter from and To Airports
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).clear();
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys("IAD", Keys.TAB);
		driver.findElement(By.xpath("//input[contains(@id,'Form.destinationAirport')]")).clear();
		driver.findElement(By.xpath("//input[contains(@id,'Form.destinationAirport')]")).sendKeys("JFK");

		// click on the calendar and select month and year
		driver.findElement(By.xpath("//input[@id='aa-leavingOn']")).click();

		boolean flag = false;

		while (!flag) {

			String dMonth = driver.findElement(By.xpath("//div[contains(@class,'ui-corner-left')]/div")).getText();
			if (dMonth.equals("July 2020")) {
				List<WebElement> depCells = driver.findElements(
						By.xpath("//div[contains(@class,'ui-corner-left')]/following-sibling::table/tbody/tr/td"));

				for (WebElement cell : depCells) {
					String cellText = cell.getText();

					if (cellText.equals("14")) {
						cell.click();
						flag = true;
						break;
					}
				}

			} else {
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
			
			Thread.sleep(1000);
		}
		
		

		driver.findElement(By.xpath("//input[@id='aa-returningFrom']")).click();
		
		flag=false;
		
		while (!flag) {

			String rMonth = driver.findElement(By.xpath("//div[contains(@class,'ui-corner-left')]/div")).getText();
			if (rMonth.equals("November 2020")) {

				List<WebElement> returnCells = driver.findElements(
						By.xpath("//div[contains(@class,'ui-corner-left')]/following-sibling::table/tbody/tr/td"));

				for (WebElement returnCell : returnCells) {
					String returnText=returnCell.getText();
					if(returnText.equals("8")) {
						returnCell.click();
						flag=true;
						break;
					}
				}

			}else{
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
			Thread.sleep(1000);

		}

		Thread.sleep(5000);
		driver.quit();

	}

}