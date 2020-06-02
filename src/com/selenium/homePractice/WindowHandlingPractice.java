package com.selenium.homePractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumframework.com/Practiceform/");

		driver.findElement(By.id("button1")).click();
		String parentWindow = driver.getWindowHandle();
		System.out.println("parent window's id is : " + parentWindow);
		driver.close();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while (it.hasNext()) {
			String childWindow = it.next();
			Thread.sleep(2000);

			if (!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println("child window's id is : " + childWindow);
			}
		}

		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//strong[contains(text(),'Testing and ATDD')]"));
		boolean disp = element.isDisplayed();

		if (disp) {
			String text = element.getText();
			System.out.println(text);
		}

	}

}
