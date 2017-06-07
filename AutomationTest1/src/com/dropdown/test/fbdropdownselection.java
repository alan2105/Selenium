package com.dropdown.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbdropdownselection {
	public static void main(String[] args) throws InterruptedException {

	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","D:\\eclipse\\Third party drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//driver.manage().window().maximize();
	
	WebElement Day_DropDown = driver.findElement(By.id("day"));
	WebElement Month_DropDown = driver.findElement(By.id("month"));
	WebElement Year_DropDown = driver.findElement(By.id("year"));

	Select Day_dd = new Select(Day_DropDown);
	Select Month_dd = new Select(Month_DropDown);
	Select Year_dd = new Select(Year_DropDown);
	
	//It will select Day 3 using Index
	Day_dd.selectByIndex(21);
	Thread.sleep(3000);
	//It will select Day 5 using Value
	Month_dd.selectByValue("5");
	Thread.sleep(3000);
	//It will select Day 8 using Visible Text
	Year_dd.selectByVisibleText("1991");
	

	}


}
