package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\7J7073897\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// Launch Chrome
		
		driver.get("https://www.google.com/"); // enter url
		
		String tittle = driver.getTitle(); 
		System.out.println(tittle);
		
		//validation point: 
		
		  if(tittle.equals("google")) { System.out.println("Correct tittle"); } else
		  System.out.println("incorrect tittle");
		  
		  //current URL 
		  System.out.println(driver.getCurrentUrl()); 
		  driver.quit();
		 
		
		
		
	}

}
