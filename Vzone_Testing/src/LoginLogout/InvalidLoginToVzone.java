/**
 * 
 */
package LoginLogout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import libaray.TakeScreenshots;

/**
 * @author prasanna
 *
 */
public class InvalidLoginToVzone {

	WebDriver driver;
	
	@BeforeMethod
	public void SetUp()
	{
		//System.setProperty("webdriver.gecko.driver","C:/selenium documents/geckodriver.exe");
		//System.setProperty("webdriver.chorme.driver","C:/Users/POOJA/workspace/vzone testing/chromedriver.exe");
	    //driver=new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:/eclipse/Third party drivers/ChromeDriver/chromedriver_win32_2.29/chromedriver.exe");
		driver = new ChromeDriver();
	    //driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://test.vzone.vmokshagroup.com/");
	
	}
	@Test(description="Login for Invalidcredentials")
	public void invalidLogin()
	{
		driver.findElement(By.id("inputUsername")).sendKeys("abcd@vmokshagroup.com");
		
		driver.findElement(By.id("inputPassword")).sendKeys("Power@123456789");
		
		driver.findElement(By.id("btnSignIn")).click();
		
		TakeScreenshots.capturescreenshot(driver, "Error message");
		
		String ErrorMessage=driver.findElement(By.id("divAuthFailed")).getText();
		
		System.out.println("error message is "+ErrorMessage);
	}
@AfterMethod()
public void teardown()
{
	driver.quit();
}
}
 