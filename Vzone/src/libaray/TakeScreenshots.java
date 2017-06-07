package libaray;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;


public class TakeScreenshots {
	
	public static void capturescreen (WebDriver driver, String ScreenShotname)
	{
		try
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./Screenshots/"+ScreenShotname+".png"));
			System.out.println("ScreenShot Captured");
		}
catch(Exception e)
		{
	System.out.println("Exception while taking screenshot" + e.getMessage());
		}

	}

}
