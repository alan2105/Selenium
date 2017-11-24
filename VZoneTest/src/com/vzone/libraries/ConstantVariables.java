package com.vzone.libraries;

import org.openqa.selenium.WebDriver;

public class ConstantVariables {
	
	public static WebDriver driver = null;
	public static final String [] DrivevrKeys = {"webdriver.chrome.driver","webdriver.gecko.driver","webdriver.ie.driver"};
	public static final String ChromeDriver_Path = "D:/eclipse/java-neon/eclipse/Third party drivers/ChromeDriver/chromedriver_win32_2.33/chromedriver.exe";
	public static final String FirefoxDriver_Path = "D:/eclipse/java-neon/eclipse/Third party drivers/GeckoDriver/geckodriver-v0.19.1-win64/geckodriver.exe";
	public static final String IEDriver_Path = "D:/eclipse/java-neon/eclipse/Third party drivers/IEDriver/IEDriverServer_Win32_3.6.0/IEDriverServer.exe";
	public static final String [] Browsers = {"Chrome","Firefox","IE"};
	public static final String URL = "http://test.vzone.vmokshagroup.com/";
	public static String UserName,Password;
	
	

}
