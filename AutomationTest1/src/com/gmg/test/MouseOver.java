package com.gmg.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver  driver;
		// launch the browser
		//System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Third party drivers\\chromedriver.exe");
		//driver= new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\Third party drivers\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		driver = new  FirefoxDriver();
		
	// navigate to application url
		String appurl= "http://gartlandandmellina-stg.vmokshagroup.com/";
		driver.get(appurl);
		// get the page text
		// get text of the page
		String pageText= driver.findElement( By.xpath(".//*[@id='gmg-header']/h1/a")).getText();
		System.out.println("Text on the page is ::"+pageText);
		Thread.sleep(4000);
	
		//Mouse action on management consulting
		Actions manage= new Actions(driver);
		
		WebElement Element=driver.findElement(By.xpath(".//*[@id='menu-item-144']/a"));
		System.out.println("it is coming to this line");
		manage.moveToElement(Element).click().build().perform();
		
		// mouse action on wealth and and management
		
		//Element=driver.findElement(By.xpath(".//*[@id='menu-item-185']/a"));
		//manage.moveToElement(Element).click().build().perform();
		
		//String wealthmag=driver.findElement(By.xpath(".//*[@id='primary']/div/div/div/h1")).getText();
		// identification of the element of welath
	//System.out.println("text of the page is::"+wealthmag);
	
		
		//close the current window
		
		driver.quit();
		
		
		
		
		
		
	

	}

}
