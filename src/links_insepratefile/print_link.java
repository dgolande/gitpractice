package links_insepratefile;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class print_link {

	public static void main(String[] args) throws InterruptedException 
	{
DesiredCapabilities ch = DesiredCapabilities.chrome();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions c = new ChromeOptions();
		
		ch.merge(ch);
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(c);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript("window.scroll(0,2000)");
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int count = links.size();
		
		System.out.println(count);
		
		
		WebElement footer = driver.findElement(By.id("gf-BIG")); //limiting webdriver scope
		
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		
		WebElement discount = footer.findElement(By.xpath("(//table/tbody/tr/td/ul) [1]"));
		
		System.out.println(discount.findElements(By.tagName("a")).size());
		
			
		
		for(int i=1;i<discount.findElements(By.tagName("a")).size();i++)
		{
			
			String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			discount.findElements(By.tagName("a")).get(i).sendKeys(click);
			
			
			Thread.sleep(5000);
		
		}
		
			Set<String> win = driver.getWindowHandles();
			
			Iterator<String> IT = win.iterator();
			
			while(IT.hasNext())
			{
				driver.switchTo().window(IT.next());
				
				System.out.println(driver.getTitle());
				
				
			}
			
			
		
		
		
		
		
		
		
		
		


	}

}
