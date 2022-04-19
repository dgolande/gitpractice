package stream;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class filter_search_webelement_2 {

	public static void main(String[] args) throws InterruptedException 
	{
		

		DesiredCapabilities ch = DesiredCapabilities.chrome();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
		ChromeOptions c= new ChromeOptions();
		
		c.merge(ch);
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(c);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		
		
		driver.findElement(By.id("task-table-filter")).sendKeys("in progress");
		
		Thread.sleep(5000);
		
		List<WebElement> status = driver.findElements(By.xpath("//*[@class='panel panel-primary']/table/tbody/tr/td[4]"));
		
		
		List<WebElement> items = status.stream().filter(s->s.getText().contains("in progress")).collect(Collectors.toList());
		
		
		Assert.assertEquals(status, items);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
