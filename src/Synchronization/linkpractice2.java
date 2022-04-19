package Synchronization;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkpractice2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		//Footer
		
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		
		
		WebElement socialdriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[4]/ul"));
		
		System.out.println(socialdriver.findElements(By.tagName("a")).size());
		
		
		for (int j=1;j<socialdriver.findElements(By.tagName("a")).size();j++)
		{
			String clickbale = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			socialdriver.findElements(By.tagName("a")).get(j).sendKeys(clickbale);
			
			Thread.sleep(5000);
		}
		
		
		Set<String> window = driver.getWindowHandles();
		
		Iterator<String> IT = window.iterator();
		
		
		while(IT.hasNext())
		{
			
			driver.switchTo().window(IT.next());
			System.out.println(driver.getTitle());
			
		}
		
		
		
		
		

	}

}
