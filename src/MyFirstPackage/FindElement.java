package MyFirstPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/facebook.html");
		//driver.get("http://demo.guru99.com/test/ajax.html");
		
		//driver.get("http://demo.guru99.com/test/newtours");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail.com");
		//	driver.findElement(By.cssSelector("input.inputtext")).sendKeys("abc@gmail.com");
		//driver.findElement(By.cssSelector("input[id=email]")).sendKeys("abc@gmail.com");
		//WebElement abc = driver.findElement(By.cssSelector("a[title=\"Home\"]"));
		
	//WebElement ele=	driver.findElement(By.cssSelector("a[title=\"Home\"]"));
	
	WebElement ele=	driver.findElement(By.cssSelector("a[title=Home]"));
		
		
		
		//String str=abc.getText();
		//System.out.println("value of text is" +str);
		//abc.click();
		
		if (ele.getAttribute("title").equals("Home"))
		//if (str == "Demo Site")
		{
			System.out.println("Matched");
		}
		else
		{
			System.out.println("Not Matched");	
					}
		
	
	/*	
		WebElement status = driver.findElement(By.name("persistent"));
		
		for (int i=0; i<2 ;i++)
		{
			boolean a = status.isSelected();
			String s1=String.valueOf(a);
			
				
			if (s1.equals("false"))
			{
			status.click();
			System.out.println("In");
			}
	
		System.out.println("Status of radiobutton is" + status.isSelected());
		}
*/
		
		
//		
//		List<WebElement> abc = driver.findElements(By.cssSelector("input[name=name]"));
//		
//		for (int i=0;i< abc.size();i++)
//		{
//			System.out.println("Types are" + abc.get(i).getAttribute("type"));
//		}
//		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
}
}
