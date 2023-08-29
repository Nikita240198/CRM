package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {
//basic initialisation,open browser,maximise window use inheritance and base class is parent class
	public static WebDriver driver;
	public static Properties prop;

	public TestBase() throws IOException {
//this is a constructor and constructor name is same as class name
//	prop = new Properties();
//	FileInputStream ip = new FileInputStream("/Users/Mind/eclipse-workspace/FreeCRMTest/src/main/java/com/crm/qa/config/config.properties");
//	prop.load(ip);
//	System.out.println(prop.get("Browser"));
		prop = new Properties();
		try (FileInputStream ip = new FileInputStream("/Users/Mind/eclipse-workspace/FreeCRMTest/src/main/java/com/crm/qa/config/config.properties")) {
		    prop.load(ip);
		} catch (IOException e) {
		    e.printStackTrace();
		}


	}

	public static void initialization() throws InterruptedException {
		// read property of browser
		String BrowserName = prop.getProperty("Browser");

		if (BrowserName.equals("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "/Users/Mind/Downloads/chromedriver-mac-x64/chromedriver");
			
			
			
			driver = new ChromeDriver();
			
		}
		else if(BrowserName.equals("FF")){
			System.setProperty("webdriver.FireFox.driver", "/Users/Mind/Downloads/FirefoxDriver/geckodriver");
			driver = new FirefoxDriver();
		}
		
//		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		Thread.sleep(2000);
	
		
		
	}
	
}

