package HandlingHTTPs;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class demoautomationwindows {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions c= new ChromeOptions();
		
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(c);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		FileUtils.copyFile(src, new File("F://Automationprac.png"));
		
		
		
		WebElement dropdown= driver.findElement(By.cssSelector("[class='dropdown-toggle']"));
		
		
		Actions act = new Actions(driver);
		
		act.moveToElement(dropdown).build().perform();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()='Windows']")).click();
		
		
	    WebElement frame1 = driver.findElement(By.id("aswift_2"));
	    
	    driver.switchTo().frame(frame1);
	    
	    
	    WebElement frame2 = driver.findElement(By.id("ad_iframe"));
	    
	    driver.switchTo().frame(frame2);
	    
	    
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.id("dismiss-button")).click();
	    
	    
	    driver.switchTo().defaultContent();
	    
	
	    
	    driver.findElement(By.cssSelector("[id='Tabbed'] [class='btn btn-info'] ")).click();
	    
	    
		String parentwin = driver.getWindowHandle();
		
		Set<String> allwin = driver.getWindowHandles();
		
		System.out.println(allwin.size());
		
		Iterator<String> IT = allwin.iterator();
		
		String current = IT.next();
		
		driver.switchTo().window(current);
		
		System.out.println(driver.getCurrentUrl());
		
		String child = IT.next();
		
		driver.switchTo().window(child);
		
		System.out.println(driver.getCurrentUrl());
		
		
		WebElement msg = driver.findElement(By.xpath("//*[@class='banner-message']/div/h2"));
		
		Assert.assertTrue(msg.isDisplayed());
		
		System.out.println(msg.getText());
		
		Thread.sleep(2000);
		
		driver.close();
		
		Thread.sleep(5000);
		
		driver.switchTo().window(current);
		
		System.out.println(driver.getTitle());
		
		
		WebElement sep_win = driver.findElement(By.xpath("//*[@class='tabpane pullleft']/ul/li[2] "));
				
		sep_win.click();
		
		
		driver.findElement(By.cssSelector("[class='btn btn-primary']")).click();
		
		System.out.println(driver.getTitle());
		
		
		
		
		
		Set<String> winsall = driver.getWindowHandles();
		
		Iterator<String> IT_sep = winsall.iterator();
		
		String Current_sep = IT_sep.next();
		
		System.out.println("The current URL is "+driver.getCurrentUrl());
		
		String next_sep = IT_sep.next();
		
		
		System.out.println("The seprate window URL is"+driver.getCurrentUrl());
		
		
		
		
		
		
		
		
		
	}

}
