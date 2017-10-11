package com.vzone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By username = By.id("inputUsername");
	By password = By.xpath(".//input[@id='inputPassword']");
	By signinbutton = By.xpath(".//button[@id='btnSignIn']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void LoginToVzone (String uid, String pass)
	{
		driver.findElement(username).sendKeys(uid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(signinbutton).click();
		
	}
//	 public void typeUsername(String uid)
//	 {
//		 driver.findElement(username).sendKeys(uid);
//	 }
//	 
//	 
//	 public void typePass(String pass)
//	 {
//		 driver.findElement(password).sendKeys(pass);
//	 }
//	 
//	 public void onclickSign()
//	 {
//		 driver.findElement(signinbutton).click();
//	 }
}
