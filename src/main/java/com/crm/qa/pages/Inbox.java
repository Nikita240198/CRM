package com.crm.qa.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class Inbox extends TestBase {

	@FindBy(xpath = "//a[@class='brand-logo darken-1']")
	WebElement Logo;

	@FindBy(xpath = "//a[@class='waves-effect waves-light small_btn_borderd btn']/i[contains (text(),'reply')]")
	WebElement Reply;

	@FindBy(xpath = "//a[@class='waves-effect waves-light small_btn_borderd btn']/i[contains (text(),'forward')]")
	WebElement Forward;

	@FindBy(xpath = "//div[@class='note-editable']")
	WebElement ReplyBody;

	@FindBy(xpath = "//button[@id='submitbtnM']")
	WebElement Send;

	@FindBy(xpath = "//i[contains(text(),'view_list')]")
	WebElement ViewList;
	@FindBy(xpath = "//div[@id='module_view']/i")
	WebElement GridList;

	@FindBy(xpath = "//div[@class='close_icon']")
	WebElement Cross;

	@FindBy(xpath = "//div[@class='indeterminate_check_box']")
	WebElement SelectAll;

	@FindBy(xpath = "//input[@class='filled-in message-checkbox chkbx']")
	WebElement CheckBox;

	@FindBy(xpath = "//div[@class='report  bulk-move  modal-trigger']/i")
	WebElement Spamicon;

	@FindBy(xpath = "//div[@class='drafts bulk-mark-unseen']/i")
	WebElement Emailicon;

	@FindBy(xpath = "//div[@class='delete modal-trigger bulk-delete']/i")
	WebElement Deleteicon;

	@FindBy(xpath = "//div[@id='deleteModal']")
	WebElement CancelSpam;

	@FindBy(xpath = "//a[@class='dropdown-toggle dropdown_toggle_details']")
	WebElement EmailDropdown;

	@FindBy(xpath = "//span[@aria-label='Reply']")
	WebElement Replyicon;

	@FindBy(xpath = "//span[@aria-label='Delete permanently']")
	WebElement Deleteiconinmail;

	@FindBy(xpath = "//div[@id='delete-sent-item-modal']/div/div/div[2]/button[@class='btn btn-default modal-close']")
	WebElement CancleinMail;

	@FindBy(xpath = "//div[@id='delete-sent-item-modal']/div/div/div[2]/button[@class='btn btn-primary delete-sent-item-confirm']")
	WebElement DeleteinMail;

	@FindBy(xpath = "//div[@class=\"email_input autocomplete\"]/input")
	WebElement ForwardRecipient;

	@FindBy(xpath = "//div[@class='note-editable']/div[1]")
	WebElement ForwardBody;

	@FindBy(xpath = "//button[@id=\"submitbtnM\"]")
	WebElement SendForward;
	
	
	
	
	public Inbox() throws IOException {
		PageFactory.initElements(driver, this);

	}

	public void ViewInList() {
		ViewList.click();

	}

	public void GridViewList() {
		GridList.click();
	}

	public void SelectAllClick() {
		SelectAll.click();
	}

	public void HoverSpamicon() {
		Actions actions = new Actions(driver);
		actions.moveToElement(Spamicon).perform();
	}

	public void Hoveremailicon() {
		Actions actions = new Actions(driver);
		actions.moveToElement(Emailicon).perform();
	}

	public void HoverDeleteicon() {
		Actions actions = new Actions(driver);
		actions.moveToElement(Deleteicon).perform();
	}

	public void ClickOnSpam() throws InterruptedException {
		Spamicon.click();
		Thread.sleep(5000);

	}

	public void RandomTileClick() throws InterruptedException {

		List<WebElement> Tile = driver.findElements(By.cssSelector("div.messagerow"));
		int k = Tile.size();
		Random rand = new Random();

		for (int i = 0; i <= 5; i++) {
			int j = rand.nextInt(k);
			WebElement E = Tile.get(j);
			Thread.sleep(3000);
			System.out.println(j);
			E.click();
			Thread.sleep(3000);
			Cross.click();
			Thread.sleep(8000);
		}

	}

	public void AllTileClick() throws InterruptedException {
		List<WebElement> Tile = driver.findElements(By.cssSelector("div.messagerow"));
		int Tiles = Tile.size();

		for (int i = 0; i <= Tiles; i++) {
			WebElement E = Tile.get(i);
			Thread.sleep(8000);
			E.click();
			Thread.sleep(8000);
			Cross.click();

		}

	}

	public void SingleSelect() throws InterruptedException {
		List<WebElement> Tile = driver.findElements(By.xpath("//input[@class='filled-in message-checkbox chkbx']"));
		WebElement Checkbox = Tile.get(0);
		Thread.sleep(8000);
		Actions actions = new Actions(driver);
		actions.moveToElement(Checkbox).click().perform();

	}

	public void Openmail() {
		List<WebElement> Tile = driver.findElements(By.xpath("//span[@class='messagerow-link tileWrapContent']"));
		WebElement Thread = Tile.get(0);
		Actions actions = new Actions(driver);
		actions.moveToElement(Thread).click().perform();

	}

	public void emailDropdownclick() {
		EmailDropdown.click();

	}

	public void ReplyCLick() {
		Reply.click();
	}

	public void ForwardClick() {
		Forward.click();
	}

	public void HoverReplyicon() {
		Actions actions = new Actions(driver);
		actions.moveToElement(Replyicon).perform();
	}

	public void Replyiconclick() {
		Replyicon.click();
	}

	public void HoverDeleteiconinmail() {
		Actions actions = new Actions(driver);
		actions.moveToElement(Deleteiconinmail).perform();
	}

	public void Deleteiconclickinmail() {
		Deleteiconinmail.click();
	}

	public void ClickCancelinMail() {
		CancleinMail.click();
	}

	public void ClickDeleteinMail() {
		DeleteinMail.click();
	}

	public void Closemail() {
		Cross.click();

	}

	public void RightClick() {
		List<WebElement> Tile = driver.findElements(By.xpath("//span[@class='messagerow-link tileWrapContent']"));
		WebElement Thread = Tile.get(0);
		Actions action = new Actions(driver);
		action.contextClick(Thread).perform();
	}

	public void EnterReply() {
		ReplyBody.sendKeys("This is an automatic reply for a mail");
	}

	public void SendMail() {
		Send.click();
	}

	public void ForwaldName() {
		ForwardRecipient.sendKeys("mayur.upadhayay@staging.blinkly.com");
	}

	public void ForwardBodyText() {
		ForwardBody.sendKeys(" This is an automatic Forwaded mail");
	}

	public void ForwardSent() {
		SendForward.click();
	}

	public void HoverOnList() {
		List<WebElement> Tile = driver.findElements(By.xpath("//span[@class='messagerow-link tileWrapContent']"));
		WebElement Hover = Tile.get(0);
		Actions action = new Actions(driver);
		action.moveToElement(Hover).perform();
	}

	public void ClickSpanOfTile() throws InterruptedException {
		List<WebElement> Tile = driver.findElements(By.xpath("//div[@class='drafts move-thread']/i"));
		WebElement Hover = Tile.get(0);
		Actions action = new Actions(driver);
		action.moveToElement(Hover).click().build().perform();

	}
	//div[@class='drafts tile-icon-seen']/i"
	//div[@class='drafts tile-icon-unseen']/i

public void ClickSeenOfTile() throws InterruptedException {
	
	WebElement element = driver.findElement(By.className("drafts"));
    String attributeValue = element.getAttribute("aria-label");
    System.out.println("Attribute value: " + attributeValue);
    
    
    

    
    
    
    
    
	

	
//	List<WebElement> Tile = driver.findElements(By.xpath("//div[@class='drafts tile-icon-seen']/i"));
	

	
}

}
