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

public class Heroku_stream {

	public static void main(String[] args) throws InterruptedException 
	{
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		
		ChromeOptions c = new ChromeOptions();
		
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(c);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://the-internet.herokuapp.com/tables");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='table1']/thead/tr/th[2]")).click();
		
		
		List<WebElement> fname = driver.findElements(By.xpath("//*[@id='table1']  //tr/td[2]"));
		
		List<String> st_name = fname.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> sorted_name = st_name.stream().sorted().collect(Collectors.toList());
		
		Assert.assertEquals(st_name, sorted_name);
		
		
		
		
		
		
		
		

	}

}
