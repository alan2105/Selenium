package com.vzone.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import com.vzone.pages.LoginPageWithPF;

import helper.BrowserFactory;

public class VerifyLogin {
	
	WebDriver driver;
	
	@Test
	public void checkVaildUser() throws Exception{
		
		driver = BrowserFactory.StartBrowser("firefox", "http://test.vzone.vmokshagroup.com/");
		
		LoginPageWithPF login_page = PageFactory.initElements(driver,LoginPageWithPF.class);
		
		
			login_page.LoginToVzone("alagappan.n@vmokshagroup.com", "Power@1234");

		driver.quit();
	}
	

}
