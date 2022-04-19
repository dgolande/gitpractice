package stream;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class sortdemo {

	public static void main(String[] args) throws InterruptedException 
	{
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions c = new ChromeOptions();
		
		c.merge(c);
		
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(c);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		
		
		WebElement show = driver.findElement(By.cssSelector("[name='example_length']"));
		
		Select sc = new Select(show);
		
		sc.selectByValue("25");
		
		System.out.println(sc.getFirstSelectedOption().getText());
		
		
		sc.selectByIndex(0);
		
		System.out.println(sc.getFirstSelectedOption().getText());
		
		
		
		
		driver.findElement(By.cssSelector("[aria-label='Position: activate to sort column ascending']")).click();
		
		//column var click kela
		List<WebElement> name = driver.findElements(By.xpath("//tr/td[2]"));
		
		//column sort zala 
		List<String> orginal_names = name.stream().map(s->s.getText()).collect(Collectors.toList());
	
		//record sort kele
		List<String>sorted_names = orginal_names.stream().sorted().collect(Collectors.toList());
		
		//check kela sort zale record ani records je sort kela aet te same ahet ka
		Assert.assertEquals(orginal_names, sorted_names);
		
		
		Thread.sleep(2000);

		WebElement search = driver.findElement(By.cssSelector("[type='search']"));
		
		search.sendKeys("Integration Specialist");
		
		

		List<WebElement> position = driver.findElements(By.xpath("//tr/td[2]"));
		
		
		position.stream().map(s->s.getText()).forEach(a->System.out.println(a));
		
		
		List<WebElement> original = position.stream().filter(s->s.getText().contains("Integration Specialist")).collect(Collectors.toList());
		
		original.stream().map(s->s.getText()).forEach(a->System.out.println(a));
		
		Assert.assertEquals(position.size(), original.size());
		
		
		
		//Thread.sleep(1000);
		
		//Actions act = new Actions(driver);
		
		
		
		//act.moveToElement(search).keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.DELETE).build().perform();
		
		
		
		
		
		
		
		
		
		
		/*
		if(orginal_names.equals(sorted_names))
		{
			driver.findElement(By.cssSelector("[class='paginate_button next']")).click();
		}
		
		driver.findElement(By.cssSelector("[class='paginate_button previous']")).click();
		
		
		
		
		
		
		*/
	
	}
}
