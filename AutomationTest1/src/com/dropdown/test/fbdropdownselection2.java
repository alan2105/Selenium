package com.dropdown.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbdropdownselection2 {
	public static void main(String[] args) throws InterruptedException {

	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","D:\\eclipse\\Third party drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement Day_DropDown = driver.findElement(By.id("day"));
	WebElement Month_DropDown = driver.findElement(By.id("month"));
	WebElement Year_DropDown = driver.findElement(By.id("year"));
	
	

	Select Day_dd = new Select(Day_DropDown);
	Select Month_dd = new Select(Month_DropDown);
	Select Year_dd = new Select(Year_DropDown);
	
	WebElement Selected_day = Day_dd.getFirstSelectedOption();
	WebElement Selected_month = Month_dd.getFirstSelectedOption();
	WebElement Selected_year = Year_dd.getFirstSelectedOption();
	
	System.out.println("Before selected Day is " +Selected_day.getText());
	System.out.println("Before selected Month is " +Selected_month.getText());
	System.out.println("Before selected Year is " +Selected_year.getText());
	
	//It will select Day 3 using Index
	Day_dd.selectByIndex(21);
	Thread.sleep(3000);
	//It will select Day 5 using Value
	Month_dd.selectByValue("5");
	Thread.sleep(3000);
	//It will select Day 8 using Visible Text
	Year_dd.selectByVisibleText("1991");
	
	WebElement Selected_day1 = Day_dd.getFirstSelectedOption();
	WebElement Selected_month1 = Month_dd.getFirstSelectedOption();
	WebElement Selected_year1 = Year_dd.getFirstSelectedOption();
	
	System.out.println("After selected Day is " +Selected_day1.getText());
	System.out.println("After selected Month is " +Selected_month1.getText());
	System.out.println("After selected Year is " +Selected_year1.getText());
	}

}
