package com.base.automation.java.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.automation.java.testng.WebTablePage;

public class ExcelReadData {
	private WebDriver driver;
	@Test(dataProvider = "DataReading")
	public void methodReadDataFromExcel(String name,String gender) throws IOException
	{  // File file=new File();
		FileInputStream filepinput=new FileInputStream("C:\\driver\\Master\\ReadData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(filepinput);
		XSSFSheet sheet= workbook.getSheetAt(0);
		int LastRowNum= sheet.getLastRowNum();
		for(int i=0;i<LastRowNum;i++)
		{
			XSSFRow rowValue= sheet.getRow(i);
			
			int  cellnum= rowValue.getLastCellNum();
			
			for(int j=0;j<cellnum;j++)
			{
				XSSFCell cellValue =rowValue.getCell(j);
				
				System.out.println(cellValue.getStringCellValue());
				
				ChromeOptions coptions=new ChromeOptions();
				//WebDriverManager.chromedriver().setup();
				
				driver=new ChromeDriver(coptions);
				
				driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.get("https://demo.automationtesting.in/Alerts.html");
				
				//WebTablePage objWebTable=new  WebTablePage(driver);
				driver.findElement(By.linkText("Home")).click();
				
				driver.findElement(By.id("email")).sendKeys(name);
				
			}
			System.out.println( );
		}
	}
	
	@DataProvider(name="DataReading")
	public Object[][] DataReading()
	{
	return new Object[][]
			{
		{"",""}
			};
		

}

}
