package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.crm.qa.ulitlity.TestUtil;

public class TestBase {
//basic initialisation,open browser,maximise window use inheritance and base class is parent class
	public static WebDriver driver;
	static Properties prop;

	public TestBase() throws IOException {
//this is a constructor and constructor name is same as class name
//	prop = new Properties();
//	FileInputStream ip = new FileInputStream("/Users/Mind/eclipse-workspace/FreeCRMTest/src/main/java/com/crm/qa/config/config.properties");
//	prop.load(ip);
//	System.out.println(prop.get("Browser"));
		prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"/Users/Mind/eclipse-workspace/FreeCRMTest/src/main/java/com/crm/qa/config/config.properties");
		prop.load(ip);

	}

	public static void initialization() {
		// read property of browser
		String BrowserName = prop.getProperty("Browser");

		if (BrowserName.equals("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "/Users/Mind/Downloads/chromedriver_mac64/chromedriver");
			driver = new ChromeDriver();
			
		}
		else if(BrowserName.equals("FF")){
			System.setProperty("webdriver.chrome.driver", "/Users/Mind/Downloads/chromedriver_mac64/gekodriver");
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
