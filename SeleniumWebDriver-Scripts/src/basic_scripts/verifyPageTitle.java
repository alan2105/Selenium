package basic_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyPageTitle {

	public static void main(String[] args) {
		//declaration and installation of objects/variables
		WebDriver driver;
		String baseUrl= "https://github.com/";
		String expectedTitle = "The world's leading software development platform · GitHub";
		String actualTitle;
//		System.setProperty("webdriver.gecko.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/GeckoDriver/geckodriver-v0.16.0-win64/geckodriver.exe");
//		driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/ChromeDriver/chromedriver_win32_2.29/chromedriver.exe");
		driver = new ChromeDriver();
		
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
		
		//close the browser
		driver.quit();
		
		

	}

}
