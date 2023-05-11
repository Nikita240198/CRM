package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;



public class LoginTest extends TestBase {
	LandingPage landings;
	LoginPage loginpage;
	
	public LoginTest() throws IOException {
		super();	
		
	}
	
	@BeforeSuite
	
	public void setUp() throws IOException, InterruptedException {
	TestBase.initialization();
	landings = new LandingPage();
	loginpage= new LoginPage();

	
	
	

}

@BeforeMethod
public void waits() throws InterruptedException {
	Thread.sleep(2000);
}

@Test(priority=1)
public void  loginuser() {
	
	loginpage.login();
	
}


//@Test(priority=2)
//public void  selectvalue() throws InterruptedException {
//	loginpage.setValue();
//}
//
//
//@Test(priority=3)
//public void  loginfinal() {
//	loginpage.goTo();
//}


	
@AfterSuite

public void tearDown() {
	driver.quit();
}

}
