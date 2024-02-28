package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.base.TestBase;

public class EditAccountPage extends TestBase{
	
	//Page Factory
	
	@FindBy(id="input-firstname")
	WebElement firstname;
	
	@FindBy(id="input-lastname")
	WebElement lastname;
	
	@FindBy(id="input-email")
	WebElement emailid;
	
	@FindBy(id="input-telephone")
	WebElement telephone;
	
	@FindBy(linkText="Back")
	WebElement backBtn;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continueBtn;
	
	@FindBy(xpath="//h1[normalize-space()='My Account Information']")
	WebElement tittle;
	
	@FindBy(linkText="Edit Account")
	WebElement editAccount;
	
	//Initializing page Objects
	
	public EditAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String fn, String ln, String email, String ph) {
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		emailid.sendKeys(email);
		telephone.sendKeys(ph);
		continueBtn.click();
	}
	
	public void navigateToEditAccount() {
		editAccount.click();
	}
	
	public String validateHeading() {
		return tittle.getText();
		
	}
	
	public boolean validateContinueBtn() {
		return continueBtn.isDisplayed();
	}
	
	public boolean validateBackBtn() {
		return backBtn.isDisplayed();
	}

}
