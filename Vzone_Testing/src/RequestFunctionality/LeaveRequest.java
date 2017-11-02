/**
 * 
 */
package RequestFunctionality;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import libaray.TakeScreenshots;

/**
 * @author prasanna
 *
 */
public class LeaveRequest {
	
	WebDriver driver;
	
	@Test(description="Sending leave request to respevtive Manger")
	public void ApplyLeave()
	{
		driver.findElement(By.xpath(".//*[@id='REQUEST']/b")).click();
		
		driver.findElement(By.xpath(".//*[@id='divREQUEST']/li[8]/a")).click();
		
		String textname=driver.findElement(By.xpath(".//*[@id='breadcrumb']/ul/li[2]")).getText();
		
		TakeScreenshots.capturescreenshot(driver, "LeaveRequest");
		
		System.out.println("Name on the title is "+textname);
		
		Assert.assertEquals("LEAVE REQUEST", textname,"we are not in the leaverequest page");
		
		
		//Employee drop-down using select class
		WebElement drop_down=driver.findElement(By.id("cbo_Employee_LeaveRequest"));
		
		Select Employee=new Select(drop_down);
		
		Employee.selectByVisibleText("Pooja Kshirasagar");
		
		WebElement selected_option=Employee.getFirstSelectedOption();
		
		System.out.println("After selection selected value is"+selected_option);
		
		
		//Leave type drop-down without select class
		driver.findElement(By.xpath(".//*[@id='s2id_cbo_LeaveType']/a/div/b")).click();
		
		driver.findElement(By.xpath("//span[@text()='Privilege Leave']")).click();
		
		TakeScreenshots.capturescreenshot(driver, "SelectedLeave");
		
		
		//select date from the calendar
		driver.findElement(By.xpath("txtFromDate")).click();
		
		driver.findElement(By.xpath("html/body/div[10]/div[1]/table/tbody/tr[4]/td[5]")).click();
		
		driver.findElement(By.xpath("txtToDate")).click();
		
		driver.findElement(By.xpath("html/body/div[10]/div[1]/table/tbody/tr[6]/td[1]")).click();
		
		
		
		
	}
	

}
