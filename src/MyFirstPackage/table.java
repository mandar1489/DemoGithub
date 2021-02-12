package MyFirstPackage;

import java.io.ObjectInputStream.GetField;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("http://demo.guru99.com/test/write-xpath-table.html");
	//	driver.get("http://demo.guru99.com/test/accessing-nested-table.html");
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		driver.manage().window().maximize();
//		WebElement abc= driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]"));
//		System.out.println(abc.getText());
		
		
//	WebElement abc= driver.findElement(By.xpath("/html/body/center[1]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]"));
//	System.out.println(abc.getText());
	
	
		//String abc= driver.findElement(By.xpath("//table[@width='270']/tbody/tr[3]/td")).getText();
		
		//WebElement abc=driver.findElement(By.xpath("//table[@width='270']/tbody/tr[3]/td"));
		
		String abc=driver.findElement(By.xpath("//table/tbody/tr/td[2]"
												+"//table/tbody/tr[4]/td/table/tbody/tr/td[2]/"
												+"table/tbody/tr[2]/td[1]/"
												+"table[2]/tbody/tr[3]/td[2]/font")).getText();
		//String x= driver (abc);
		System.out.println(abc);
	
	
			
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
	
	}

	private static String GetField(WebElement abc) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getCssValue(WebElement abc) {
		// TODO Auto-generated method stub
		return null;
	}

}
