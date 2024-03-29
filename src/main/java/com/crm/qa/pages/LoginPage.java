package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//input[@id='fname']")
	WebElement UserName;

	@FindBy(xpath = "//input[@id='lname']")
	WebElement Password;

	@FindBy(xpath = "//div[@class='sliderNo']")
	WebElement SliderValue;

	@FindBy(xpath = "//span[@aria-hidden='true']")
	WebElement Slider;

	@FindBy(xpath = "//button[@type='button']")
	WebElement Signin;

	public LoginPage() throws IOException {

		PageFactory.initElements(driver, this);

	}

	public void login(String givenUserName, String givenPassword) {
		

		String username = "nikitabargal";
		String password = "Qwerty@123";
		
		if(givenUserName.equals(username) && givenPassword.equals(password)){
			UserName.sendKeys("nikitabargal");
			Password.sendKeys("Qwerty@123");
		}
		else {
			System.out.println("invalid credentials");
		}
		
		}
	

	public void setValue(){

		Actions actions = new Actions(driver);
		actions.click(Slider);

		String tmep[] = SliderValue.getAttribute("innerText").split(" ");
		String t = tmep[3];
		int k = Integer.parseInt(t);
		for (int i = 0; i < k; i++) {
			actions.sendKeys(Keys.ARROW_RIGHT);
		}

//		if (k == 1) {
//
//			actions.sendKeys(Keys.ARROW_LEFT);
//			actions.sendKeys(Keys.ARROW_RIGHT);
//		} else {
//			for (int i = 0; i < k; i++) {
//				actions.sendKeys(Keys.ARROW_RIGHT);
//			}
//		}

		actions.build().perform();
		

	}

	public void goTo() {

	Signin.click();
		
	}
	
	
}
