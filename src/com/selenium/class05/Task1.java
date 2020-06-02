package com.selenium.class05;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		// Open chrome browser Go to “http://amazon.com/”
	    //Verify how many department options available.Print each department 
	   //Select Computers.Quite
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://amazon.com/");
		
		WebElement deparments=driver.findElementById("searchDropdownBox");
		deparments.click();
		Select select=new Select(deparments);
		List<WebElement>options=select.getOptions();
		System.out.println(options.size());
		
		for(WebElement elem:options) {
			System.out.println(elem.getText());
		}
			Thread.sleep(2000);
			driver.close();


	}

}
