package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class Draftpage extends TestBase {

	@FindBy(xpath = "//a[@href=\"/webmail/63e35ac496f7ac37db7dc9f6\"]")
	WebElement DraftNavigation;

	@FindBy(xpath = "//div[@class='indeterminate_check_box']")
	WebElement SelectHover;

	public Draftpage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public void ClickDraft() {
		DraftNavigation.click();
		Assert.assertTrue(DraftNavigation.isDisplayed(), "Element is not displayed");
		Assert.assertTrue(DraftNavigation.isEnabled(), "Element is not enabled");

	}

	public void Selectall() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(SelectHover).perform();
		Thread.sleep(2000);
		SelectHover.click();

		System.out.println("Is checkbox displayed before hover -->  " + SelectHover.isDisplayed());
		System.out.println("Is checkbox displayed after hover --> " + SelectHover.isDisplayed());
		Assert.assertTrue(SelectHover.isDisplayed(), "Element is not displayed");
		Assert.assertTrue(SelectHover.isEnabled(), "Element is not enabled");
	}

}
