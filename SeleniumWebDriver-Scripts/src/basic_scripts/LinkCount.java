package basic_scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkCount {
	
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java-oxygen\\eclipse\\Third party drivers\\ChromeDriver\\chromedriver_win32_2.34\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\java-oxygen\\eclipse\\Third party drivers\\GeckoDriver\\geckodriver-v0.19.1-win32\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		int totalLinks = driver.findElements(By.tagName("a")).size();
		System.out.println("Total of No of links in HomePage: "+ totalLinks);
		Thread.sleep(2000);
		WebElement footer = driver.findElement(By.xpath("//div[@class='cfoot__container']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement col1 = driver.findElement(By.xpath("//section[@class = 'cfoot__containerHalf']"));
		List<WebElement> col1Links = col1.findElements(By.tagName("a"));
		System.out.println(col1Links.size());
		
		for(int i=0;i<col1Links.size();i++)
		{
			System.out.println(col1Links.get(i).getText());
			if(col1Links.get(i).getText().contains("Flights"))
			{
				
				col1Links.get(i).click();
				
				break;
			}
			
			
		}
		driver.quit();
		

	}

}
