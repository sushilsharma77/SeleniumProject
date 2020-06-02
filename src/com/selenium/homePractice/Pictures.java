package com.selenium.homePractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pictures {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	    WebElement searchBox=driver.findElement(By.xpath("//input[@name='q']"));
	    searchBox.sendKeys("iphone");
	    
	    driver.findElement(By.xpath
	    		("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]")).click();
	    TakesScreenshot ts=(TakesScreenshot)driver;
	   File file= ts.getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(file, new File("screenshots/google/imgage.png"));
	   
	   Thread.sleep(3000);
	   driver.close();
	   
	    
		

	}

}
