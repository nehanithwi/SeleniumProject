package com.opencart.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase(){
		
		prop= new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream("C:\\Users\\7J7073897\\eclipse-workspace\\ProjectPOM\\src"
			+"\\main\\java\\com\\opencart\\config\\config.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void initialization() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\7J7073897\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		/*
		 * driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,
		 * TimeUnit.SECONDS);
		 * driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,
		 * TimeUnit.SECONDS);
		 */
		 
		
		
	driver.get(prop.getProperty("url"));
	}

}
