package com.ph.CrossbrowserTest;

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
	public void TestCases(String username,String password)
	{
		BaseMethods.getTitle();
		BaseMethods.Login(username, password);
	}
	
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
}
