package com.vzone.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.vzone.actions.SignIn_Actions;
import com.vzone.libraries.BrowserActions;

import com.vzone.libraries.PageElements;


public class SignIn_TestCases {
	@Parameters("Browser")
	@BeforeMethod
	public static void BeforeExcute(String browser)
	{
		BrowserActions.openBrowser(browser);
	}
	
	@Parameters({"Username","Password"})
	@Test
	public static void ExcuteTestCase(String Username,String Password) throws Exception
	{
		if(PageElements.User_DropDown().isDisplayed())
		{
		SignIn_Actions.LogOut();
		}
		else
		{
			SignIn_Actions.Execute_SignIn(Username, Password);
		}
	}
@AfterMethod
public void AfterExcute()
{
	BrowserActions.closeBrowser();
}
}
