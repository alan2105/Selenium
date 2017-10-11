package com.gmg.test;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class mouse_over {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Third party drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	//System.setProperty("webdriver.ie.driver", "D:\\eclipse\\Third party drivers\\IEDriverServer_Win32.exe");
   // driver = new InternetExplorerDriver();
	
	//System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\Third party drivers\\geckodriver.exe");
	//driver =new FirefoxDriver();
	
    // maximize the screen
	driver.manage().window().maximize();
	
	// Url of application
	driver.get("http://gartlandandmellina-stg.vmokshagroup.com");
	
	String currenturl= driver.getCurrentUrl();
	System.out.println("the current url of the page is "+currenturl);
	Thread.sleep(3000);

	//Action class
	WebElement menu = driver.findElement(By.xpath(".//*[@id='menu-item-144']/a"));
    Thread.sleep(3000);
	Actions act1 = new Actions(driver);
	act1.moveToElement(menu).click().build().perform();
	Thread.sleep(3000);
	
	System.out.println("dropdown opened successfully");
	//Click the Management consulting link
	
	//System.out.println("current url of the page is "+driver.getCurrentUrl()); 
	//Thread.sleep(3000);
	//WebElement menu2 = driver.findElement(By.xpath(".//*[@id='menu-item-144']/a"));
	//driver.findElement(By.xpath(".//*[@id='menu-item-144']/a")).click();
	//Actions act2 = new Actions(driver);
	//act1.moveToElement(menu).build().perform();
	//Thread.sleep(3000);
	//List<WebElement> submenu1 = driver.findElements(By.xpath(".//*[@id='menu-item-185']/a"));
	
	//for(WebElement ele : submenu1)
	//{
		//if(ele.getText().equals(submenu1))
	//	{
			//ele.click();
			//System.out.println("current url of the page is "+driver.getCurrentUrl());
			//return;
	//	}
	//}
	System.out.println("current url of the page is "+driver.getCurrentUrl()); 
	Thread.sleep(3000);
	driver.close();
		}
	}

