package com.googlesearch.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class gSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	    WebDriver driver;
		//System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\Third party drivers\\geckodriver.exe");
		//driver =new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Third party drivers\\chromedriver.exe");
		//driver = new ChromeDriver();
	    
	    System.setProperty("webdriver.ie.driver", "D:\\eclipse\\Third party drivers\\IEDriverServer_Win32.exe");
	    driver = new InternetExplorerDriver();
	
        driver.get("https://www.google.co.in");
        //Thread.sleep(3000);
        driver.findElement(By.id("lst-ib")).sendKeys("Webdriver");
       // Thread.sleep(3000);
        driver.findElement(By.id("_fZl")).click();
	
	}

}
