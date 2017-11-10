package vzone.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.support.ui.Select;

public class Inputbox_button_radiobutton_checkbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		WebElement ele1;
		
		
		//To launch the browsers
//		System.setProperty("webdriver.ie.driver", "D:\\eclipse\\Third party drivers\\IEDriverServer_Win32.exe");
//		driver = new InternetExplorerDriver();
//		
		System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\Third party drivers\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
//		
//		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Third party drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
		
		//Navigate to application URL
		driver.manage().window().maximize();
		String appurl = "http://vzone.vmokshagroup.com/";
		driver.get(appurl);
		//Get Page Title and URL
		System.out.println("Page Title is "+driver.getTitle());
		System.out.println("Page Current URL is "+driver.getCurrentUrl());
		Thread.sleep(3000);
		//Type the values to input fields
		driver.findElement(By.id("inputUsername")).sendKeys("alagappan.n@vmokshagroup.com");
		driver.findElement(By.id("inputPassword")).sendKeys("alan2191");
		Thread.sleep(3000);
		//Click the Sign in button
		driver.findElement(By.id("btnSignIn")).click();
		Thread.sleep(3000);
		System.out.println("Page Current URL is "+driver.getCurrentUrl());
		Thread.sleep(3000);
		//Select 'Search' Menu and 'Attendance Logs' from Dash board
		driver.findElement(By.xpath(".//*[@id='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='divSearch']/li[5]/a")).click();
		Thread.sleep(2000);
		System.out.println("Page Current URL is "+driver.getCurrentUrl());
		//Switch the Tab
		driver.findElement(By.xpath(".//*[@id='AttendanceLogsTab']/li[2]/a")).click();
		Thread.sleep(3000);
		System.out.println("Selected done");
		//Select Month from month picker
		//driver.findElement(By.xpath(".//*[@id='txtMonth']")).click();
		//System.out.println("MonthPicker Clicked");
		//Thread.sleep(3000);
		
	List<WebElement> datepicker = driver.findElements(By.xpath(".//html/body/div[11]/div[2]/table/tbody/tr/td/span"));		
	for(WebElement ele:datepicker)
		{
			String month = ele.getText();
			if(month.equalsIgnoreCase("May"))
			{
				ele.click();
				break;
			}
			
		}
		System.out.println("May moth selected");
		Thread.sleep(2000);
	//Select Radio button
		ele1= driver.findElement(By.xpath(".//*[@id='radioLateComers']"));
		ele1.click();
		Thread.sleep(3000);
		boolean DisplayStatus = ele1.isDisplayed();
		System.out.println("Late Comers- Radio button Display Status: " +DisplayStatus);
		boolean EnableStatus = ele1.isEnabled();
		System.out.println("Late Comers- Radio button Enable Status: " +EnableStatus);
		boolean SelectedStatus = ele1.isSelected();
		System.out.println("Late Comers- Radio button Selected Status: " +SelectedStatus);
		Thread.sleep(3000);
		driver.findElement(By.id("btnAttdLogsReminderSearch")).click();
		//Quit the browser
		Thread.sleep(3000); 
		driver.quit(); 
		
	}

}
