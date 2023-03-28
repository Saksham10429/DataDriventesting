package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project2 {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver wb= new ChromeDriver();
		
		//login
		
		wb.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login"); //opeans the url
		wb.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");  // gives the username
		wb.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");  // gives the password
		wb.findElement(By.xpath("//*[@id='btnLogin']")).click();   // click on the login button
		wb.findElement(By.xpath("//*[@id='welcome']")).click();    // click on the welcome paul
		Thread.sleep(2000);         // sleep time duration
		
		//about section
		
		wb.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[1]/a")).click();
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='displayAbout']/div/a")).click();
		
		//support section
		
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")).click();
		Thread.sleep(2000);
		
		//adding a user
		
		wb.findElement(By.xpath("//*[@id='btnAdd']")).click();
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='systemUser_employeeName_empName']")).sendKeys("Admin A");
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='UserHeading']")).click();
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='systemUser_userName']")).sendKeys("Saksham222");
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='systemUser_password']")).sendKeys("Saksham@29");
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='systemUser_confirmPassword']")).sendKeys("Saksham@29");
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='btnSave']")).click();
		
		//deleting a user
		
		wb.findElement(By.xpath("//*[@id='searchSystemUser_userName']")).sendKeys("Saksham222");
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='searchBtn']")).click();
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_72']")).click();
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='btnDelete']")).click();
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='dialogDeleteBtn']")).click();
		
		//logout
		Thread.sleep(4000);
		wb.findElement(By.xpath("//*[@id='welcome']")).click();
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();  // click on logout
		Thread.sleep(5000);
		wb.close();
	}
}