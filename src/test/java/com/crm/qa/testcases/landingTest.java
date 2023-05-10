package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LandingPage;

import locators.Landing;

public class landingTest extends TestBase {

	LandingPage landings;

	public landingTest() throws IOException {
		super();

	}
	
	@BeforeSuite
	
		public void setUp() throws IOException, InterruptedException {
		TestBase.initialization();
		// create object of login page class
		landings = new LandingPage();

	}
	
	@BeforeMethod
	public void waits() throws InterruptedException {
		Thread.sleep(2000);
	}
	

	@Test (priority =1)
	public void Logotest() {
		// boolean flag =
		landings.BlinklyLogo();
//	Assert.assertTrue(flag);
	}

	@Test(priority =2)
	public void Lighticon() {
		String checkTheme = landings.landing();
		
		Assert.assertEquals(checkTheme, "App light");
		
	}
	
	
	@Test(dependsOnMethods = "Lighticon", priority=3)
	public void Darkicon() {
		
		String DarkTheme = landings.Darklanding();
		Assert.assertEquals(DarkTheme, "App dark");
		
	}
	
	
	
	
	@Test(priority =4)
	public void Goto() {
		landings.Accessgo();
	}
	
	
	

	@AfterSuite

	public void tearDown() {
		driver.quit();
	}

}
