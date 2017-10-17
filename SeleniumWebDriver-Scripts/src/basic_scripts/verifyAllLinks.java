package basic_scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyAllLinks {

	public static void main(String[] args) {
		WebDriver driver;
		int i=0;
		String appurl = "http://demo.guru99.com/selenium/newtours/";
		
		System.setProperty("webdriver.chrome.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/ChromeDriver/chromedriver_win32_2.29/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
		driver.get(appurl);
		
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		
		String [] linkTexts = new String[linkElements.size()];
		//extract the link texts of each link element
		
		
		for(WebElement e : linkElements)
		{
			
			linkTexts[i] = e.getText();
			i++;
		}
		
	
		
		for(String t : linkTexts ){
			
			driver.findElement(By.linkText(t)).click();
		
			if(driver.getTitle().equalsIgnoreCase("Under Construction: Mercury Tours"))
			{
			System.out.println("\""+t+"\""+"is under contruction");
			
			}
			else
			{
			System.out.println("\""+t+"\""+"is working");
			
			}
			driver.navigate().back();
			
			
		}
			
		
		driver.quit();
		}

	}


