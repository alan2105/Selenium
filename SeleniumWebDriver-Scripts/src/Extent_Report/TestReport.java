package Extent_Report;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Libraries.TakeScreenshots;

public class TestReport {
	
	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;
	
	@Test
	public void VerifyUrl() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\java-oxygen\\eclipse\\Third party drivers\\GeckoDriver\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://test.vzone.vmokshagroup.com/");
		driver.findElement(By.id("inputUsername")).sendKeys("alagappan.n@vmokshagroup.com");
		driver.findElement(By.id("inputPassword")).sendKeys("Power@1234");
		driver.findElement(By.id("btnSignIn")).click();
		Thread.sleep(3000);
		String CurrentUrl = driver.getCurrentUrl();
		Assert.assertTrue(CurrentUrl.contains("Inbox"));
	}

@AfterMethod
public void tearDown(ITestResult testResult)
{
	try
	{
	
	if(testResult.getStatus() == ITestResult.FAILURE)
	{
		TakeScreenshots.capturescreenshot(driver, "FailedTestcase1");
		
	
		
	}
	}
	catch(Exception e)
	{
		System.out.println("Exception while taking scrteenshot" +e.getMessage());
	}
	driver.quit();
}

	
}
