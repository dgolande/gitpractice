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

public class pagination {

	public static void main(String[] args) throws IOException 
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
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	
		
		List<String> veg_price;
		
		do
		{
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
		
		
		
		veg_price = veggies.stream().filter(s->s.getText().contains("Rice")).map(s->getveggieprice(s)).collect(Collectors.toList());
		
		veg_price.forEach(a->System.out.println(a));
	
		
		if(veg_price.size()<1)
		{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		
		}while(veg_price.size()<1);
	
		
		
		driver.findElement(By.id("search-field")).sendKeys("Mango");
		
		List<WebElement> fruit_names = driver.findElements(By.xpath("search-field"));
		
		
		List<WebElement> output = fruit_names.stream().filter(s->s.getText().contains("Mango")).collect(Collectors.toList());
		
		
        Assert.assertEquals(fruit_names.size(), output.size());		
		
		
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        FileUtils.copyFile(src, new File("F://Greenkart.png"));
		
	}

	

	private static String getveggieprice(WebElement s) 
	{
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return price;
	}

	    
	
	 
	
	
	
	
	
	
}
