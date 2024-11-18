package com.tests.automation.java.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.pages.automation.java.testng.WebTablePage;

public class TestWebTable {
	
	private WebDriver driver;
	
	@Test
	public void testMethodWebTable() {
		
		ChromeOptions coptions=new ChromeOptions();
		//WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver(coptions);
		
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebTablePage objWebTable=new  WebTablePage(driver);
		objWebTable.ClickWebTableLink();
		
		
		
		
	}
	@Test(groups={"smoke"})
	public void ValidatesmokeTestWeb() {
		
		System.out.println("This is WebTable");
		
	}
	@Test(groups={"Regression"})
	public void ValidateRegTestWeb() {
		
		System.out.println("This is WebTable");
		
	}

}
