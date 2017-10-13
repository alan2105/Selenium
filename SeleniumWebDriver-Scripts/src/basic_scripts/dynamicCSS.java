package basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class dynamicCSS {

	public static void main(String[] args) throws InterruptedException {
		//declaration and installation of objects/variables
		WebDriver driver;
		String baseUrl= "https://github.com/";
		String expectedTitle = "The world's leading software development platform · GitHub";
		String actualTitle;
//		System.setProperty("webdriver.gecko.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/GeckoDriver/geckodriver-v0.16.0-win64/geckodriver.exe");
//		driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/ChromeDriver/chromedriver_win32_2.29/chromedriver.exe");
//		driver = new ChromeDriver();
		
		System.setProperty("webdriver.ie.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/IEDriver/IEDriverServer_Win32_3.5.1/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		//get the Actual title of the page
		actualTitle= driver.getTitle();
		
		//Compare actual title of the page with expected one and print
		
		if(actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Falied");
		}
		Thread.sleep(3000);
		//Click on Sign in button using CSS selector and linkText
		
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input#login_field")).sendKeys("alagappanmca21@gmail.com");
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("alan@2191");
		driver.findElement(By.cssSelector("input[name=commit][value='Sign in']")).click();
		Thread.sleep(3000);
		
		
		//close the browser
		driver.quit();
		
		

	}

}
