package MyFirstPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxValueTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php#");
		List<WebElement> abc1=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[4]"));
		
		
		
		Float a1= Float.parseFloat(abc1.get(0).getText());
		//System.out.println("Initial value is "+ a1);
		
		for (int i=0;i<abc1.size();i++)
		{
			Float a2= Float.parseFloat(abc1.get(i).getText());
			System.out.println("Value of a1" +a1);
			System.out.println("New Value a2" +a2);
			if(a2 < a1)
			{
				a1=a2;
				
			}
								
		}
		
		System.out.println("Final max value"+ a1);
		
	}

}
