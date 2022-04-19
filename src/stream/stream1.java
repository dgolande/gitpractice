package stream;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class stream1 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions c = new ChromeOptions();
		
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
	
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("F://offers.png"));
			
			
		
		//click on column
		
		driver.findElement(By.xpath("//*[@role='columnheader'] [1]")).click();
		
		
		//driver.findElement(By.xpath("//tr/th[1]")).click();
		
		
		//Capture all elements into list
		
		
		List<WebElement> elementlist = driver.findElements(By.xpath("//tr/td[1]"));
		
		
		//capture text of all webelements into new(original) list
		
		List<String> originalist = elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
		
		
		//sort the original list of step 3 -> sorted list
		
		List<String> sortedlist = originalist.stream().sorted().collect(Collectors.toList());
		
		
		//Compare original list to sorted list
		
		
		Assert.assertEquals(originalist, sortedlist);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
