package basic_scripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MultiWindowHandle {
	
	public static String appUrl ="http://demoqa.com/frames-and-windows/";
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\java-oxygen\\eclipse\\Third party drivers\\ChromeDriver\\chromedriver_win32_2.34\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Open Seprate New Window']")).click();
		driver.findElement(By.xpath(".//*[@id='tabs-2']/div/p/a")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String ParentWindow = it.next();
		String ChildWindow=it.next();
		driver.switchTo().window(ChildWindow);
		String Curl = driver.getCurrentUrl();		
		Assert.assertTrue(true, Curl);
		System.out.println(Curl);
		driver.switchTo().window(ParentWindow);
		driver.manage().deleteAllCookies();
	}

}
