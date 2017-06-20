package com.uploadFunctions.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FileUpload {
	
	WebDriver driver;
	WebElement ele;
	String appurl = "http://toolsqa.com/automation-practice-form/";
	
	@Test
	public void Fileupload() throws AWTException, InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/ChromeDriver/chromedriver_win32_2.29/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appurl);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Specify the file location with extension
		StringSelection sel = new StringSelection("C:\\Users\\alagappan.n\\Documents\\Dailypad.txt");
		//Copy to Clip board
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		System.out.println("Selection" +sel);
		//Scroll the page
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,350)");
		Thread.sleep(3000);
		//Click the browser button
		driver.findElement(By.id("photo")).click();
		//Create Robot class
		Robot robot = new Robot();
		Thread.sleep(1000);
		//Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		//Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		//Press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		//Release CTRL+V
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		//Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		//Tool tip capture
		//Create Actions class object
		Actions builder = new Actions(driver);
		//Find the tool tip xpath 
		ele = driver.findElement(By.xpath(".//*[@id='photo']"));
		Thread.sleep(2000);
		//Mouse hover to the text
		builder.moveToElement(ele).perform();
		//Extract the text from tool tip using getText() method
		String tooltip_name = ele.getText();
		Thread.sleep(1000);
		System.out.println("File has been uploaded File name is" + tooltip_name );
		driver.quit();
	}

}
