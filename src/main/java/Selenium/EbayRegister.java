package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayRegister {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrom.driver",
				"C:\\Users\\7J7073897\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();

		// 1. Find Element by xpath

		//driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Neha");
		
		// 2. Find Element by id
		
		//driver.findElement(By.id("destination-input")).sendKeys("Denver");
		
		
		
		// Register
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Neha");
		driver.findElement(By.id("input-lastname")).sendKeys("Rajan");
		driver.findElement(By.id("input-email")).sendKeys("nehanithwi@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("7206563006");
		driver.findElement(By.id("input-password")).sendKeys("Baby@11");
		driver.findElement(By.id("input-confirm")).sendKeys("Baby@11");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		
		
		
		
		
		

	}

}
