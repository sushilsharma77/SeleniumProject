package com.selenium.class10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class TC2 {

	public static void main(String[] args) throws InterruptedException {
//		TC 2: Upload file and Take Screenshot
//		Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
//		Upload file
//		Verify file got successfully uploaded and take screenshot

		String filePath = "C:\\Users\\sushi\\Documents\\test.xlsx";

		String url = "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload";
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='gwt-FileUpload']")).sendKeys(filePath);
		Thread.sleep(2000);
		WebElement uploadFile = driver.findElement(By.className("gwt-Button"));
		uploadFile.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(file, new File("screenshots/testcases/test1.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Thread.sleep(3000);
		driver.close();

	}

}
