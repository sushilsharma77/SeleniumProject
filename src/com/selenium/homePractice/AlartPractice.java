package com.selenium.homePractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlartPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		WebElement firstAlart=driver.findElement(By.xpath("//button[text()='Alert Box']"));
		firstAlart.click();
		
		Thread.sleep(5000);
		Alert alart=driver.switchTo().alert();
		alart.accept();
		
		WebElement secondAlart=driver.findElement(By.xpath("//button[@id='timingAlert']"));
		secondAlart.click();
		Thread.sleep(5000);
		
		Alert alert2=driver.switchTo().alert();
		String text=alert2.getText();
		System.out.println(text);
		alert2.accept();
		
		driver.close();


	}

}
