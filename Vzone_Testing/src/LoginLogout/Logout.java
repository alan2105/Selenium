/**
 * 
 */
package LoginLogout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * @author pooja
 *
 */
public class Logout {
	WebDriver driver;
	
	
	@Test(description="Logout functionality")
	public void LogoutFunction()
	{
	System.setProperty("webdriver.gecko.driver","C:/selenium documents/geckodriver.exe");
	
	driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	driver.get("http://test.vzone.vmokshagroup.com/");
	
    driver.findElement(By.xpath(".//*[@id='poojaV@vmokshagroup.com']/strong")).click();
	}
	
	@AfterMethod
	public void teardown()
	{
    driver.quit();
    
    System.out.println("logout appliation successfully");
}}
