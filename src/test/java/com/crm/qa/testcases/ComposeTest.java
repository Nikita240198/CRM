package com.crm.qa.testcases;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ComposePage;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;


public class ComposeTest extends TestBase {
	LandingPage landings;
	LoginPage loginPage;
	ComposePage composePage;

	public ComposeTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeSuite

	public void setUp() throws InterruptedException, IOException {
		initialization();
		landings = new LandingPage();
		landings.Accessgo();
		loginPage = new LoginPage();
		loginPage.login("nikitabargal", "Qwerty@123");
		loginPage.setValue();
		loginPage.goTo();
		Thread.sleep(6000);
		composePage = new ComposePage();
	
		
	}

	@BeforeMethod
	public void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}

	@Test(priority=2)
	public void send10Mail() throws InterruptedException {
		for (int i= 0;i<=20;i++) {
			composePage.clickToCompose();
			Thread.sleep(3000);
			composePage.ComposeTo();
			Thread.sleep(3000);
			composePage.SubjectTo(i+1);
			Thread.sleep(3000);
			composePage.BodyTo(i+1);
			Thread.sleep(3000);
			composePage.SendTo();
			Thread.sleep(3000);
		}
	}

	@Test(priority = 1)
	public void ComposeToTest() {
		composePage.clickToCompose();
	}

//	
	@Test(priority = 2)

	public void closeCompose() throws InterruptedException {
		composePage.clickToCompose();
		Thread.sleep(2000);
		composePage.HoverClose();
		Thread.sleep(2000);
		composePage.CloseCompose();
	}

//	@Test(priority = 3)
//	public void ComposeToTestagain() throws InterruptedException {
//		Actions actions = new Actions(driver);
//		composePage.clickToCompose();
//		Thread.sleep(3000);
//		composePage.ComposeTo();
//		Thread.sleep(3000);
//		composePage.HoverOnCC();
//		Thread.sleep(3000);
//		composePage.AddCc();
//		Thread.sleep(2000);
//		composePage.HoverOnBCC();
//		Thread.sleep(3000);
//		composePage.AddBcc();
//		Thread.sleep(2000);
//		composePage.EnterCCEmail();
//		Thread.sleep(3000);
//		composePage.EnterBccEmail();
//		Thread.sleep(3000);
//		composePage.BodyTo(5);
//		Thread.sleep(3000);
//		composePage.SendTo();
//		Thread.sleep(3000);
//	}
	
	
	
	
	@Test
	
	public void RemoveCc() throws InterruptedException {
		composePage.clickToCompose();
		Thread.sleep(3000);
		composePage.AddCc();
		Thread.sleep(2000);
		composePage.clearCc();
		
	}
	
	@Test
	
	public void RemoveBcc() throws InterruptedException {
		composePage.clickToCompose();
		Thread.sleep(3000);
		composePage.AddBcc();
		Thread.sleep(3000);
		composePage.clearBcc();
	}
	
	@Test
	public void ClickOnTimer() throws InterruptedException {
		composePage.clickToCompose();
		Thread.sleep(2000);
		composePage.Timer();
		Thread.sleep(2000);
		composePage.SelectTime();
		composePage.Dropdown();
		composePage.DeSelectTime();

	}
	
	@Test
	public void EmailPassword() throws InterruptedException {
		composePage.clickToCompose();
		Thread.sleep(2000);
		composePage.EnterPassword();
		Thread.sleep(2000);
		composePage.HoverEye();
		Thread.sleep(2000);
		composePage.ClickOnEye();
		
	}
	
	
	@Test
	
	public void DirectToInbox() throws InterruptedException {
		composePage.clickToCompose();
		Thread.sleep(2000);
		composePage.HoverDtoI();
		Thread.sleep(2000);
		composePage.ClickOnDtoI();
	}
	
	
	@Test
	
	public void InboxAttacment() throws InterruptedException {
		composePage.clickToCompose();
		Thread.sleep(2000);
		composePage.HoverAttachment();
		Thread.sleep(2000);
		composePage.ClickOnAttachment();
		
	}
	
	
	
	
	
	@Test()
	public void DeleteComposeTest() throws InterruptedException {
		composePage.CloseComposeByDelete();
	}
//
//	@Test()
//	
//	public void GetAttachments() throws InterruptedException, FileNotFoundException, FindFailed, AWTException  {
//		composePage.clickToCompose();
//		Thread.sleep(2000);
//		composePage.ClickOnAttachment();
//		Thread.sleep(2000);
//		composePage.AddFile();
//		
//
//	}
//	
	
	
	
	

//	@Test(priority = 2 )
//	public void RecipientTest() {
//		composePage.ComposeTo();
//		
//	}
//	
//	
//	@Test(priority = 3 )
//	
//	public void SubjectTest() {
//		composePage.SubjectTo();
//		
//	}
//	
//	@Test( priority = 4 )
//	public void BodyTest() {
//		composePage.BodyTo();
//	}
//	
//	
//	@Test(priority = 5 )
//	public void SendTest() {
//		composePage.SendTo();
//	}

	@AfterSuite
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
