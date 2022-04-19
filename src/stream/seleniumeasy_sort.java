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

public class seleniumeasy_sort {

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
		
		
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		
		/*
		driver.findElement(By.cssSelector("[aria-label='Office: activate to sort column ascending']")).click();
		
		
		List<WebElement> cities = driver.findElements(By.xpath("//tr/td[3]"));
		
		
		List<String> original_list  = cities.stream().map(s->s.getText()).collect(Collectors.toList());
		
		
		List<String> sortedlist = original_list.stream().sorted().collect(Collectors.toList());
		
		
		Assert.assertEquals(original_list, sortedlist);
		
		
		
		
		*/
		
		Thread.sleep(2000);
		
		List<WebElement> name = driver.findElements(By.xpath("//*[@role='row']/td[1]"));
		
		List<String> l_names = name.stream().filter(s->s.getText().contains("C. Kelly")).map(s->getEmpage(s)).collect(Collectors.toList());
		
		l_names.forEach(a->System.out.println(a));
	
	}
		
		
		private static String getEmpage(WebElement s) {
			
			String age = s.findElement(By.xpath("//*[@role='row']/td[4]")).getText();
			
			return age;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


