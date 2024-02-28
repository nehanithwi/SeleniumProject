package com.opencart.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.opencart.base.TestBase;
import com.opencart.pages.EditAccountPage;
import com.opencart.pages.LoginPage;

public class EditAccountPageTest extends TestBase {

	EditAccountPage editAccountPage;
	LoginPage loginPage;

	public EditAccountPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		editAccountPage = new EditAccountPage();
		loginPage = new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		editAccountPage.navigateToEditAccount();

	}

	@Test(priority = 1)
	public void validateHeadingTest() {
		String text = editAccountPage.validateHeading();
		Assert.assertEquals(text, "My Account Information");
	}

	@Test(priority = 2)
	public void validateContinueBtnTest() {
		boolean b = editAccountPage.validateContinueBtn();
		Assert.assertTrue(b);
	}

	@Test(priority = 3)
	public void validateBackBtnTest() {
		boolean b = editAccountPage.validateBackBtn();
		Assert.assertTrue(b);

	}

	@Test(priority = 3)
	public void loginTest() {
		editAccountPage.login(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("emailid"),
				prop.getProperty("telephone"));

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
