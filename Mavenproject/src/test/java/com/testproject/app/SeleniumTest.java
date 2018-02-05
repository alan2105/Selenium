package com.testproject.app;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test
	public void BrowserSetup()
	{
		System.out.println("Browser setup done!");
	}
	@Test
	public void SignIn()
	{
		System.out.println("Navigated to Sigin In page");
	}
}
