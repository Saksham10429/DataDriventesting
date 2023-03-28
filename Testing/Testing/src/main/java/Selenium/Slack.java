package Selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slack {




		public static void main(String[] args) throws InterruptedException, AWTException 
		{
		System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver.exe");
																				//WebDriverManager.chromedriver().setup();
		WebDriver wb= new ChromeDriver();
		Robot rc = new Robot();


		wb.navigate().to("https://slack.com/intl/en-in");
		wb.manage().window().maximize();
		Thread.sleep(4000);
		
		wb.findElement(By.xpath("//a[@class='c-nav--signed-out__link']")).click();
		Thread.sleep(4000);
		
		//login to slack
		wb.findElement(By.xpath("//span[contains(text(),'Sign in with Google')]")).click();
		Thread.sleep(4000);
		wb.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("Saksham.agrawal@Moolya.com");
		Thread.sleep(1000);
		wb.findElement(By.xpath("//*[@class='VfPpkd-vQzf8d']")).click();
		Thread.sleep(3000);
		
		wb.findElement(By.xpath("//*[@class='whsOnd zHQkBf']")).sendKeys("Saksham@123");
		Thread.sleep(2000);
		
		
		
		wb.findElement(By.xpath("//*[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qfvgSe qIypjc TrZEUc lw1w4b']")).click();
		Thread.sleep(5000);
		//Select the Work Space 
		wb.findElement(By.xpath("//*[@class='p-workspace_info__action']")).click();
		Thread.sleep(3000);
		//Thread.sleep(2000);
		//Set<String> tabs =wb.getWindowHandle();
		rc.keyPress(MenuKeyEvent.VK_CONTROL);
		rc.keyPress(MenuKeyEvent.VK_TAB);
		//Thread.sleep(2000);
	Set<String> tabs = wb.getWindowHandles();
	for(String handles:tabs)
		{
		wb.switchTo().window(handles);
			System.out.println(wb.getTitle());
			//wb.switchTo().window(pTab);
			//wb.get("https://www.google.com");
//			W.close();
			//wb.switchTo().window(handles);
			//wb.quit();
			//wb.close();
		}
		//Thread.sleep(2000);
		//Open a new tab using Ctrl + t --- Used to Open New Tab 
		//wb.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		
		//Switch between tabs using Ctrl + \t      //--- Used to switch between the tab in same Windows 
	//	wb.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
		//wb.navigate().to("https://slack.com/intl/en-in");
		
		Thread.sleep(5000);
	
		//Used To Search the name in slack
		//wb.findElement(By.xpath("//*[@class='ql-placeholder']")).sendKeys("Sunil");
		//wb.findElement(By.xpath("//*[@class='p-top_nav__search__container']")).click();
		
		
		wb.findElement(By.xpath("//*[@class='c-button-unstyled p-top_nav__search p-top_nav__search--windows-linux p-top_nav__search--toggle-larger-top-nav-bar']")).sendKeys("Sunil nagaraj");
		Thread.sleep(3000);
		rc.keyPress(MenuKeyEvent.VK_DOWN);//goging to first option
		rc.keyPress(MenuKeyEvent.VK_DOWN);
		rc.keyPress(MenuKeyEvent.VK_ENTER);
		
		wb.findElement(By.xpath("//*[//div[@class='ql-editor ql-blank']//p")).click();
		Thread.sleep(2000);
        wb.findElement(By.xpath("//*[@class='ql-editor ql-blank']//p")).sendKeys("Sir");
//		//Thread.sleep(4000);
//		wb.findElement(By.xpath("//*[@id='welcome']")).click();
//		
//		wb.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
//		wb.quit();
		}

}
//we have to use relative xpath
// 



