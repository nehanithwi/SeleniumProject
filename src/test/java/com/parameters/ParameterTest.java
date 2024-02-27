package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
     public static WebDriver driver;
	
	
	@Parameters({"url", "emailid","password"})
	@BeforeMethod
	public void login(String url, String emailid, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\7J7073897\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(emailid);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		
		
		
	}
	
	
	  @Test 
	  public void desktops() { 
	  boolean b =driver.findElement(By.linkText("Desktops")).isDisplayed(); // Desktop link validation 
	  Assert.assertTrue(b);
	  
	  Actions action = new Actions(driver);
	  action.moveToElement(driver.findElement(By.linkText("Desktops"))).build().perform();
	  action.moveToElement(driver.findElement(By.linkText("Show All Desktops"))).click().build().perform(); //Mouse hover and clicking on show all desktops
	  
	  
	  
	  }
	  
	  @Test
	  public void laptopsAndNotebooks() {
		  boolean b =driver.findElement(By.linkText("Laptops & Notebooks")).isDisplayed(); // Desktop link validation 
		  Assert.assertTrue(b);
		  
		  Actions action = new Actions(driver);
		  action.moveToElement(driver.findElement(By.linkText("Laptops & Notebooks"))).build().perform();
		  action.moveToElement(driver.findElement(By.linkText("Show All Laptops & Notebooks"))).click();
		  
	  }
	  
	  
	      @Parameters({"text"}) 
		  @Test
		  
		  public void search(String text) throws InterruptedException {
		  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(text);
		  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
		  
		  Thread.sleep(2000);
		
		  
		  }
		 
	  
	  @AfterMethod
	  public void tearDown() {
		  driver.quit();
	  }
	  
	  

}
