package MyFirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath(".//input[@name='cusid']")).sendKeys("1234");
		driver.findElement(By.xpath(".//input[@name='submit']")).click();
		driver.switchTo().alert().accept();
		String str = driver.switchTo().alert().getText();
		
		if (str.equals("Customer Successfully Delete!"))
		{
			driver.switchTo().alert().accept();
			System.out.println("Action successfull");
		}
		else
		{
			System.out.println("No Text matches");
		}
		
	}

}
