package com.gmg.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;


public class PiechartMouseOver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
  WebDriver driver;
  WebElement element;
  
  //To launch the browser
 // System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\Third party drivers\\geckodriver-v0.11.1-win64\\geckodriver.exe");
 // driver = new FirefoxDriver();
  System.setProperty("webdriver.ie.driver", "D:\\eclipse\\Third party drivers\\IEDriverServer_Win32.exe");
  driver = new InternetExplorerDriver();
  //System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Third party drivers\\chromedriver.exe");
  //driver = new ChromeDriver();
  //Navigate to application URL
  String appurl = "http://gartlandandmellina-stg.vmokshagroup.com/";
  driver.get(appurl);
  driver.manage().window().maximize();
  // Get Page Title
  String pageTitle = driver.getTitle();
  System.out.println("Page Title is: "+pageTitle); 
  Thread.sleep(3000);
  // Get the CurrentURL
  String pageUrl = driver.getCurrentUrl();
  System.out.println("Current Page URL: "+pageUrl);
  Thread.sleep(2000);
//Mouse actions on Manage.. menu
  Actions act = new Actions(driver);
  element=driver.findElement(By.xpath(".//*[@id='menu-item-144']/a"));
  act.moveToElement(element).build().perform();
  System.out.println("Mouse action happened");
  //Click management consulting menu
 driver.findElement(By.xpath(".//*[@id='menu-item-144']/a")).click();
 System.out.println("Page Title is: "+pageTitle);
 System.out.println("Current Page URL: "+driver.getCurrentUrl());
 Thread.sleep(2000);
 //Mouse over on PieChart
 element=driver.findElement(By.xpath(".//*[@id='myCanvas0']"));
 act.moveToElement(element).build().perform();
 System.out.println("Mouse overed on Piechart");
  Thread.sleep(3000); 
  //Quit the browser
  driver.quit();   
  
  
  
	}

}
