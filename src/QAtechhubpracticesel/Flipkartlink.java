package QAtechhubpracticesel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkartlink {

	public static void main(String[] args) 
	{
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
        ChromeOptions c = new ChromeOptions();
        
        c.merge(ch);
        
        System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver(c);
        
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts();
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        
        driver.get("https://flipkart.com");
        
        WebDriverWait w = new WebDriverWait(driver,5);
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='_2KpZ6l _2doB4z']")));
        
        
        driver.findElement(By.cssSelector("[class='_2KpZ6l _2doB4z']")).click();
        
        //Link count
        List<WebElement> link = driver.findElements(By.tagName("a"));
        
        int count = link.size();
        
        System.out.println("The links on the home page are "+count);
        
        
        
       //print lnk text
        
        for(int i=0;i<count;i++)
        {
             String lnk =  link.get(i).getAttribute("href");
       
            System.out.println(lnk);
        }
        
        
        
        List<WebElement> alllink = driver.findElements(By.tagName("a"));
        
        
        for(WebElement getlink : alllink )
        {
        	System.out.println(getlink.getText());
        	
        	System.out.println(getlink.getAttribute("href"));
        }
        
        
        
        
        
      
          		
		
	}

}
