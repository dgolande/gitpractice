package JExecutor;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.flipkart.com/");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        
        driver.findElement(By.cssSelector("[class='_2KpZ6l _2doB4z']")).click();
        
        Actions act = new Actions(driver);
        
        act.moveToElement(driver.findElement(By.cssSelector("[class='_37M3Pb'] [alt='Fashion']"))).build().perform();
        
        Thread.sleep(1000);
        
        List<WebElement> fashion = driver.findElements(By.cssSelector("[class='_2IjXr8']"));
        
        int fcount = fashion.size();
        
        System.out.println(fcount);
        
        for(int i=0;i<fcount;i++)
        {
        	String fbrand = fashion.get(i).getText();
        	
        	System.out.println(fbrand);
        	
        }
        
        
        act.moveToElement(driver.findElement(By.cssSelector("[class='_1_3w1N']"))).build().perform();
        
        Thread.sleep(5000);
        
        /*
        WebElement link = driver.findElement(By.xpath("//div[@class='_3_Fivj']"));
        
        System.out.println(link.findElements(By.tagName("a")).size());
        
        //System.out.println(link.findElements(By.tagName("a")));
        
        
        for(int i=1;i<link.findElements(By.tagName("a")).size();i++)
        {
             	String Clickontab = Keys.chord(Keys.CONTROL,Keys.ENTER);
             	
                link.findElements(By.tagName("a")).get(i).sendKeys(Clickontab);
             	
                Thread.sleep(5000);
             	
        }
        
        
        
        
        Set<String> windows = driver.getWindowHandles();
        
        Iterator<String> IT = windows.iterator();
        
        while(IT.hasNext())
        {
        	driver.switchTo().window(IT.next());
        	
        	System.out.println(driver.getTitle());
        }
        
        */
        
        
        
        
        
	}

	

}
