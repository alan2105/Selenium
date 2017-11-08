package com.ph.CrossbrowserTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ph.libraries.BaseMethods;

public class VerifyLandingPage {
	private static WebDriver driver;
	@Parameters("Browser")
	@BeforeClass
	public void BrowserSetUp(String browser) 
	{
		driver = BaseMethods.getDriverInstance(browser);
	}
	@Parameters({"Username","Password"})
	@Test
	public void TestCases(String username,String password) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		BaseMethods.getTitle();
		BaseMethods.Login(username, password);
		BaseMethods.Logout();
	}
	
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
}
