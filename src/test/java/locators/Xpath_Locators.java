package locators;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Locators 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://en-gb.facebook.com");
		
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("abinash");
		
		//xpath with OR operator
		driver.findElement(By.xpath("//input[type='text' or @name='email']")).sendKeys("abinash");
		
		//xpath with ADD operator
		//driver.findElement(By.xpath("//input[@type='password' and @name='pass']")).sendKeys("passwordisnothing");
		
		//xpath with contains method also can be used for the text
		//driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("abinashpassword");
		
		//xpath with STARTS-WITH
		driver.findElement(By.xpath("//input[starts-with(@id,'pas')]")).sendKeys("abinashpasswordlalallalalla");
		 
		//chained xpath
		
	}
}
