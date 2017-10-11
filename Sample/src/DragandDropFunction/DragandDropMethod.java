package DragandDropFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDropMethod {
	
	
	public static void drag_drop(WebDriver ldriver, WebElement drag, WebElement drop)
	{
		Actions act = new Actions(ldriver);
		act.dragAndDrop(drag, drop).build().perform();
		
	}

}
