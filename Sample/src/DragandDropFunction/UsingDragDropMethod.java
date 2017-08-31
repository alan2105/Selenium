package DragandDropFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UsingDragDropMethod {

	
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebElement drag,drop;
		 
		String appurl ="http://jqueryui.com/resources/demos/droppable/default.html";
		
		System.setProperty("webdriver.chrome.driver","D:/eclipse/java-neon/eclipse/Third party drivers/ChromeDriver/chromedriver_win32_2.29/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appurl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		drag = driver.findElement(By.id("draggable"));
		drop = driver.findElement(By.id("droppable"));
		DragandDropMethod.drag_drop(driver, drag, drop);
	
		System.out.println("Dropped");
		Thread.sleep(3000);
		driver.quit();
	}

}
