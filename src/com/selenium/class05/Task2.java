package com.selenium.class05;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {

	public static void main(String[] args) {
		//Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
		//Click on “Input Forms” links..Click on “Select Dropdown List” links
		//Select value from “Select List Demo” section
	    //Verify value has been selected
		//Select 4 options from “Multi Select List Demo”
		//Deselect 1 of the option from the dd and Quit browser
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		WebElement element=driver.findElementByClassName("dropdown-toggle");
		element.click();
		Select select=new Select(element);
		
		


	}

}
