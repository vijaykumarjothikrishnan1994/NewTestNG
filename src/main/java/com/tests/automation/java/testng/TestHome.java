package com.tests.automation.java.testng;

import static org.mockito.Mockito.timeout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.automation.java.testng.HomePage;

public class TestHome {
	
	private WebDriver driver;
	
	@BeforeMethod
	public void BeforeInVokeTest()
	{
		
	}
	@Test
	public void HomePageMethod() {
		
		//driver=new ChromeDriver();
		
		ChromeOptions coptions=new ChromeOptions();
		//WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver(coptions);
		
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		HomePage pageObj=new HomePage(driver);
		
		pageObj.ClickHomeBtnMethod();
		pageObj.EnterEmailinHomePage("qwe@gmail.com");
		pageObj.SubmitEmailinHomePage();
		
	}
	
	@Test(groups={"smoke"})
	public void ValidatesmokeTest() {
		
		System.out.println("This is Home");
		
	}
	@Test(groups={"Regression"})
	public void ValidateRegTest() {
		
		System.out.println("This is Home");
		
	}
	
	@AfterMethod
	public void AfterInvokeTest() {
		
		driver.close();
		
		
	}

}
