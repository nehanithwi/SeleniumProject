package com.opencart.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.opencart.base.TestBase;
import com.opencart.pages.LoginPage;
import com.opencart.pages.MyAccountPage;

public class MyAccountPageTest extends TestBase {

	MyAccountPage myAccountPage;
	LoginPage loginPage;

	public MyAccountPageTest() {
		super();
	}

	@BeforeMethod
	public void setUpDesktops() {
		initialization();
		myAccountPage = new MyAccountPage();
		loginPage = new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	

	@Test(priority = 2)
	public void validateAddToCartBtnTest() {
		boolean b = myAccountPage.validateAddToCartBtn();
		Assert.assertTrue(b);

	}
	

	@Test(priority = 1)
	public void validateDesktopsPageTittleTest() {
		String tittle = myAccountPage.validateMyAccountPageTittle();
		Assert.assertEquals(tittle, "My Account");

	}

	@Test(priority = 3)
	public void validateSearchTest() {
		boolean b = myAccountPage.validateSearch();
		Assert.assertTrue(b);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
