package com.ph.libraries;

import org.openqa.selenium.By;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass {

	static WebDriver driver;
	static String appUrl = "http://test.vzone.vmokshagroup.com/";
	@Parameters("Browser")
	@BeforeClass
	public static void BrowserSetUp(String browser) throws Exception
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/ChromeDriver/chromedriver_win32_2.29/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appUrl);
		Thread.sleep(5000);
		
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
		System.setProperty("webdriver.gecko.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/GeckoDriver/geckodriver-v0.16.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(appUrl);
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
		System.setProperty("webdriver.ie.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/IEDriver/IEDriverServer_Win32_3.5.1/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get(appUrl);	
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
	}
	
	
	@Test
	public static void getTitle() throws InterruptedException
	{
		driver.findElement(By.id("inputUsername")).sendKeys("alagappanmca21@gmail.com");
	}
	
	@AfterClass

	public void TearDown()
	{
		driver.quit();
	}

}
