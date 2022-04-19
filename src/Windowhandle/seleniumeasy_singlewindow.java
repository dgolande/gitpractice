package Windowhandle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class seleniumeasy_singlewindow {

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
		
		
		
		driver.findElement(By.xpath("(//div/h5//following-sibling::a[1]) [1]")).click();
		
		Set<String>win = driver.getWindowHandles();
		
		
		Iterator<String> IT = win.iterator();
		
	    String parentwin = IT.next();
	    
	    System.out.println(driver.getTitle());
	    
	    
	    String childwin = IT.next();
		
	    driver.switchTo().window(childwin);
	
	    System.out.println(driver.getTitle());
		
	    driver.switchTo().activeElement().sendKeys("DDDDDDDDDDDDDDDDDDDD");
	    
	    Thread.sleep(1000);
	    
	    driver.close();
	    
	    driver.switchTo().window(parentwin);
	    
	    System.out.println(driver.getTitle());
	    
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.xpath("(//div/h5//following-sibling::a[1]) [2]")).click();
		
		
		Thread.sleep(2000);
		
	
		
		
		
		
	    String facebookwin = IT.next();
		
	    driver.switchTo().window(facebookwin);
	
	    System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
