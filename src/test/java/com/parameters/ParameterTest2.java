package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest2 {

	public static WebDriver driver;

	@Parameters({ "url"})
	@BeforeMethod
	public void login(String url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\7J7073897\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(url);
		driver.manage().window().maximize();

		Thread.sleep(5000);

	}

	@Test
	public void links() {
		boolean b = driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Login']")).isDisplayed();
		Assert.assertEquals(b, true);

		boolean b1 = driver.findElement(By.linkText("Register")).isDisplayed();
		Assert.assertEquals(b1, true);

		boolean b2 = driver.findElement(By.linkText("Forgotten Password")).isDisplayed();
		Assert.assertEquals(b2, true);

		boolean b3 = driver.findElement(By.linkText("My Account")).isDisplayed();
		Assert.assertEquals(b3, true);

		boolean b4 = driver.findElement(By.linkText("Address Book")).isDisplayed();
		Assert.assertEquals(b4, true);

	}

	@Test
	public void buttons() {
		boolean b = driver.findElement(By.xpath("//a[@class='btn btn-primary']")).isDisplayed(); 
		Assert.assertTrue(b);

		boolean b1 = driver.findElement(By.xpath("//input[@value='Login']")).isDisplayed();
		Assert.assertTrue(b1);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
