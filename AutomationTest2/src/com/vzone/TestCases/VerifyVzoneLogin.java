package com.vzone.TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.vzone.pages.LoginPage;

public class VerifyVzoneLogin {
	
	WebDriver driver;
	String appurl = "http://test.vzone.vmokshagroup.com/";
	
	@Test
	public void VerifyLogin()
	{
		System.setProperty("webdriver.chrome.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/ChromeDriver/chromedriver_win32_2.29/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appurl);
		driver.manage().window().maximize();
		LoginPage login = new LoginPage(driver);
		
		login.LoginToVzone("alagappan.n@vmokshagroup.com", "Power@1234");
		
//		login.typeUsername("alagappan.n@vmokshagroup.com");
//		login.typePass("Power@1234");
//		login.onclickSign();
		
		//driver.quit();
	}
	

}
