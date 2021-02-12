package MyFirstPackage;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php#");
		
		List <WebElement> Col = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
		
		List <WebElement> rowdata=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td/a"));
		List <WebElement> rowdata1=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[2]"));
		List <WebElement> rowdata2=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[3]"));
		List <WebElement> rowdata3=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[4]"));
		List <WebElement> rowdata4=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[5]/font"));

		
		/* pick random no. and print row based on rand no.

		Random rand = new Random();
		int int_random= rand.nextInt(rowdata.size());
		System.out.println("Random value is" +int_random);
		
		
		System.out.println("Data of random row"+" "+rowdata.get(int_random).getText()+" "+rowdata1.get(int_random).getText()+" "+rowdata2.get(int_random).getText()+" "+rowdata3.get(int_random).getText()+" "+rowdata4.get(int_random).getText());
		
	
		*/
		
		for (int k=0;k<rowdata.size();k++)
		{
		System.out.println("Data of random row"+" "+rowdata.get(k).getText()+" "+rowdata1.get(k).getText()+" "+rowdata2.get(k).getText()+" "+rowdata3.get(k).getText()+" "+rowdata4.get(k).getText());
		}
		
		
		
		
		
		
		
//				
//		for (int i=0;i<abc.size();i++)
//		{
//			
//			System.out.println("Column names are" + abc.get(i).getText());
//		}
//		
		/*
		List <WebElement> abc1=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td/a"));
		System.out.println("No. of rows"+abc1.size());
		
		for (int i=0;i<abc.size();i++)
		{
			System.out.println(abc.get(i).getText());
		}
		*/
	
		
	
				
				

	}

}
