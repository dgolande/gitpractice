package stream;

import static org.testng.Assert.assertEquals;

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

public class datasearch {

	public static void main(String[] args) throws InterruptedException 
	{
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		
		ChromeOptions c = new ChromeOptions();
		
		c.merge(ch);
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver(c);
		
	
		
		
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		
	
		
		driver.findElement(By.id("task-table-filter")).sendKeys("Browser Issues");
		
		List<WebElement> tasks = driver.findElements(By.xpath("//div[@class='panel panel-primary']/table/tbody/tr/td[2]"));
		
		tasks.stream().map(s->s.getText()).forEach(a->System.out.println(a));
		
		
		
		List<WebElement> filteredtask = tasks.stream().filter(task->task.getText().contains("Browser Issues")).collect(Collectors.toList());
		
		//Assert.assertEquals(tasks.size(), 1);
		
		//Assert.assertEquals(tasks.size(), 1);
		
	
		Assert.assertEquals(filteredtask.size(), 1);
		
		
		WebElement filter = driver.findElement(By.xpath("//*[text()=' Filter']"));
				
		filter.click();
		

		
		
		
		driver.findElement(By.cssSelector("[placeholder='#']")).sendKeys("3");
		
		
		
		List<WebElement> nos = driver.findElements(By.xpath("//*[@class='panel panel-primary filterable']/table/tbody/tr/td[1]"));
		
		List<WebElement> filterednos = nos.stream().filter(no->no.getText().contains("3")).collect(Collectors.toList());
		
		filterednos.stream().map(s->s.getText()).forEach(a->System.out.println(a));
		
		

		Assert.assertEquals(filterednos.size(), 1);
		
		
		

	}

}
