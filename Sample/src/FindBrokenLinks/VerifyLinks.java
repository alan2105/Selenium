package FindBrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyLinks {

	public static void main(String[] args) {
		WebDriver driver;
		String appurl = "http://test.vzone.vmokshagroup.com/";
		
		System.setProperty("webdriver.chrome.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/ChromeDriver/chromedriver.exe");
		driver  = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/GeckoDriver/geckodriver-v0.16.0-win64/geckodriver.exe");
		//driver  = new FirefoxDriver();
		driver.get(appurl);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total no.of Links " + links.size());
		
		for (int i=0; i<links.size(); i++)
		{
			WebElement ele = links.get(i);
			String url = ele.getAttribute("href");
			
			VerifyActiveLink(url);
			
			
		}
		driver.quit();
	}
	
	
	
	public static void 	VerifyActiveLink(String linkurl)
	{
		try
		{
		URL url = new URL (linkurl);
		HttpURLConnection HttpUrlConnect = (HttpURLConnection)url.openConnection();
		HttpUrlConnect.setConnectTimeout(3000);
		HttpUrlConnect.connect();
		
		if(HttpUrlConnect.getResponseCode()== 200)
		{
			System.out.println(linkurl+" - "+HttpUrlConnect.getResponseMessage());
		}
		if(HttpUrlConnect.getResponseCode()== 404)
		{
		System.out.println(linkurl+" - "+HttpUrlConnect.getResponseMessage()+" - "+HttpUrlConnect.getResponseMessage());
		}
		}
		catch (Exception e){
			
		}
		
	}
	

}
