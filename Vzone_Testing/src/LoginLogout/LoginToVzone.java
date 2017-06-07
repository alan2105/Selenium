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

public class LoginToVzone 
{
	
	WebDriver driver;
	
	@BeforeMethod
	public void SetUp()
	{  //System.setProperty("webdriver.gecko.driver","C:/selenium documents/geckodriver.exe");
		//System.setProperty("webdriver.chorme.driver","C:/Users/POOJA/workspace/vzone testing/chromedriver.exe");
	    //driver=new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:/eclipse/Third party drivers/ChromeDriver/chromedriver_win32_2.29/chromedriver.exe");
		driver = new ChromeDriver();
		
	    //driver=new FirefoxDriver();
	    
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://test.vzone.vmokshagroup.com/");
		
		TakeScreenshots.capturescreenshot(driver, "Home Page");
		String imagetitle =driver.findElement(By.xpath(".//img[@src='vzone-blue.png']")).getText();
		
		System.out.println("text on the image is "+imagetitle);
	}
	@Test(description="Login Functionality")
	public void  LoginToTestApplication() throws Exception
	{
		driver.findElement(By.id("inputUsername")).sendKeys("poojav@vmokshagroup.com");
		
		driver.findElement(By.id("inputPassword")).sendKeys("Power@1234");
		
		driver.findElement(By.id("btnSignIn")).click();
		
		Thread.sleep(3000);
		
		//String Imagetext=driver.findElement(By.xpath("//img[contains(@src='vzone-blue.png')]")).getText();
		
		//System.out.println("content on the image is "+Imagetext);
		
		
	}
@AfterMethod
public void teardown()
{
driver.quit();	
}
	
	
	
	
}
