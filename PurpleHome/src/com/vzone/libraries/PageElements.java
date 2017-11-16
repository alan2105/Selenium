package com.vzone.libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageElements {
	
	public static WebDriver driver;
	private static WebElement ele = null;
	
	
	public static WebElement UserName_txtbx()throws Exception
	{
		try
		{
		ele = driver.findElement(By.id("inputUsername"));
		}
		catch(Exception e)
		{
			System.out.println("Username textbox or its elemnet is not found in page");
		}
		return ele;
	}
	public static WebElement Password_txtbx()throws Exception
	{
		try
		{
		ele = driver.findElement(By.id("inputPassword"));
		}
		catch(Exception e)
		{
			System.out.println("Password textbox or its elemnet is not found in page");
		}
		return ele;
	}
	public static WebElement SginIn_btn()throws Exception
	{
		try
		{
		ele = driver.findElement(By.id("btnSignIn"));
		}
		catch(Exception e)
		{
			System.out.println("Button or its elemnet is not found in page");
		}
		return ele;
	}
	public static WebElement Clear_btn()throws Exception
	{
		try
		{
		ele = driver.findElement(By.id("btnClear"));
		}
		catch(Exception e)
		{
			System.out.println("Button or its elemnet is not found in page");
		}
		return ele;
	}
	public static WebElement ForgotPassword_link()throws Exception
	{
		try
		{
		ele = driver.findElement(By.linkText("Forgot Password?"));
		}
		catch(Exception e)
		{
			System.out.println("FrgtPwd Link or its elemnet is not found in page");
		}
		return ele;
	}
	public static WebElement ForgotPassword_Email()throws Exception
	{
		try
		{
		ele = driver.findElement(By.id("txtEmail_Id"));
		}
		catch(Exception e)
		{
			System.out.println("FrgtPwd Email_txtbx or its elemnet is not found in page");
		}
		return ele;
	}
	public static WebElement ForgotPassword_Sendbtn()throws Exception
	{
		try
		{
		ele = driver.findElement(By.id("btnSend"));
		}
		catch(Exception e)
		{
			System.out.println("FrgtPwd Send_btn or its elemnet is not found in page");
			throw(e);
		}
		return ele;
	}
	public static WebElement ForgotPassword_Cancelbtn()throws Exception
	{
		try
		{
		ele = driver.findElement(By.xpath("//BUTTON[@type='button'][text()='×']"));
		}
		catch(Exception e)
		{
			System.out.println("FrgtPwd Cancel_btn or its elemnet is not found in page");
		}
		return ele;
	}
}
