package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory
	@FindBy(id="input-email")
	WebElement username;
	
	@FindBy(id="input-password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//img[@title='naveenopencart']")
	WebElement webpageLogo;
	
	//Initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Login page Feature verification 
	
	public String validateLoginPageTittle() {
		return driver.getTitle();
	}
	
	public boolean validateWebpageLogo() {
		
		return webpageLogo.isDisplayed();
	}
	
	public void login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		
	}

	
	
	

}
