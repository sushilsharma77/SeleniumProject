package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
//		Go to facebook.com
//		Verify “Create a new account” is Displayed
//		Fill out First name, lastname, email, new password
//		Select your birthday from given dropdowns
//		Select gender and Click sign up

		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();

		WebElement signup = driver.findElementByLinkText("Sign Up");
		boolean isDis = signup.isDisplayed();
		System.out.println(isDis);

		driver.findElementById("u_0_m").sendKeys("John");
		driver.findElementById("u_0_o").sendKeys("Smith");
		driver.findElementById("u_0_r").sendKeys("7035075480");
		driver.findElementByName("reg_passwd__").sendKeys("John1234");

		WebElement months = driver.findElementByName("birthday_month");
		Select select = new Select(months);

		List<WebElement> allMonth = select.getOptions();
		System.out.println(allMonth.size());
		for (WebElement element : allMonth) {
			System.out.println(element.getText());
			select.selectByVisibleText("Jul");
		}
		WebElement days = driver.findElementByXPath("//select[@class='_5dba _8esg'][@title='Day']");
		Select selects = new Select(days);
		List<WebElement> allDays = selects.getOptions();
		for (WebElement element : allDays)
			System.out.println(element.getText());
		selects.selectByIndex(21);

		WebElement years = driver.findElementByName("birthday_year");
		Select selectYears = new Select(years);
		selectYears.selectByValue("1991");
		Thread.sleep(2000);
		WebElement sex = driver.findElementById("u_0_7");
		if (sex.isSelected()) {
			sex.clear();
			Thread.sleep(2000);

		}
		if (sex.isEnabled()) {
			sex.click();
		}

		driver.findElementById("u_0_13").click();

		Thread.sleep(3000);
        driver.close();

	}

}
