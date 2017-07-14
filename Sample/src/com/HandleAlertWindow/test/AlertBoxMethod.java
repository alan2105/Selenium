package com.HandleAlertWindow.test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class AlertBoxMethod {

	public static void main(String[] args) {
			

	}
	
	public static void Alert_Accept(WebDriver iDriver)
	{
		if(isAlertPresent(iDriver))
		{
			Alert alt = iDriver.switchTo().alert();
			System.out.print(alt.getText());
			alt.accept();
		}
	}
	
	
	public static void Alert_Dismiss(WebDriver iDriver)
	{
		if(isAlertPresent(iDriver))
		{
		Alert alt = iDriver.switchTo().alert();
		System.out.print(alt.getText());
			alt.dismiss();
		}
	}
	
	
	public static boolean isAlertPresent(WebDriver iDriver)
	{
		try
		{
			iDriver.switchTo().alert();
			return true;
		}
		catch(NoAlertPresentException ex)
		{
			return false;
		}
	}

}
