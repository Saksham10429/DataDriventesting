package Selenium;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class apachePOI {
	WebDriver driver;
	// public String URL = "https://opensource-demo.orangehrmlive.com";
	//i use apache poi it support both rh formate xls and xlsx
		
@Test
public void testcase1() throws IOException, InterruptedException
{
	
//File excel = new File("C:\\Users\\user\\Desktop\\dataselenium1.xls");
//FileInputStream fis = new FileInputStream(excel);

	File excel = new File("C:/Users/user/Desktop/DataDriven1.xlsx");
	FileInputStream fis2 = new FileInputStream(excel);
	XSSFWorkbook wb = new XSSFWorkbook(fis2);
	XSSFSheet sh = wb.getSheet("Sheet1");
                                                 //HSSFWorkbook wb = new HSSFWorkbook(fis2);
                                                 //HSSFSheet sh = wb.getSheet("Sheet1");
	int rowcount = sh.getLastRowNum();
	for (int i=0; i<=rowcount; i++)
	{
		String username = sh.getRow(i).getCell(0).getStringCellValue();
		String password = sh.getRow(i).getCell(1).getStringCellValue();
	//driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		//("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com");
		//driver.get(URL);
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(username);  // gives the username
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(password);  // gives the password
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	// click on the login button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='welcome']")).click();    // click on the welcome paul
		Thread.sleep(3000);         // sleep time duration
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
		driver.close();

}

}
}