package com.vzone.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageWithPF {
	
	WebDriver driver;
	
	public LoginPageWithPF(WebDriver ldriver)
	{
		this.driver = ldriver;
	
	}
	@FindBy(id = "inputUsername") WebElement username;
	@FindBy(how = How.ID,using="inputPassword") WebElement password;
	@FindBy(how = How.XPATH,using = ".//*[@id='btnSignIn']") WebElement sginIn_button;
	@FindBy(how = How.LINK_TEXT,using = "Forgot Password?") WebElement Forgetpassword_Link;
	@FindBy(how = How.ID,using="alagappan.n@vmokshagroup.com") WebElement User_Dropdown;
	@FindBy(how = How.ID,using="anchSignout") WebElement sginOut_button;
	
	
	public void LoginToVzone(String uid,String pass) throws Exception
	{
		username.sendKeys(uid);
		password.sendKeys(pass);
		password.click();
		sginIn_button.click();
		Thread.sleep(5000);
		User_Dropdown.click();
		Thread.sleep(3000);
		sginOut_button.click();
		Thread.sleep(3000);
		Forgetpassword_Link.click();
		
	}
}
