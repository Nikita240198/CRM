package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Draftpage;
import com.crm.qa.pages.Inbox;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;

public class DraftTest extends TestBase {

	public DraftTest() throws IOException {
		super();
	}

	LandingPage landings;
	LoginPage loginPage;
	Draftpage draft;

	@BeforeSuite
	public void setUp() throws InterruptedException, IOException {
		initialization();
		landings = new LandingPage();
		landings.Accessgo();
		loginPage = new LoginPage();
		loginPage.login("nikitabargal", "Qwerty@123");
		loginPage.setValue();
		loginPage.goTo();
		Thread.sleep(3000);
		
		draft = new Draftpage();

	}

	@Test(priority=1)

	public void DraftClickTest() {
		draft.ClickDraft();

	}

	@Test(priority=2)
	public void HoverSelectall() throws InterruptedException {
		Thread.sleep(3000);
		draft.Selectall();

	}

	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
