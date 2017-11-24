package com.vzone.CrossbrowserTest;


import com.vzone.libraries.PageElements;

public class SignIn_Actions {

	
	public static void Execute_SignIn(String username, String password)
	{
		try {
			PageElements.UserName_txtbx().sendKeys(username);
			PageElements.Password_txtbx().sendKeys(password);
			PageElements.SginIn_btn().click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public static void LogOut()
	{
		try {
			PageElements.Logout_btn().click();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
}
