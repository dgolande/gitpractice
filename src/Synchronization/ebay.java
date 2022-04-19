package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footer = driver.findElement(By.id("glbfooter"));
		
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		
		WebElement tools = footer.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		
		System.out.println(tools.findElements(By.tagName("a")).size());
		
		String Beforeclicking = null;
		String Afterclicking;
		
		
		for(int i=1;i<tools.findElements(By.tagName("a")).size();i++)
		{
			
			if(tools.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{
				Beforeclicking = driver.getTitle();
				
				tools.findElements(By.tagName("a")).get(i).click();
				break;
			}
			
		}
		
		Afterclicking = driver.getTitle();
		
		if(Beforeclicking!=Afterclicking)
		{
			if(driver.getPageSource().contains("Sitemap"))
			
			System.out.println("Pass");	
		}
		
		else
		{
			System.out.println("Fail");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
