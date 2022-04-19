package stream;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class sel_easy_input_forms {

	public static void main(String[] args) throws InterruptedException 
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
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		
		driver.findElement(By.xpath("//*[@class='nav navbar-nav']/li[1]")).click();
		
		
		List<WebElement> demo = driver.findElements(By.xpath("//*[@class='nav navbar-nav']/li[1]/ul/li"));
		
		int count = demo.size();
		
		for(int i=0;i<count;i++)
		{
			String options = driver.findElements(By.xpath("//*[@class='nav navbar-nav']/li[1]/ul/li")).get(i).getText();
			
			if(options.equalsIgnoreCase("Simple Form Demo"))
			{
				driver.findElements(By.xpath("//*[@class='nav navbar-nav']/li[1]/ul/li")).get(i).click();
				
				break;
			}
			
		}
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[title='Close']")).click();
		
	    driver.findElement(By.cssSelector("[placeholder='Please enter your Message'] ")).sendKeys("Selenium Automation Practice");
		
		
		driver.findElement(By.cssSelector("[onclick='showInput();'] ")).click();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scroll(0,600)");
		
		
		driver.findElement(By.id("sum1")).sendKeys("48");
		
		
		driver.findElement(By.id("sum2")).sendKeys("21");
		
		
		driver.findElement(By.cssSelector("[onclick='return total()']")).click();
		
		js.executeScript("window.scroll(0,0)");
		
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@class='nav navbar-nav']/li[1]")).click();
		
		for(int j=0;j<count;j++)
		{
			String options = driver.findElements(By.xpath("//*[@class='nav navbar-nav']/li[1]/ul/li")).get(j).getText();
			
			if(options.equalsIgnoreCase("Checkbox Demo"))
			{
				driver.findElements(By.xpath("//*[@class='nav navbar-nav']/li[1]/ul/li")).get(j).click();
				
				break;
			}
			
		}
		
		Thread.sleep(5000);
		
		Assert.assertFalse(driver.findElement(By.id("isAgeSelected")).isSelected());
		
		driver.findElement(By.id("isAgeSelected")).click();
		
		Assert.assertTrue(driver.findElement(By.id("isAgeSelected")).isSelected());
		
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.cssSelector("[class='btn btn-primary']")).click();

		js.executeScript("window.scroll(0,0)");
		
		
		
		
		
	}

}
