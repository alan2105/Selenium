package basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsElementPresent {
	WebDriver driver;
	WebElement ele;
	String appurl = "http://store.demoqa.com/wp-login.php?action=register";
	
	public void BrowserSetup()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/ChromeDriver/chromedriver_win32_2.29/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void isElementPresent()
	{
		driver.get(appurl);
		driver.findElement(By.cssSelector("#user_login")).sendKeys("");
		driver.findElement(By.cssSelector(""));
		
	}
}
