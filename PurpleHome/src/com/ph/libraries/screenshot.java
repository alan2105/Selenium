package com.ph.libraries;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class screenshot {
	
	public static void CaptureScreen(WebDriver driver,String filename)
	{
		try {
			DateFormat  dateFormat = new SimpleDateFormat("dd-mm-yy h-m-s");
			Date currentDate = new Date();
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File ("./Screenshots/"+filename+"_"+dateFormat.format(currentDate)+".png"));
			System.out.println("Screenshot Captured successfully");
		} 
		catch (IOException e) {
			
			System.out.print("Exception while taking screenshot "+e.getMessage());
		}

			
		}
	}


