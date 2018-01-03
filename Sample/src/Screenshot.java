import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	WebDriver driver;
	
	public  void capture()
	{
		try
		{
		int count = 1;
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File ("./Screenshots/test"+ count));
		count++;
		}
		catch(IOException e)
		{
			System.out.print("Exception while taking screenshot "+e.getMessage());
		}
	}
}
