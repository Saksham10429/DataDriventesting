package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project1 {
	//This can interact with any browser
	WebDriver driver;
	public String URL="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	
	@BeforeTest
	public void BT()
	{
		//
		//
		//
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver();
		driver = new ChromeDriver();
		//
		driver.manage().window().maximize();
		driver.get(URL);
		//
		//
		
	}
	@Test
	public void testcase1()
	{
		String ActualTitle = "OrangeHRM";
		String Expectedtile = driver.getTitle();
		Assert.assertEquals(Expectedtile, ActualTitle);
		
	}
	@AfterTest
	public void AT()
	{
		driver.close();
	}
	
	

}
