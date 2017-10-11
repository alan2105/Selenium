package com.vzone.crossbrowser;
import org.testng.annotations.Test;
import com.vzone.login.BaseClass;
import libaray.TakeScreenshots;

import org.testng.annotations.Parameters;

public class CrossBrowserTest extends BaseClass {
	String appurl="http://test.vzone.vmokshagroup.com/";
@Test 

//Here we will take this parameter from xml file.
@Parameters("Browser")

public void CBTest(String browser) throws InterruptedException
{
	if(browser.equalsIgnoreCase("Chrome"))
	{
		super.FirefoxSetUp();
		driver.get(appurl);
		Thread.sleep(3000);
		TakeScreenshots.capturescreen(driver, "VzoneInChrome");
		Thread.sleep(3000);
		
	}
	else if(browser.equalsIgnoreCase("Firefox"))
	{
		super.FirefoxSetUp();
		driver.get(appurl);
		Thread.sleep(3000);
		TakeScreenshots.capturescreen(driver, "VzoneInFirefox");
		Thread.sleep(3000);
	}
	else if (browser.equalsIgnoreCase("IE"))
	{
		super.IESetUp();
		driver.get(appurl);
		Thread.sleep(3000);
		TakeScreenshots.capturescreen(driver, "VzoneInInternetExplorer");
		Thread.sleep(3000);
	}

}


	

	

}
