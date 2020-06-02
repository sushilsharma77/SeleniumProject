package com.selenium.configClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginToGoogle {

	public static void main(String[] args) throws IOException, InterruptedException {
		String file = System.getProperty("user.dir") + "\\configs\\configuration.properties";
		FileInputStream fis = new FileInputStream(file);
		Properties pro = new Properties();
		pro.load(fis);

		String browser = pro.getProperty("browser");
		WebDriver driver = null;

		switch (browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		}
		driver.get(pro.getProperty("url"));
		Thread.sleep(4000);
		driver.close();

	}

}
