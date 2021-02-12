package MyFirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	/*	
		driver.get("http://demo.guru99.com/test/social-icon.html");
		driver.manage().window().maximize();
		
		String icon="Facebook";
		
		String target = driver.findElement(By.xpath(".//a[@title='Facebook']")).getAttribute("title");
		
		System.out.println("target value is " +target);
		
		if (icon.contentEquals(target))
		{
			System.out.println("Matched");
		}
		else 
		{
			System.out.println("Not Matched");
		}
	*/
		
		driver.get("http://demo.guru99.com/test/tooltip.html");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath(".//a[@id='download_now']"));
		
		Actions a1= new Actions(driver);
		
		a1.moveToElement(ele).clickAndHold().build().perform();
		
		//WebElement tooltip=driver.findElement(By.xpath("//*[@id='demo_content']/div/div/div/a"));
		
		WebElement tooltip=driver.findElement(By.xpath("//a[@href='/release-notes']"));
		
		System.out.println(tooltip.getText());
		
		
	
		
		
		
	}

}
