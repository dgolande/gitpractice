package Synchronization;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkspractice {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footdriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footdriver.findElements(By.tagName("a")).size());
		
		
		
		
		WebElement columndriver = footdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		
		          for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
				{
                        	String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
                        	columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
                        	
                        	Thread.sleep(5000);
				}
				
                 
		        Set<String> windows = driver.getWindowHandles();
		        
		        Iterator<String> IT = windows.iterator();
 		
		        while(IT.hasNext())
		        {
		        	driver.switchTo().window(IT.next());
		        	
		        	System.out.println(driver.getTitle());
		        }
		
		
		
		
		
		
		
		
		
		

	}

}
