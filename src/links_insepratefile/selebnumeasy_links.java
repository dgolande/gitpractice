package links_insepratefile;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class selebnumeasy_links {

	public static void main(String[] args) throws InterruptedException 
	{
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions c = new ChromeOptions();
		
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(c);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		WebElement footer = driver.findElement(By.cssSelector("[class='footer']"));
		
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		
		WebElement tutor = footer.findElement(By.xpath("//footer/div/div[1]"));
		
        System.out.println(tutor.findElements(By.tagName("a")).size());
        
        
        for(int i=0;i<tutor.findElements(By.tagName("a")).size();i++)
        {
        	
        	String Click = Keys.chord(Keys.CONTROL,Keys.ENTER);
        	
        	tutor.findElements(By.tagName("a")).get(i).sendKeys(Click);
        	
        	
        }
        
        
        Set<String> win = driver.getWindowHandles();
        
        Iterator<String> IT = win.iterator();
        
        
		while(IT.hasNext())
		{
			driver.switchTo().window(IT.next());
			
			System.out.println(driver.getTitle());
			
			Thread.sleep(2000);
			
			driver.close();
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
