package HandlingHTTPs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class demoautomationautocomplete {

	public static void main(String[] args) throws InterruptedException 
	{
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions c = new ChromeOptions();
		
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(c);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		
		//Widgets
		
		Thread.sleep(2000);
		
		WebElement wid = driver.findElement(By.xpath("//*[text()='Widgets']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(wid).build().perform();
		
		
		Thread.sleep(2000);
		
		WebElement list_op = driver.findElement(By.xpath("//*[@class='nav navbar-nav']/li[5]/ul "));
		
		System.out.println(list_op.getText());
		
		int count = list_op.findElements(By.tagName("a")).size();
		
		for(int j=0;j<count;j++)
		{
			String name = list_op.findElements(By.tagName("a")).get(j).getText();
			
			
			if(name.equalsIgnoreCase("AutoComplete"))
			{
				list_op.findElements(By.tagName("a")).get(j).click();
				
			}
		}
		
		
		
		WebElement frame1 = driver.findElement(By.id("aswift_2"));
		
		driver.switchTo().frame(frame1);
		
		
		WebElement frame2 = driver.findElement(By.id("ad_iframe"));
		
		
		driver.switchTo().frame(frame2);
		
		
		driver.findElement(By.id("dismiss-button")).click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("searchbox")).sendKeys("Uni");
		
		Thread.sleep(5000);
		
		List<WebElement> autosuggestions = driver.findElements(By.cssSelector("[class='ui-menu-item'] a"));
		
		
		for(WebElement autosuggestion : autosuggestions)
		{
			
			String country = autosuggestion.getText();
			
			System.out.println(country);
		
			
			if(country.contains("Kingdom"))
			{
				
				autosuggestion.click();
			}
			
		}
		
		
		Thread.sleep(2000);
		
		driver.switchTo().activeElement().sendKeys("Ja");
		
		
		WebElement auto2 = driver.findElement(By.id("ui-id-1"));
		
		int counts = auto2.findElements(By.tagName("a")).size();
		
		
		System.out.println(counts);
		
		Thread.sleep(2000);
		
		for (int a=0;a<counts;a++)
		{
			Thread.sleep(2000);
			
		    String cname = auto2.findElements(By.tagName("a")).get(a).getText();
			
			System.out.println(cname);
			
			Thread.sleep(2000);
			
			if(cname.equalsIgnoreCase("Japan"))
			{
				Thread.sleep(2000);
				
				auto2.findElements(By.tagName("a")).get(a).click();
				
				
			}
		}
		
		
		
		
	}

}
