package MyFirstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("http://demo.guru99.com/test/newtours/register.php");
		//driver.get("http://output.jsbin.com/osebed/2");
	//	driver.get("http://demo.guru99.com/test/link.html");
		driver.get("http://demo.guru99.com/test/accessing-link.html");
		
//		WebElement country =driver.findElement(By.name("country"));
//		country.sendKeys("ABC");
		
//		Select fruits = new Select(driver.findElement(By.id("fruits")));
//		fruits.selectByIndex(3);
//		fruits.selectByVisibleText("Apple");
		
	//	driver.findElement(By.cssSelector("a[href=\"http://www.fb.com\"]")).click();
		driver.findElement(By.partialLinkText("o here")).click();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
		//driver.close();
	}

}
