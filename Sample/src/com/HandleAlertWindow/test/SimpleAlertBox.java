package com.HandleAlertWindow.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleAlertBox {
	
	WebDriver driver;
	String appurl = "http://demo.automationtesting.in/Alerts.html";
	
	@Test
	public void DemoAlert() throws Throwable{
		//Setup the browser and open the test application
		System.setProperty("webdriver.chrome.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/ChromeDriver/chromedriver_win32_2.29/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appurl);
		Thread.sleep(2000);
		
		//Click Alert button from menu
		driver.findElement(By.xpath(".//*[@id='OKTab']/button")).click();
		//Switch to alert window and capture data of alert box
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(3000);
		//Click OK from alert box
		alt.accept();
		Thread.sleep(5000);
		//Switch to Alert with OK and Cancel button tab
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		//Click on Alert button from that tab
		driver.findElement(By.id("CancelTab")).click();
		Thread.sleep(2000);
		//Switch to alert window and capture the text of alert window
		System.out.println(driver.switchTo().alert().getText());
		//Click on Cancel button in alert box
		alt.dismiss();
		Thread.sleep(3000);
		driver.quit();
	
		
		
		
		
		
	
		
	}

}
