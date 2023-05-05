package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LandingPage extends TestBase {
// Page Factory -OR

	@FindBy(xpath = "//img[contains(@class,'App-logo')]")

	WebElement Logo;

	@FindBy(xpath = "//svg[@data-testid ='LightModeOutlinedIcon']")
	WebElement Lighticon;

	public LandingPage() throws IOException {
		super();

		// initializing page object

		PageFactory.initElements(driver, this);
		// Pagefactoy.initelements() is a method
	}

//Action 
	

	public boolean BlinklyLogo() {
		return Logo.isDisplayed();
	}

	public void landing() {
		Lighticon.click();
	}
}
