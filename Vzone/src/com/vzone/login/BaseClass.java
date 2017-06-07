package com.vzone.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	protected WebDriver driver;
	@BeforeClass
	public void ChromeSetUp()
	{
		Reporter.log("===== Chrome Browser session started=====", true);
		System.setProperty("webdriver.chrome.driver", "D:/eclipse/Third party drivers/ChromeDriver/chromedriver_win32_2.29/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}	

	public void FirefoxSetUp()
	{
		Reporter.log("===== Firefox Browser session started=====", true);
		System.setProperty("webdriver.gecko.driver", "D:/eclipse/Third party drivers/GeckoDriver/geckodriver-v0.16.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void  IESetUp()
	{
		Reporter.log("===== IE Browser session started=====", true);
		System.setProperty("webdriver.ie.driver", "D:/eclipse/Third party drivers/IEDriver/IEDriverServer_Win64.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@AfterClass
	public void CloseBrowser()
	{
		Reporter.log("=====Browser session end=====", true);
		driver.quit();
		
	}
}
