package MyFirstPackage;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TitleMatch {

	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		
		
		
		driver.get("https://www.yahoo.com/");
		String Title=driver.getTitle();
		System.out.println(Title);
		
		
		
		if (Title.contentEquals("Yahoo"))
		{
			System.out.println("Title Matched");
		}
		else
		{
			System.out.println("Title not Matched");	
	
		}
		
		//WebDriverWait abc = new WebDriverWait(driver,20);   ---explicit wait
		
//		WebElement lifelink = driver.findElement(By.linkText("BLM"));
//		abc.until(ExpectedConditions.visibilityOf(lifelink));
//		WebElement lifelink;
//		lifelink = abc.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("BLM")));
//		lifelink.click();
		
		//driver.findElement(By.linkText("Sign in")).click();
	
		
	//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
			
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		           			.withTimeout(30, TimeUnit.SECONDS)
						    .pollingEvery(5, TimeUnit.SECONDS)
						    .ignoring(NoSuchElementException.class);
	
	WebElement abc= wait.until(new Function<WebDriver,WebElement>()
	{
	public WebElement apply(WebDriver driver)
	{
		return driver.findElement(By.linkText("Life"));
	}
		});	
	abc.click();	
				
//		driver.close();
	}
	
	
}
