package com.uploadFunctions.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleMultipleWindows {
	
	WebDriver driver;
	String appurl = "http://toolsqa.com/automation-practice-form/";
	@Test
	public void MultipleFileUpload() throws Throwable
	{
		//Setup the browser and open the test application 
		System.setProperty("webdriver.chrome.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/ChromeDriver/chromedriver_win32_2.29/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appurl);
		Thread.sleep(2000);
		//Scroll the page
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,350)");
		//Click the browse button
		driver.findElement(By.id("photo")).click();
		//Pass parameter to get the files at runtime
		Runtime.getRuntime().exec("D:\\QA Documents\\Common\\437212-WebApplicationTesting.docx");
		//Close the browser
	}

}
