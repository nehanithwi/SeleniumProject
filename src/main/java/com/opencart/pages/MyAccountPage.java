package com.opencart.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.base.TestBase;

public class MyAccountPage extends TestBase {

	
	//page factory
	
	@FindBy(xpath="//span[@id='cart-total']")
	WebElement addToCart;
	
	@FindBy(linkText="Show All Desktops")
	WebElement showAllDesktops;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement search;
	
	//Initializing page Objects
	
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String validateMyAccountPageTittle() {
		return driver.getTitle();
	}
	
	public boolean validateSearch() {
		return search.isDisplayed();
		
		
	}
	
	public boolean validateAddToCartBtn() {
		return addToCart.isDisplayed();
	}
	
}
