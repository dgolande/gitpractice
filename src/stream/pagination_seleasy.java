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

public class pagination_seleasy {

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
		
		List<String> l_names;
		
		
		Thread.sleep(2000);
		
		do {
		
		List<WebElement> name = driver.findElements(By.xpath("//*[@role='row']/td[1]"));
		
		l_names = name.stream().filter(s->s.getText().contains("Y. Berry")).map(s->getEmpsal(s)).collect(Collectors.toList());
		
		l_names.forEach(a->System.out.println(a));
		
		if(l_names.size()<1)
		{
			driver.findElement(By.id("example_next")).click();
		} 
		
		
		
		
		
		}while(l_names.size()<1);
	
	}
		
		
		private static String getEmpsal(WebElement s) {
			
			String age = s.findElement(By.xpath("//*[@role='row']/td[6]")).getText();
			
			return age;
			
		}
		
		
		
		
		
		

}


