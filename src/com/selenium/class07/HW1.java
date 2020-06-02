package com.selenium.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

	public static void main(String[] args) throws InterruptedException {
//		Open chrome browser
//		Go to “https://the-internet.herokuapp.com/”
//		Click on “Click on the “Dynamic Controls” link
//		Select checkbox and click Remove
//		Click on Add button and verify “It's back!” text is displayed   
//		Close the browser 
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Dynamic Controls")).click();
		WebElement element=driver.findElement(By.xpath("//input[@type='checkbox']"));
		boolean select=element.isSelected();
		if(select) {
			element.clear();
		}else {
			element.click();
		}
		driver.findElement(By.xpath("//button[@autocomplete='off'][@onclick='swapCheckbox()']")).click();
		//Thread.sleep(5000);
		WebElement gone=driver.findElement(By.xpath("//p[contains(text(),'gone')]"));
		
		boolean dis=gone.isDisplayed();
		System.out.println(dis);
		String text=gone.getText();
		System.out.println(text);
		
		

	}

}
