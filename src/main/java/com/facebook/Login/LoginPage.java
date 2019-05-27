package com.facebook.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QA.TestBase.TestBase;

public class LoginPage extends TestBase {
	
	
	//@How
	
	
	
	@FindBy(id="email")
	WebElement useremail;
	public LoginPage() {
		//PageFactory.initElements(driver, this);
		
	}
}
