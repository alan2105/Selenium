package com.ph.libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseMethods {
	
	static WebDriver driver;
	
	public static WebDriver getDriverInstance (String browser) 
	{
		
		String appurl = "http://purplehome.client.web.test.s3-website-us-west-2.amazonaws.com/";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/ChromeDriver/chromedriver_win32_2.33/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appurl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Thread.sleep(5000);
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/GeckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(appurl);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Thread.sleep(5000);
		}
		else if (browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver","D:/eclipse/java-neon/eclipse/Third party drivers/IEDriver/IEDriverServer_Win32_3.6.0/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get(appurl);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Thread.sleep(5000);
		}
		
		return driver;
	}
	public static void getTitle()
	{
		String title = driver.getTitle();
		System.out.println("Title of the page "+title);
		String url = driver.getCurrentUrl();
		System.out.println("Current URL of the page "+url);
		screenshot.CaptureScreen(driver, "Landingpage");
	}
	public static void Login(String username, String password)
	{
		driver.findElement(By.xpath(".//*[@id='divNavbarMenuDataGrid']/div/ul/li/a")).click();
		driver.findElement(By.id("inputName")).sendKeys(username);
		driver.findElement(By.id("inputPassword")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='divLogSign']/form/div[3]/div[2]/button")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
