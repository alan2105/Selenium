package com.datadrivenframework.test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ddf1 {

	WebDriver driver;
	String appurl = "http://test.vzone.vmokshagroup.com/";
	@Test(dataProvider = "testdata")
	public void TestVzoneLogin(String uname,String pass) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/GeckoDriver/geckodriver-v0.16.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "D:eclipse/java-neon/eclipse/Third party drivers/ChromeDriver/chromedriver_win32_2.29/chromedriver.exe");
		//driver = new ChromeDriver();
		driver.get(appurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("inputUsername")).sendKeys(uname);
		driver.findElement(By.id("inputPassword")).sendKeys(pass);
		driver.findElement(By.xpath(".//*[@id='btnSignIn']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.id("btnClear")).click();
	
		System.out.println("Application Title is:" + driver.getTitle());
		
		Assert.assertTrue(driver.getTitle().contains("Dashboard"),"User not able to login. Invaild Credentials");
		
		System.out.println("Page title verified. User able to login successfully");
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	@DataProvider (name = "testdata")
	public Object[][] TestDataFeed()
	{
		Object[][] data = new Object[2][2];
		
		data[0][0] = "alagappan.n@vmokshagroup.com";
		data[0][1] = "Power@1234";
		
		data[1][0] = "alagappan.n@vmokshagroup.com";
		data[1][1] = "alan2119";
		
		return data;
		
	}
}
