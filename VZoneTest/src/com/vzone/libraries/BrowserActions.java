package com.vzone.libraries;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserActions {

	public static WebDriver openBrowser(String browser)
	{
		for(String browsers:ConstantVariables.Browsers )
		{
		if(browser.equalsIgnoreCase(browsers))
		{
			System.setProperty(ConstantVariables.DrivevrKeys[0], ConstantVariables.ChromeDriver_Path);
			ConstantVariables.driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase(browsers))
		{
			System.setProperty(ConstantVariables.DrivevrKeys[1], ConstantVariables.FirefoxDriver_Path);
			ConstantVariables.driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase(browsers))
		{
			System.setProperty(ConstantVariables.DrivevrKeys[2], ConstantVariables.IEDriver_Path);
			ConstantVariables.driver = new InternetExplorerDriver();
		}
		ConstantVariables.driver.get(ConstantVariables.URL);
		ConstantVariables.driver.manage().window().maximize();
		
		}
		return ConstantVariables.driver;
	}
	public static void screenShot(String filename)
	{
		try {
			DateFormat  dateFormat = new SimpleDateFormat("dd-mm-yy h-m-s");
			Date currentDate = new Date();
			TakesScreenshot ts = (TakesScreenshot) ConstantVariables.driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File ("./Screenshots/"+filename+"_"+dateFormat.format(currentDate)+".png"));
			System.out.println("Screenshot Captured successfully");
		} 
		catch (IOException e) {
			
			System.out.print("Exception while taking screenshot "+e.getMessage());
		}
	}
	public static void closeBrowser()
	{
		ConstantVariables.driver.quit();
	}
	
}
