package stepDefnition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smokeTest {
	
	WebDriver driver;
	
	@Given("^Open chrome and start application$")
	public void Open_chrome_and_start_application() throws Throwable {
		
//	System.setProperty("webdriver.chrome.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/ChromeDriver/chromedriver_win32_2.29/chromedriver.exe");
//	driver = new ChromeDriver();
	System.setProperty("webdriver.gecko.driver", "D:/eclipse/java-neon/eclipse/Third party drivers/GeckoDriver/geckodriver-v0.16.0-win64/geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://test.vzone.vmokshagroup.com/");
	}

	@When("^I enter valid user name and password$")
	public void I_enter_valid_user_name_and_password() throws Throwable {
	    driver.findElement(By.xpath(".//*[@id='inputUsername']")).sendKeys("alagappan.n@vmokshagroup.com");
	    driver.findElement(By.xpath(".//*[@id='inputPassword']")).sendKeys("Power@1234");
	}

	@Then("^User should be able to log	in$")
	public void User_should_be_able_to_log_in() throws Throwable {
	   driver.findElement(By.id("btnSignIn")).click();
	}

}
