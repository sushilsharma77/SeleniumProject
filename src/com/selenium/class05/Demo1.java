package com.selenium.class05;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		String url = "http://166.62.36.207/syntaxpractice/basic-select-dropdown-demo.html";
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
		WebElement element = driver.findElementById("select-demo");
		Select select = new Select(element);
		select.selectByIndex(4);
		select.selectByVisibleText("Monday");
		select.selectByValue("Sunday");

		List<WebElement> options = select.getOptions();
		for (WebElement ele : options) {
			System.out.println(ele.getText());
		}
		driver.close();
	}

}
