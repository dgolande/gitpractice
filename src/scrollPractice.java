import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class scrollPractice {

	public static void main(String[] args) throws InterruptedException 
	{
		
		DesiredCapabilities ch =  DesiredCapabilities.chrome();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions c = new ChromeOptions();
		
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.get("https://www.udemy.com/course/selenium-real-time-examplesinterview-questions/learn/lecture/15687474#overview");
		
		
		driver.findElement(By.cssSelector("[name='email']")).sendKeys("Dhananjay_9922@rediffmail.com");
		
		
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("Pune@123");
		
		
		driver.findElement(By.cssSelector("[name='submit']")).click();
		
		Thread.sleep(5000);
		
	   JavascriptExecutor js = (JavascriptExecutor)driver;
		
	//	js.executeScript("window.scroll(0,650)");
		
		
          Thread.sleep(500);
		
		js.executeScript("document.querySelector('.app--sidebar-column--2t0E8').scrollTop=8000");

		
		/*
		
		List<WebElement> tables = driver.findElements(By.xpath(""))
		
		
		//*[@align='left'] [2]
		
		
				[class='app--sidebar-column--2t0E8']
		
		*
		*/
	}

}
