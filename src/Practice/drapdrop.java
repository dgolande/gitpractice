package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class drapdrop {

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
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		WebElement items = driver.findElement(By.xpath("//*[text()='Draggable 1']"));
		
		WebElement dropzone = driver.findElement(By.cssSelector("[dropzone='move']"));
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		
		//act.dragAndDrop(items, dropzone).build().perform();
		
		act.clickAndHold(items).moveToElement(dropzone).release(dropzone).build().perform();		
		 
		
		*/

		
		
	}

}
