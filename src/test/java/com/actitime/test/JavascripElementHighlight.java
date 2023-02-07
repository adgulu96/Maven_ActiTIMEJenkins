package com.actitime.test;

import java.io.File;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.values.JavaUriHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import javaScriptConcepts.JavaScriptUtility;

public class JavascripElementHighlight 
{

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		
		WebElement username = driver.findElement(By.name("username"));
	    WebElement password = driver.findElement(By.name("pwd"));
	    WebElement loginbutton = driver.findElement(By.xpath("//div[.='Login ']"));
	    
	    //Flash a particular webelement of a particular time frame
	    JavaScriptUtility.flash(driver, username);
	    JavaScriptUtility.flash(driver, password);
	    
	    //Draw a border in the boundary of the webelement
	    JavaScriptUtility.drawBorder(driver, username);
	    JavaScriptUtility.drawBorder(driver, password);
	    
	    //Take screenshot of the full screen
	    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 	    FileUtils.copyFile(src, new File("./ScreenShots/screenshot1.png"));
 	    
 	    //Capture the title of the page
 	    //System.out.println(driver.getTitle());  //using selenium webdriver concept
 	    
 	    //capture the title of the page using the js executor
 	    String title=JavaScriptUtility.getTitleByJS(driver).toString();
 	    System.out.println(title);
 	    
 	    username.sendKeys("admin");
 	    password.sendKeys("manager");
 	    
 	    //clicking on the loginbutton element using the JS method
 	    JavaScriptUtility.clickOnElementJS(driver, loginbutton);
 	    
 	    //Generate the alert info
 	     //JavaScriptUtility.generateAlert(driver, "Clicked on the login button");
 	     
 	     //Refreshing the page
 	     //driver.navigate().refresh();
 	    Thread.sleep(2000);
 	    // JavaScriptUtility.refreshBrowserJS(driver);
 	     
 	     //SCROLLING THE PAGE UNTIL WE FOUND THE ELEMENT
 	     WebElement ele = driver.findElement(By.xpath("(//td[contains(text(),'Ready for')])[2]"));
 	     JavaScriptUtility.scrollIntoView(ele, driver);
 	     
 	     //SCROLLING THE PAGE
 	     
 	    
 	    
 	    
	    
	    
	}
}
