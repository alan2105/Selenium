package Libraries;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class TakeScreenshots
{
	public static void capturescreenshot(WebDriver driver,String Screenshotname)
	{
		try 
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			File source=ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source, new File("./Screenshots/"+Screenshotname+".png"));
			
			System.out.println("screenshot is captured");
		} 
		catch (Exception e) 
		{
			System.out.println("exception while taking screenshot is "+e.getMessage());

		}



	}


}
