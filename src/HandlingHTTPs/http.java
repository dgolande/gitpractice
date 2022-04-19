package HandlingHTTPs;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class http {

	public static void main(String[] args) throws InterruptedException 
	{
		
      
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions c = new ChromeOptions();
		
		c.merge(ch);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(c);
		
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://in.bookmyshow.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[class='No thanks']")).click();
		
		
		driver.findElement(By.xpath("//*[@class='sc-eNNmBn gUcQrr']/li[3]")).click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[class='sc-gmeYpB MZHt']")).click();
		
		WebElement search = driver.findElement(By.cssSelector("[type='text']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("movies").build().perform();

		Thread.sleep(2000);

		List<WebElement> options = driver.findElements(By.cssSelector("[class='sc-chAAoq eOvVUt']"));
		
		int count = options.size();
		 
		System.out.println(count);		
		
		for(int i=0;i<count;i++)
		{
			String mnames = driver.findElements(By.cssSelector("[class='sc-chAAoq eOvVUt']")).get(i).getText();
			
			System.out.println(mnames);
		
			
		
			
			if(mnames.contains("Ramraj"))
			{
				driver.findElements(By.cssSelector("[class='sc-chAAoq eOvVUt']")).get(i).click();
				break;
			}
		}
		
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		
	//	JavascriptExecutor js= (JavascriptExecutor)driver;
		
	//	js.executeScript("window.scroll(0,1500)");
		
		
		driver.findElement(By.cssSelector("[class='brand']")).click();
		
	
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		
		
		
		
	}

}
