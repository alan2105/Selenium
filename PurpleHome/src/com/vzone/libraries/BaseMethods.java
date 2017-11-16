package com.vzone.libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseMethods {
	
	static WebDriver driver;
	static String CurrentUrl;
	static String appurl = "http://test.vzone.vmokshagroup.com/";
	
	public static WebDriver getDriverInstance (String browser) 
	{
		
		
		
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
		CurrentUrl = driver.getCurrentUrl();
		System.out.println("Current URL of the page "+CurrentUrl);
		screenshot.CaptureScreen(driver, "Landingpage");
	}
	public static void Login(String username, String password) throws InterruptedException 
	{
		
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.xpath(".//*[@id='divNavbarMenuDataGrid']/div/ul/li/a")).click();
		driver.findElement(By.id("inputName")).sendKeys(username);
		driver.findElement(By.id("inputPassword")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='divLogSign']/form/div[3]/div[2]/button")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.urlContains(appurl+"dashboard"));
		CurrentUrl = driver.getCurrentUrl();
		screenshot.CaptureScreen(driver, "LoginPage");
		}

	public static void Logout()
	{
		
		driver.findElement(By.xpath("//A[@id='alagappan.n@vmokshagroup.com']")).click();
		driver.findElement(By.id("anchSignout")).click();
		CurrentUrl = driver.getCurrentUrl();
		System.out.println("Logged out successfully and the current URL is : " +CurrentUrl);
	}
}
