package com.datadrivenframework.test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import lib.ExcelFileConfig;

public class ddf1 {

	WebDriver driver;
	String appurl = "http://biomagnetictherapy-stg.us-west-2.elasticbeanstalk.com/Dashboard";
	@Test(dataProvider = "testdata")
	public void TestVzoneLogin(String uname,String pass) throws Exception 
	{
		//System.setProperty("webdriver.gecko.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/GeckoDriver/geckodriver-v0.16.0-win64/geckodriver.exe");
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:eclipse/java-neon/eclipse/Third party drivers/ChromeDriver/chromedriver_win32_2.29/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("inputUsername")).sendKeys(uname);
		driver.findElement(By.id("inputPassword")).sendKeys(pass);
		driver.findElement(By.xpath(".//*[@id='btnSignIn']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.id("btnClear")).click();
		
	
		System.out.println("Application Title is:" + driver.getTitle());
		
		Assert.assertTrue(driver.getCurrentUrl().contains("Dashboard"),"User not able to login. Invaild Credentials");
	
		System.out.println("Page title verified. User able to login successfully");
		
		Thread.sleep(2000);	
	}
	
	@AfterMethod
	public void TearDown() {

		driver.close();
	}
	@DataProvider (name = "testdata")
	public Object[][] TestDataFeed() throws Exception
	
	{
		ExcelFileConfig config = new ExcelFileConfig("C:/Users/alagappan.n/git/Selenium-code/Sample/TestData/testdata1.xlsx");
		
		int rows = config.getRowCount(0);
		Object[][] data = new Object[rows][2];
		
		for(int i=1;i<rows;i++)
		{
			data[i][0] = config.getData(0, i, 0);
			data[i][1] = config.getData(0, i, 1);
					
		}
		return data;
	}
	
	
	
}
