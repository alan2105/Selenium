package com.datepicker.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class datepicker_JSexecutor {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		//WebElement ele;
	//To launch the browser
//		System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\Third party drivers\\geckodriver-v0.15.0-win64\\geckodriver.exe");
//		driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Third party drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
//		System.setProperty("webdriver.ie.driver", "D:\\eclipse\\Third party drivers\\IEDriverServer_Win32.exe");
//		driver = new InternetExplorerDriver();
		Thread.sleep(2000);
		// Navigate the application
		
	driver.manage().window().maximize();
	driver.get("http://demoqa.com/datepicker/");
	Thread.sleep(2000);
	//Get Page Title and URL
	System.out.println("Page Title is "+driver.getTitle());
	System.out.println("Page Current URL is "+driver.getCurrentUrl());
	Thread.sleep(2000);
	//Click on Datepicker field
    driver.findElement(By.id("datepicker1")).click();
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.getElementById('datepicker1').value ='March 1, 2017'");
	Thread.sleep(6000);
	System.out.println("Date was entered");
	js.executeScript("scroll(0, 500);");
	Thread.sleep(3000);
	js.executeScript("scroll(0, -500);");
	Thread.sleep(3000);
	driver.quit();
	
	}
	
}
