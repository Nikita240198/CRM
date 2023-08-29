package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Inbox;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;

public class InboxTest extends TestBase {
	LandingPage landings;
	LoginPage loginPage;
	Inbox inbox;

	public InboxTest() throws IOException {
		super();

	}

	@BeforeMethod

	public void setUp() throws InterruptedException, IOException {
		initialization();
		landings = new LandingPage();
		landings.Accessgo();
		loginPage = new LoginPage();
		loginPage.login("nikitabargal", "Qwerty@123");
		loginPage.setValue();
		loginPage.goTo();
		Thread.sleep(3000);
		inbox = new Inbox();

	}

	@Test(priority = 1)
	public void ViewListTest() throws InterruptedException {
		inbox.ViewInList();

		Thread.sleep(3000);

		inbox.GridViewList();
	}

	@Test(priority = 2)
	public void SelectAllTest() {
		inbox.SelectAllClick();
	}

	@Test(priority = 3)
	public void HovericonTest() throws InterruptedException {
		inbox.SelectAllClick();
		Thread.sleep(2000);
		inbox.HoverSpamicon();
		Thread.sleep(2000);
		inbox.Hoveremailicon();
		Thread.sleep(2000);
		inbox.HoverDeleteicon();
	}

	@Test(priority = 4)
	public void SingleChekTest() throws InterruptedException {
		inbox.SingleSelect();

	}

	@Test(priority = 5)

	public void EmailDropdrownTest() throws InterruptedException {
		inbox.Openmail();
		Thread.sleep(5000);
		inbox.emailDropdownclick();
		Thread.sleep(5000);
		inbox.ReplyCLick();
	}

	@Test(priority = 6)

	public void ReplyiconTest() throws InterruptedException {
		inbox.Openmail();
		Thread.sleep(5000);
		inbox.HoverReplyicon();
		Thread.sleep(2000);
		inbox.Replyiconclick();

	}

	@Test(priority = 7)

	public void InmailDeleteicon() throws InterruptedException {
		inbox.Openmail();
		Thread.sleep(5000);
		inbox.HoverDeleteiconinmail();
		Thread.sleep(2000);
		inbox.Deleteiconclickinmail();
		Thread.sleep(2000);

	}

	@Test(priority = 8)
	public void ForwardTest() throws InterruptedException {
		inbox.Openmail();
		Thread.sleep(5000);
		inbox.ForwardClick();
	}

	@Test(priority = 9)
	public void ClickcancelinmailTest() throws InterruptedException {
		inbox.Openmail();
		Thread.sleep(5000);
		inbox.Deleteiconclickinmail();
		Thread.sleep(2000);
		inbox.ClickCancelinMail();
	}

	@Test(priority = 10)
	public void ClickOKinmailTest() throws InterruptedException {
		inbox.Openmail();
		Thread.sleep(5000);
		inbox.Deleteiconclickinmail();
		Thread.sleep(2000);
		inbox.ClickDeleteinMail();
		Thread.sleep(5000);
	}

	@Test(priority = 11)
	public void CloseMailTest() throws InterruptedException {
		inbox.Openmail();
		Thread.sleep(5000);
		inbox.Closemail();
		Thread.sleep(2000);
	}
	
	@Test(priority=12)
	public void RIghtClickTest() {
		inbox.RightClick();
	}
	
	
	@Test(priority=13)
	public void SendReply() throws InterruptedException {
		inbox.Openmail();
		Thread.sleep(5000);
		inbox.ReplyCLick();
		Thread.sleep(5000);
		inbox.EnterReply();
		Thread.sleep(5000);
		inbox.SendMail();
		Thread.sleep(5000);
	}
	
	@Test(priority=14)
	public void ForwardNameTest() throws InterruptedException {
		inbox.Openmail();
		Thread.sleep(5000);
		inbox.ForwardClick();
		Thread.sleep(3000);
		inbox.ForwaldName();
		Thread.sleep(3000);
		inbox.ForwardBodyText();
		Thread.sleep(3000);
		inbox.ForwardSent();
		Thread.sleep(3000);
	}

@Test(priority=15)
public void ListSpamClick() throws InterruptedException {
	inbox. HoverOnList();
	Thread.sleep(5000);
	inbox.ClickSpanOfTile();
	Thread.sleep(8000);
}

@Test(priority=16)
public void ListSeenClick() throws InterruptedException {
	inbox. HoverOnList();
	Thread.sleep(8000);
	inbox.ClickSeenOfTile();
	Thread.sleep(8000);
}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
