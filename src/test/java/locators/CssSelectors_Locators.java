package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//CSS SELECTOR
public class CssSelectors_Locators 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com");
		
		//Tag & Id 
		//driver.findElement(By.cssSelector("#email")).sendKeys("das.abinash07@gmail.com");
		
		//Using Tag & class   //we can ignore the tag name also as it is optional
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("das.abinash07@gmail.com");
		
		//Tag & attribute Tag[attribute=value] can ignore the tagname also optional
		//driver.findElement(By.cssSelector("input[id=pass]")).sendKeys("abinashdas");
		
		//Tag & class & attribute  locate the element uniquely if pointing to multiple element
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("password");
	}
}
