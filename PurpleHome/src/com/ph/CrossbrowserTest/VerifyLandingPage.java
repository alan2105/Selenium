package com.ph.CrossbrowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class VerifyLandingPage {
	
	static WebDriver driver;
	static String title,url;
	@Test
	public static void getTitle() throws InterruptedException
	{
		driver.findElement(By.id("inputUsername")).sendKeys("alagappanmca21@gmail.com");
	}

}
