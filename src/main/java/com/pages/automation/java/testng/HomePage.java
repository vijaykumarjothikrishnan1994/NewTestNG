package com.pages.automation.java.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
  
	private WebDriver driver;
	
	By clickHomeBtn=By.linkText("Home");
	By enterEmail=By.xpath("//input[contains(@id,'email')]");
	By clickSubmitBtn= By.xpath("//img[contains(@id,'enterimg')]");
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void ClickHomeBtnMethod() {
		
		driver.findElement(clickHomeBtn).click();
	}
	
	public void EnterEmailinHomePage(String ValueEnterEmail)
	{
		driver.findElement(enterEmail).sendKeys(ValueEnterEmail);
	}
	public void SubmitEmailinHomePage()
	{
		driver.findElement(clickSubmitBtn).click();
	}
}
