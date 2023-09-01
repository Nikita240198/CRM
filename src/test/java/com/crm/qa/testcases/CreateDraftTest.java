package com.crm.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CreateDraft;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;

import locators.Compose;

public class CreateDraftTest extends TestBase {

	public CreateDraftTest() throws IOException {
		super();

	}

	LandingPage landings;
	LoginPage loginPage;
	CreateDraft draft;

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

	}

	@Test(priority = 1, enabled = true)
	public void CreateDraftTesting() throws InterruptedException, IOException {

		draft.clickToCompose();
		WebElement compose = draft.clickToCompose();
		Assert.assertTrue(compose.isDisplayed(), "Compose button is not displayed.");

	}

	@Test(priority = 2, enabled = false)

	public void SubjectClickTest() throws InterruptedException {
		draft.SubjectDraft();
	}

	@Test(priority = 3, enabled = false)
	public void DraftBodyTest() throws InterruptedException {
		draft.BodyDraft();
	}

	@Test(priority = 4, enabled = false)
	public void EmailDraftTest() throws InterruptedException {
		draft.EmailDraft();
	}

	@Test(priority = 5, enabled = false)
	public void CloseComposeTest() throws InterruptedException {
		draft.CloseCompose();
	}

	@Test(priority = 6, enabled = false)
	public void ToDraft() throws InterruptedException {
		draft.DeleteDraftTo();
	}

	@Test(priority = 7, enabled = false)
	public void CCDraftTest() throws InterruptedException {
		draft.CCDraft();
		Thread.sleep(2000);
	}

	@AfterSuite
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
