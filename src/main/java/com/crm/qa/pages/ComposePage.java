package com.crm.qa.pages;

import java.awt.AWTException;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class ComposePage extends TestBase {

	@FindBy(xpath = "//button[@class='waves-effect waves-light btn large_btn']")
	WebElement Compose;

	@FindBy(xpath = "//input[@id ='inputTo']")
	WebElement Recipient;

	@FindBy(xpath = "//input[@id ='inputSubjectM']")
	WebElement Subject;

	@FindBy(xpath = "//div[br][br]")
	WebElement Body;

	@FindBy(xpath = "//button[@id ='submitbtnM']")
	WebElement Send;

	@FindBy(xpath = "//a/i[contains(text(),'clear')]")
	WebElement Close;

	@FindBy(xpath = "//a[@id='link-add-ccM']")
	WebElement Cc;

	@FindBy(xpath = "//a[@id='link-add-bccM']")
	WebElement Bcc;

	@FindBy(xpath = "//input[@id='inputCc']")
	WebElement EnterCc;

	@FindBy(xpath = "//input[@id='inputBcc']")
	WebElement EnterBcc;

	@FindBy(xpath = "//*[@id=\"link-add-cc-closeM\"]/i[contains(@class, \"material-icons\") and contains(text(), \"clear\")]")
	WebElement CloseCc;

	@FindBy(xpath = "//*[@id=\"link-add-bcc-closeM\"]/i[contains(@class, \"material-icons\") and contains(text(), \"clear\")]")
	WebElement CloseBcc;

	@FindBy(xpath = "//a[@aria-label='Save & Close']")
	WebElement saveAndClose;

	@FindBy(xpath = "//a[@class=\"message-star flagged\"]")
	WebElement HoverOnTimer;

	@FindBy(xpath = "//a[@class='message-star flagged']/span[@aria-hidden='true']")
	WebElement ClickOnTimer;

	@FindBy(xpath = "//label[@class='hover-checkbox']/span[@class='messagerow-star']")

	WebElement DeselectOnTimer;

	@FindBy(xpath = "//div[@id=\"showTym\"]")
	WebElement dropDownClose;

	@FindBy(xpath = "//input[@id=\"non_blinkly_passphraseM\"]")
	WebElement Password;

	@FindBy(xpath = "//span[@class=\"show-pass\"]")
	WebElement View;

	@FindBy(xpath = "//span[@class='move_inbox']")
	WebElement DtoI;

	@FindBy(xpath = "//span[@id='attachIconM']")
	WebElement Attachment;

	@FindBy(xpath = "//span[@id='attachIconM']/i")
	WebElement AddAttachment;
	
	@FindBy(xpath = "//i[@ class=\"material-icons \"]")
	WebElement CloseByDelete;

	public ComposePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	public void clickToCompose() {
		Compose.click();

	}

	public void HoverClose() {
		Actions actions = new Actions(driver);
		actions.moveToElement(saveAndClose).perform();
	}

	public void clearCc() {
		CloseCc.click();
	}

	public void clearBcc() {
		CloseBcc.click();
	}

	public void Timer() {
		Actions actions = new Actions(driver);
		actions.moveToElement(HoverOnTimer).perform();

	}

	public void SelectTime() {
		Actions actions = new Actions(driver);
		actions.moveToElement(ClickOnTimer).click().build().perform();

	}

	public void DeSelectTime() {
		Actions actions = new Actions(driver);
		actions.moveToElement(DeselectOnTimer).click().build().perform();

	}

	public void ComposeTo() {
		Recipient.sendKeys("praveenchouhan@staging.blinkly.com");
	}

	public void SubjectTo(int i) {
		Subject.sendKeys("Automation " + i);
	}

	public void BodyTo(int i) {
		Body.sendKeys("Hello \n my name is nikita. \n this is a auto mactic generated mail no - " + i);
	}

	public void SendTo() {
		Send.click();

	}

	public void CloseCompose() {
		Close.click();
	}

	public void HoverOnCC() {
		Actions actions = new Actions(driver);
		actions.moveToElement(Cc).perform();
		;

	}

	public void AddCc() {

		Cc.click();
		// Cc.sendKeys("mayur@staging.blinkly.com");
	}

	public void HoverOnBCC() {
		Actions actions = new Actions(driver);
		actions.moveToElement(Bcc).perform();
		;

	}

	public void AddBcc() {
		Bcc.click();
		// Cc.sendKeys("testprajwalone@staging.blnkly.com");
	}

	public void EnterCCEmail() {

		EnterCc.sendKeys("mayur@staging.blinkly.com");
	}

	public void EnterBccEmail() {

		EnterBcc.sendKeys("testprajwalone@staging.blnkly.com");
	}

	public void Dropdown() {

		dropDownClose.click();

	}

	public void EnterPassword() {
		Password.sendKeys("123456");
	}

	public void HoverEye() {
		Actions actions = new Actions(driver);
		actions.moveToElement(View).perform();

	}

	public void ClickOnEye() {
		View.click();

	}

	public void HoverDtoI() {
		Actions actions = new Actions(driver);
		actions.moveToElement(DtoI).perform();

	}

	public void ClickOnDtoI() {
		DtoI.click();

	}

	public void HoverAttachment() {
		Actions actions = new Actions(driver);
		actions.moveToElement(Attachment).perform();

	}

	public void ClickOnAttachment() {
		Attachment.click();

	}
	
	public void CloseComposeByDelete() throws InterruptedException {
		Compose.click();
		Assert.assertTrue(Compose.isDisplayed(), "Element is not displayed");
		Assert.assertTrue(Compose.isEnabled(), "Element is not enabled");
		
		Thread.sleep(2000);
		
		CloseByDelete.click();
		
		Assert.assertTrue(CloseByDelete.isDisplayed(), "Element is not displayed");
		Assert.assertTrue(CloseByDelete.isEnabled(), "Element is not enabled");
		
		Thread.sleep(2000);
		
	}
	
	
	
	
//	public void AddFile() throws FileNotFoundException, AWTException, InterruptedException, FindFailed {
//		String filePath = "/Users/Mind/eclipse-workspace/FreeCRMTest/src/main/java/com/crm/qa/testdata/data.pdf";
//
//		Screen screen = new Screen();
//		Pattern imagePattern = new Pattern(filePath);
//		screen.wait(imagePattern, 10).click();
//
//		Pattern inputField = new Pattern(filePath);
//		screen.wait(inputField, 10).type("Pdf not uploaded" );
//
//		
//		
//		
//	}

}
