package com.pages.automation.java.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTablePage {
	
	
	private WebDriver driver;
	
	By clickWebTablelink= By.linkText("WebTable");
	
	public WebTablePage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void ClickWebTableLink() {
		
		driver.findElement(clickWebTablelink).click();
		
	}

}
