package Extent_Report;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.TakeScreenshots;

public class TestReport2 {
	
	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;
	
	
	@Test
	public void VerifyUrl() throws InterruptedException
	{
		
		report = new ExtentReports ("D:\\eclipse\\java-oxygen\\eclipse\\Selenium-code\\SeleniumWebDriver-Scripts\\bin\\Reports\\TestReport3.html");
	
		logger = report.startTest("VerifyURLofPage");
//		System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\java-oxygen\\eclipse\\Third party drivers\\GeckoDriver\\geckodriver-v0.19.1-win64\\geckodriver.exe");
//		driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\java-oxygen\\eclipse\\Third party drivers\\ChromeDriver\\chromedriver_win32_2.34\\chromedriver.exe");
		driver = new ChromeDriver();
		
		logger.log(LogStatus.INFO, "Browser started");
		driver.get("http://test.vzone.vmokshagroup.com/");
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO,"Application is Up and running");
		WebElement user = driver.findElement(By.id("inputUsername"));
		
		//wait.until(ExpectedConditions.visibilityOf(user));
		
		user.sendKeys("alagappan.n@vmokshagroup.com");
		driver.findElement(By.id("inputPassword")).sendKeys("Power@1234");
		driver.findElement(By.id("btnSignIn")).click();
		logger.log(LogStatus.INFO,"Username and password has been passed and Click on Login");
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.urlContains("Inbox"));
		String CurrentUrl = driver.getCurrentUrl();
		Assert.assertTrue(CurrentUrl.contains("Inbox"));
		logger.log(LogStatus.PASS, "Application logged successfully and URL contians Inbox");
	}

@AfterMethod
public void tearDown(ITestResult testResult) throws InterruptedException
{

	
	if(testResult.getStatus() == ITestResult.FAILURE)
	{
		Thread.sleep(2000L);
		String Screenshot_Path = TakeScreenshots.capturescreenshot(driver, testResult.getName());
		String image= logger.addScreenCapture(Screenshot_Path);
		logger.log(LogStatus.FAIL, "URL path is incorret: " + image);
		//logger.addScreenCapture(image);
		
	}	
	report.endTest(logger);
	report.flush();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(3000L);
	driver.get("D:\\eclipse\\java-oxygen\\eclipse\\Selenium-code\\SeleniumWebDriver-Scripts\\bin\\Reports\\TestReport3.html");
	
	
	driver.quit();
}

	
}
