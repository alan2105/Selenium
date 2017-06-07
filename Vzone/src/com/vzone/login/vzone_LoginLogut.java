package com.vzone.login;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.Reporter;
import libaray.TakeScreenshots;

public class vzone_LoginLogut extends BaseClass {
	
	@Test(description="This script will perform vaild Credentials")
	public void LoginWithVaildCredentials() throws InterruptedException
	{
		Reporter.log("========Application LoggingIn=========", true);
		driver.get("http://test.vzone.vmokshagroup.com/");
		Thread.sleep(3000);
		TakeScreenshots.capturescreen(driver, "LoginPage");
		driver.findElement(By.id("inputUsername")).sendKeys("alagappan.n@vmokshagroup.com");
		driver.findElement(By.id("inputPassword")).sendKeys("Power@1234");
		driver.findElement(By.id("btnSignIn")).click();
		Thread.sleep(3000);
		
		String pageName = driver.findElement(By.id("DASHBOARD")).getText();
		System.out.println("Currently opend page is" +pageName);
		
		Reporter.log("========Application LoggingOut=========", true);
		driver.findElement(By.xpath("*//a[@class='dropdown-toggle']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("anchSignout")).click();
		Thread.sleep(3000);
		
	}
	@Test(priority= 1,description="This script will perform Invaild Credentials")
	public void InvaildCredentials() throws InterruptedException
	{
		driver.get("http://test.vzone.vmokshagroup.com/");
		driver.findElement(By.id("inputUsername")).sendKeys("alagappan.n@vmokshagroup.com");
		driver.findElement(By.id("inputPassword")).sendKeys("Power1234");
		driver.findElement(By.id("btnSignIn")).click();	
		Thread.sleep(3000);
		TakeScreenshots.capturescreen(driver, "LoginErorr");
		String errorMessage = driver.findElement(By.xpath(".//*[@class='alert alert-danger']")).getText();
		System.out.println("Error message is " +errorMessage);
		Thread.sleep(3000);
		
	}
	
}
