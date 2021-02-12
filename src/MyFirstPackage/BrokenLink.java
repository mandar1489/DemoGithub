package MyFirstPackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrokenLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		String homepage="https://www.zlti.com/";
		driver.get(homepage);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		//Iterator<WebElement> it= links.iterator();
		
		for(int i=0 ; i < links.size();i++)
		{
			String op= links.get(i).getAttribute("href");
			
			System.out.println("URL"+op);
			
			if (op.equals(null) || op.isEmpty())
			{
				System.out.println("URL not configured");
				continue;
			}
//			if (op.startsWith(homepage))
//			{
//				System.out.println("URL belongs to home domain");
//				continue;
//			}
		
			
			try
			{
				HttpURLConnection huc = (HttpURLConnection)(new URL(op).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				
				int code= huc.getResponseCode();
				
				if(code >= 400)
				{
					System.out.println("URL broken");
				}
				else
				{
					System.out.println("URL valid");
				}
			}
			catch (MalformedURLException e)
			{
				//e.printStackTrace();
			}
			catch (IOException e1)
			{
				//e1.printStackTrace();
			}
		}
		
	}

}
