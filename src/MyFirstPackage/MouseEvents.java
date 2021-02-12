package MyFirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	
		//driver.get("http://demo.guru99.com/test/newtours");
		//driver.get("http://demo.guru99.com/test/facebook.html");
		
		driver.get("http://demo.guru99.com/test/upload/");
		//WebElement obj= driver.findElement(By.cssSelector("a[href=\"index.php\"]"));
		//WebElement obj= driver.findElement(By.cssSelector("input[name=\"email\"]"));
		WebElement obj= driver.findElement(By.cssSelector("input[id=\"uploadfile_0\"]"));
		
		//Actions a1=new Actions(driver);
		//Action a2=a1.moveToElement(obj).click().keyDown(Keys.SHIFT).sendKeys("abc@gmail.com").keyUp(Keys.SHIFT).contextClick().build();
		//Action a2=a1.moveToElement(obj).click().keyDown(Keys.SHIFT).sendKeys("abc").keyUp(Keys.SHIFT).sendKeys("@gmail.com").doubleClick(obj).build();
		//a2.perform();
		
			//obj.click();
			obj.sendKeys("C:\\Users\\Admin\\Desktop\\a.txt");
			
			WebElement obj1= driver.findElement(By.cssSelector("input[id=\"terms\"]"));
			obj1.click();
			
			WebElement obj2= driver.findElement(By.cssSelector("button[id=\"submitbutton\"]"));
			obj2.click();
					}

}
