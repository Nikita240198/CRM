package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LandingPage extends TestBase {
// Page Factory -OR

	@FindBy(xpath = "//img[@class='App-logo']")

	WebElement Logo;

	@FindBy(xpath = " //*[contains(@data-testid,'LightModeOutlinedIcon')]")
	WebElement Lighticon;
	
	@FindBy(xpath = "//*[@id='start']")
	WebElement maindiv ;
	
	@FindBy(xpath="//*[contains(@data-testid,'DarkModeOutlinedIcon')]  ")
	WebElement DarkMode;
	
	@FindBy(xpath = "//span[@class='shuffle-text']")
	WebElement Access;
	

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

	public String landing() {
		Lighticon.click();
		return maindiv.getAttribute("class");
		
	}
	

	public String Darklanding() {
		DarkMode.click();
		return maindiv.getAttribute("class");
	}
	
	
	public LoginPage Accessgo() throws IOException {
		Access.click();
		return new LoginPage();
		
	}
	
	
}
