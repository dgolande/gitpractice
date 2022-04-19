package stream;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class pagination_amazo {

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
		
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(10000);
		
		
		WebElement hover = driver.findElement(By.cssSelector("[id='nav-link-accountList']"));
		
		
		
		Actions act = new Actions(driver);
		
		
		act.moveToElement(hover).build().perform();
		
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		
		search.sendKeys("SCHNELL cycles");
		
		driver.findElement(By.cssSelector("[value='Go']")).click();
		
		
		
		List<WebElement> cycle_names;

		do
		{
		
		List<WebElement> bicycles = driver.findElements(By.cssSelector("[class='a-link-normal a-text-normal']"));
		
		
		
		
		cycle_names = bicycles.stream().filter(s->s.getText().contains("Hippo arizon IBC 26t Cycles")).collect(Collectors.toList());
		
		
		cycle_names.forEach(a->System.out.println(a));
		
		
		if(cycle_names.size()<1)
		{
			driver.findElement(By.cssSelector("[class='a-last']")).click();
		}
		
		}while(cycle_names.size()<1);
		
		
		
	}

}
