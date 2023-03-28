package Selenium;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver;
	public String URL = "https://opensource-demo.orangehrmlive.com";
@Parameters("mybrowser")
@BeforeTest
	 public void beforeTest(String mybrowser)  {
	 	 if(mybrowser.equalsIgnoreCase("firefox"))
	 	 {
	 		 WebDriverManager.firefoxdriver().setup();
	 		 driver = new FirefoxDriver();
	 	 }
	 	 else if(mybrowser.equalsIgnoreCase("chrome"))
	 	 {
	 		 WebDriverManager.chromedriver().setup();
	                                                  //System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
	 	    driver = new ChromeDriver();
	 	 }
	 	 else if(mybrowser.equalsIgnoreCase("EdgeDriver"))
	 	 {
	 		 WebDriverManager.edgedriver().setup();
	 		 driver = new EdgeDriver();
	 	 }

	 	//driver.manage().window().maximize();
	 	 }


  /*@Test(dataProvider = "dp" )
  public void f(String n, String s) throws InterruptedException {
	  driver.get(URL);
	  driver.findElement(By.id("txtUsername")).sendKeys(n);
		driver.findElement(By.id("txtPassword")).sendKeys(s);
		driver.findElement(By.id("btnLogin")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
  }*/
  @Test()
	public void testcase1() throws InterruptedException {
		driver.get(URL);
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");  // gives the username
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");  // gives the password
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		// click on the login button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='welcome']")).click();    // click on the welcome paul
		Thread.sleep(3000);         // sleep time duration
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
	}

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "Admin", "admin123" },
    };
  }

  
  
  @AfterTest
  public void afterTest() {
  }

}
