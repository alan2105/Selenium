package basic_scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IsElementPresent {
	WebDriver driver;
	WebElement ele;
	String Emsg;
	String appurl = "http://store.demoqa.com/wp-login.php?action=register";
	@BeforeTest
	public void BrowserSetup()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/ChromeDriver/chromedriver_win32_2.29/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void verifyErrormessage() throws InterruptedException
	{
		driver.get(appurl);
		driver.findElement(By.cssSelector("#user_login")).sendKeys("");
		driver.findElement(By.cssSelector("#wp-submit")).click();
		Thread.sleep(3000);
		IsElementPresent obj = new IsElementPresent();
		obj.isElementPresent(driver, Emsg);
	}
	
	private boolean isElementPresent(WebDriver driver,String Emsg)
	{

	
	try{
		WebElement ele = driver.findElement(By.cssSelector("#login_error"));
		String error = ele.getText();
		System.out.println("Element is present:"+error);
		return true;
	}
	catch(Exception e)
	
	{
		System.out.println("Element is not present");
		return false;
	}					
	}
	
	
	@AfterTest
	public void TearDown()
	{
		driver.quit();
	}
	
}
