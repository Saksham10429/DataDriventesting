package Selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class practice_test {
	WebDriver name;
	String url= "https://www.facebook.com/";
	String url1="https://www.instagram.com/";
	
	
	
@BeforeTest()
public void testcase0() {
	
	WebDriverManager.chromedriver().setup();
//	WebDriverManager.firefoxdriver().setup();
//	WebDriverManager.iedriver().setup();
//	 name= new FirefoxDriver();
//	 name= new InternetExplorerDriver();
	name = new ChromeDriver();
		//	name.manage().window().maximize();
			
			name.get(url);
			
	
}
	
		@Test()
		public void testcase1() throws InterruptedException {
			Thread.sleep(2000);
		//name.findElement(By.id("email")).sendKeys("Admin");
			name.findElement(By.xpath("//*[@class='inputtext _55r1 _6luy']")).sendKeys("saksham@gmail.com");
			
			name.findElement(By.xpath("//*[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("saksham@123");
			name.findElement(By.xpath("//*[@name='login' and @type='submit' and @class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
			Thread.sleep(3000);
			
		}
@AfterTest(enabled=false)
public void testcase2() {
	name.close();
	
}
		
		
	}


//	public static void main(String[] args) throws InterruptedException {
//
//		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		//WebDriver driver;
//		
//		String URL = "https://demoapp.skillrary.com";
//		driver.get(URL);
//		driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("user");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("user");
//		driver.findElement(By.xpath(" //button[@id='last']")).click();
//	}
//
//}
