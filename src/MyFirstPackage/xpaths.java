package MyFirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/selenium-xpath.html");
		
//		driver.findElement(By.xpath(".//input[@name='uid']")).sendKeys("Madhuri");
//		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Hello");
		
		WebElement a= driver.findElement(By.xpath("//*[contains(text(),'must not')]"));
		
		System.out.println("value"+a.getText());
		
		
		
		//*[@class='featured-box cloumnsize1']//*[text()='Testing']
	}

}
