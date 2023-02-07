package Naukri_Jobs;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Naukri_ResumeUpdate 
{
	public static WebDriver driver;
	public static void main(String[] args) 
	{
		String username="qa.abinash.das@gmail.com";
		String password = "@Monaukripass1996";
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__icon']")).click();
		driver.findElement(By.xpath("//a[@class='nI-gNb-info__sub-link']")).click();
		
		WebElement fileupload = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		Actions act = new Actions(driver);
		act.click(fileupload).perform();
		
		StringSelection file = new StringSelection("C:\\Users\\das_a\\Desktop\\Resume_Abinash Das.pdf");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		
		
		
	}
}
			

	


