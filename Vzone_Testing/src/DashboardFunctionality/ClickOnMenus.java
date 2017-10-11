/**
 * 
 */
package DashboardFunctionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import libaray.TakeScreenshots;

/**
 * @author prasanna
 *
 */
public class ClickOnMenus {

	WebDriver driver;

	@Test(priority=0,description="open the inbox page")
	public void ClickOnInbox()
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.findElement(By.id("DASHBOARD")).click();

		TakeScreenshots.capturescreenshot(driver, "Menulist1");

		driver.findElement(By.xpath(".//*[@id='divDASHBOARD']/li[2]/a")).click();

		TakeScreenshots.capturescreenshot(driver, "InboxPage");

		String url1=driver.getCurrentUrl();

		System.out.println("url of the page is "+url1);

		if(url1.contains("Inbox"))
		{
			System.out.println("we are in the Inbox page");
		}
		else
		{
			System.out.println("we are in some other page but not in Inbox");
		}
	}
	@Test(priority=1,description="open the HR page")
	public void ClickOnHR()
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.findElement(By.id("DASHBOARD")).click();

		driver.findElement(By.xpath(".//*[@id='divDASHBOARD']/li[3]/a")).click();

		TakeScreenshots.capturescreenshot(driver, "HRPage");

		String url2=driver.getCurrentUrl();

		if(url2.contains("HR"))
		{
			System.out.println("we are in the HR page");
		}
		else
		{
			System.out.println("we are in some other page but not in HR");
		}

		System.out.println("url of the page is "+url2);

		String tabname1=driver.findElement(By.xpath(".//*[@id='divEmployee']/div[1]")).getText();

		System.out.println("name on the tab is "+tabname1);

		Assert.assertTrue(tabname1.contains("Employee(s)")," Tabname is not employee(s),it is different tab");

		driver.findElement(By.xpath(".//*[@id='divEmployee']/div[1]")).click();

		TakeScreenshots.capturescreenshot(driver, "Employee(s)");

		String tabname2=driver.findElement(By.xpath(".//*[@id='divShortage']/div[1]")).getText();

		System.out.println("name on the tab is "+tabname2);

		Assert.assertTrue(tabname2.contains("Attendance")," Tabname is not Attendance,it is different tab");

	}

	@Test(priority=2,description="Open the Recuiters page")
	public void Recuiter()
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.findElement(By.id("DASHBOARD")).click();

		driver.findElement(By.xpath(".//*[@id='divDASHBOARD']/li[4]/a")).click();

		TakeScreenshots.capturescreenshot(driver, "Recuiterpage");

		String url3=driver.getCurrentUrl();

		System.out.println("url of the page is "+url3);

		if(url3.contains("Recuiters"))
		{
			System.out.println("we are in the Recuiter page");
		}
		else
		{
			System.out.println("we are in some other page but not in Recuiter page");
		}

	}

}
