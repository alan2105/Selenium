package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

	static WebDriver driver;
	
	
	public static WebDriver StartBrowser(String browsername,String appurl){
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/ChromeDriver/chromedriver_win32_2.29/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/GeckoDriver/geckodriver-v0.16.0-win64/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/IEDriver/IEDriverServer_Win32_3.5.1/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(appurl);
		driver.manage().window().maximize();
		return driver;
	}
}
