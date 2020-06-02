package com.selenium.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		// Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
		// Click on “Others” link
		// Click on “Iframe” link
		// Click on the “Home” link inside the first frame
		// Verify “Syntax logo” is displayed in second frame
		// Quit browser
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Others").click();

		List<WebElement> dd = driver.findElementsByTagName("a");
		int si = dd.size();
		System.out.println(si);
		for (WebElement element : dd) {
			String allElements=element.getText();
			System.out.println(allElements);
			
			if (allElements.equals("Iframe")) {
				element.click();
				break;
			}
		}
		driver.switchTo().frame("FrameOne");
		driver.findElementByLinkText("Home").click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("FrameTwo");
		WebElement logo=driver.findElement(By.className("custom-logo"));
		boolean disp=logo.isDisplayed();
		System.out.println(disp);
		if(disp) {
			logo.click();
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
