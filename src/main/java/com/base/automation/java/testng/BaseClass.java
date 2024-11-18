package com.base.automation.java.testng;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	WebDriver driver;
	
	//@Test
	public void  launchBrower()
	{
		ChromeOptions coptions=new ChromeOptions();
		//WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver(coptions);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		
	}

}
