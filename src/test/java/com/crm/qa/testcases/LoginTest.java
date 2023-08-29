package com.crm.qa.testcases;

import java.io.IOException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Inbox;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;

public class LoginTest extends TestBase {
	LandingPage landings;
	LoginPage loginPage;

	public LoginTest() throws IOException {
		super();

	}

	@BeforeSuite

	public void setUp() throws InterruptedException, IOException {
		initialization();
	landings = new LandingPage();
		landings.Accessgo();
		loginPage = new LoginPage();

	}

	@BeforeMethod
	public void waits() throws InterruptedException {
		Thread.sleep(2000);
	}

	@Test

	public void EnterEmail() {

		loginPage.login("nikitabargal", "Qwerty@123");

	}

	@Test
	public void SelectSlider() throws InterruptedException {

		loginPage.setValue();

	}

	@Test

	public void clickOnSignIn() {
		loginPage.goTo();
	}

	@AfterSuite
	public void tearDown() throws InterruptedException {

		Thread.sleep(6000);
		driver.quit();
	}

}
