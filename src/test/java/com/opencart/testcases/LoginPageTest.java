package com.opencart.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencart.base.TestBase;
import com.opencart.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	 
	@Test(priority=1)
	public void loginPageTittleTest() {
		String tittle = loginPage.validateLoginPageTittle();
		Assert.assertEquals(tittle, "Account Login");
	}
	@Test(priority=2)
	public void webpageLogoTest() {
		boolean b = loginPage.validateWebpageLogo();
		Assert.assertTrue(b);
	}
	
	@Test(priority=3)
	public void loginTest() {
	loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
