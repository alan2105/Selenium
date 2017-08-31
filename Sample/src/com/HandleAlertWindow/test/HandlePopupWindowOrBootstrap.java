package com.HandleAlertWindow.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandlePopupWindowOrBootstrap {
	WebDriver driver;
	String appurl = "https://www.goibibo.com/";

	@Test
	public void DemoPopup() throws Exception
	{
		//System.setProperty("webdriver.chrome.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/ChromeDriver/chromedriver_win32_2.29/chromedriver.exe");
		//driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/GeckoDriver/geckodriver-v0.16.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get(appurl);
		
		driver.findElement(By.id("get_sign_in")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("authiframe");
		Thread.sleep(3000);
		driver.findElement(By.id("authMobile")).sendKeys("9042190414");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.quit();
		
	}
}
