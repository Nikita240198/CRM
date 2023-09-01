package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class CreateDraft extends TestBase {
	@FindBy(xpath = "//button[@class='waves-effect waves-light btn large_btn']")
	WebElement Compose;

	@FindBy(xpath = "//input[@id ='inputTo']")
	WebElement Recipient;

	@FindBy(xpath = "//input[@id ='inputSubjectM']")
	WebElement Subject;

	@FindBy(xpath = "//div[br][br]")
	WebElement Body;

	@FindBy(xpath = "//a/i[@class=\"material-icons dp48 mail_close b\"]")
	WebElement CloseDraft;

	@FindBy(xpath = "//i[@ class=\"material-icons \"]")
	WebElement CloseByDelete;

	@FindBy(xpath = "//a[@id='link-add-ccM']")
	WebElement CarbonCopy;

	public CreateDraft() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	public   WebElement clickToCompose(){
		Compose.click();
		return Compose;
		

	
//
//		Recipient.sendKeys("praveenchouhan@staging.blinkly.com");
//		Assert.assertTrue(Recipient.isDisplayed(), "Element is not displayed");
//		Assert.assertTrue(Recipient.isEnabled(), "Element is not enabled");
//
//		Thread.sleep(4000);
//
//		CloseDraft.click();
//		Assert.assertTrue(CloseDraft.isDisplayed(), "Element is not displayed");
//		Assert.assertTrue(CloseDraft.isEnabled(), "Element is not enabled");

	}
	

	public void SubjectDraft() throws InterruptedException {
		Compose.click();
		Assert.assertTrue(Compose.isDisplayed(), "Element is not displayed");
		Assert.assertTrue(Compose.isEnabled(), "Element is not enabled");

		Thread.sleep(2000);

		Subject.sendKeys("Draft Subject");
		Assert.assertTrue(Subject.isDisplayed(), "Element is not displayed");
		Assert.assertTrue(Subject.isEnabled(), "Element is not enabled");

		Thread.sleep(4000);

		CloseDraft.click();
		Assert.assertTrue(CloseDraft.isDisplayed(), "Element is not displayed");
		Assert.assertTrue(CloseDraft.isEnabled(), "Element is not enabled");
	}

	public void BodyDraft() throws InterruptedException {
		Compose.click();
		Assert.assertTrue(Compose.isDisplayed(), "Element is not displayed");
		Assert.assertTrue(Compose.isEnabled(), "Element is not enabled");

		Thread.sleep(2000);

		Body.sendKeys("This is an automatic generated email");
		Assert.assertTrue(Body.isDisplayed(), "Element is not displayed");
		Assert.assertTrue(Body.isEnabled(), "Element is not enabled");

		Thread.sleep(4000);

		CloseDraft.click();
		Assert.assertTrue(CloseDraft.isDisplayed(), "Element is not displayed");
		Assert.assertTrue(CloseDraft.isEnabled(), "Element is not enabled");

	}

	public void EmailDraft() throws InterruptedException {
		Compose.click();
		Assert.assertTrue(Compose.isDisplayed(), "Element is not displayed");
		Assert.assertTrue(Compose.isEnabled(), "Element is not enabled");

		Thread.sleep(2000);

		Recipient.sendKeys("praveenchouhan@staging.blinkly.com");
		Assert.assertTrue(Recipient.isDisplayed(), "Element is not displayed");
		Assert.assertTrue(Recipient.isEnabled(), "Element is not enabled");

		Thread.sleep(2000);

		Subject.sendKeys("Draft Subject");
		Assert.assertTrue(Subject.isDisplayed(), "Element is not displayed");
		Assert.assertTrue(Subject.isEnabled(), "Element is not enabled");

		Thread.sleep(2000);

		Body.sendKeys("This is an automatic generated email");
		Assert.assertTrue(Body.isDisplayed(), "Element is not displayed");
		Assert.assertTrue(Body.isEnabled(), "Element is not enabled");

		Thread.sleep(4000);

		CloseDraft.click();
		Assert.assertTrue(CloseDraft.isDisplayed(), "Element is not displayed");
		Assert.assertTrue(CloseDraft.isEnabled(), "Element is not enabled");

	}

	public void CloseCompose() throws InterruptedException {
		Compose.click();
		Assert.assertTrue(Compose.isDisplayed(), "Element is not displayed");
		Assert.assertTrue(Compose.isEnabled(), "Element is not enabled");

		Thread.sleep(2000);

		CloseByDelete.click();

		Assert.assertTrue(CloseByDelete.isDisplayed(), "Element is not displayed");
		Assert.assertTrue(CloseByDelete.isEnabled(), "Element is not enabled");

		Thread.sleep(2000);

	}

	public void DeleteDraftTo() throws InterruptedException {
		Compose.click();
		Assert.assertTrue(Compose.isDisplayed(), "Element is not displayed");
		Assert.assertTrue(Compose.isEnabled(), "Element is not enabled");

		Thread.sleep(2000);

		Recipient.sendKeys("praveenchouhan@staging.blinkly.com");
		Assert.assertTrue(Recipient.isDisplayed(), "Element is not displayed");
		Assert.assertTrue(Recipient.isEnabled(), "Element is not enabled");

		Thread.sleep(2000);
		Subject.click();
		Assert.assertTrue(Subject.isDisplayed(), "Element is not displayed");
		Assert.assertTrue(Subject.isEnabled(), "Element is not enabled");

		CloseByDelete.click();
		Assert.assertTrue(CloseByDelete.isDisplayed(), "Element is not displayed");
		Assert.assertTrue(CloseByDelete.isEnabled(), "Element is not enabled");

	}

	public void CCDraft() throws InterruptedException {

		Compose.click();
		Assert.assertTrue(Compose.isDisplayed(), "Element is not displayed");
		Assert.assertTrue(Compose.isEnabled(), "Element is not enabled");
		
		Thread.sleep(3000);

		CarbonCopy.click();
		
		 System.out.println("See what get print in CC --> " + CarbonCopy);
		Assert.assertTrue(CarbonCopy.isDisplayed(), "Element is not displayed");
		Assert.assertTrue(CarbonCopy.isEnabled(), "Element is not enabled");

		 System.out.println("See what get print in CC --> " + CarbonCopy.isDisplayed());
	}

}
