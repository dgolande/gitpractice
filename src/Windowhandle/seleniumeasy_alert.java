package Windowhandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class seleniumeasy_alert {

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
		
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		
		
		driver.findElement(By.cssSelector("[class='btn btn-default']")).click();
		
		Alert first_alert = driver.switchTo().alert();
		
		
		System.out.println(first_alert.getText());
		
		Thread.sleep(2000);
		
		first_alert.accept();
		
		
		
		driver.findElement(By.xpath("(//*[@class='btn btn-default btn-lg']) [1]")).click();
		
		
		Alert second_alert = driver.switchTo().alert();
		
		System.out.println(second_alert.getText());
		
		Thread.sleep(2000);
		
		second_alert.dismiss();
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//*[@class='btn btn-default btn-lg']) [2]")).click();
		
		Alert third_alert = driver.switchTo().alert();
		
		System.out.println(third_alert.getText());
		
		Thread.sleep(5000);
		
		third_alert.sendKeys("Alert");
	
		Thread.sleep(2000);
		
		third_alert.accept();

	}

}
