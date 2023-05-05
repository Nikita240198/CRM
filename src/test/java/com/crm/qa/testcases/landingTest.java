package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LandingPage;

public class landingTest extends TestBase{
	
	LandingPage landings ;

public landingTest() throws IOException {
		super();	
		
}

@BeforeMethod
public  void setUp() throws IOException {
	initialization();
	//create object of login page class
	landings = new LandingPage();

}

@Test
public void Logotest() {
	boolean flag =landings.BlinklyLogo();
	Assert.assertTrue(flag);
}

@Test
public void Lighticon() {
	landings.landing();
}

@AfterMethod

public void tearDown() {
	driver.quit();
}

}



