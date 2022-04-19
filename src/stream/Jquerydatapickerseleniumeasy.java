package stream;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Jquerydatapickerseleniumeasy {

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
		
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		
		
		driver.findElement(By.xpath("//*[@class='nav navbar-nav']/li[2]")).click();
		
		
		WebElement options = driver.findElement(By.cssSelector("[class='dropdown open'] [class='dropdown-menu']"));
		
		
		int nos = options.findElements(By.tagName("a")).size();
		
		
		for(int i=0;i<nos;i++)
		{
			
			String date_names = options.findElements(By.tagName("a")).get(i).getText();
			
			System.out.println(date_names);
			
			if(date_names.contains("JQuery"))
			{
				Thread.sleep(2000);
				
				options.findElements(By.tagName("a")).get(i).click();
			}
		}
		
		
		//Calendar
		
		driver.findElement(By.id("from")).click();
		
		
		
		//select month
		
		
		WebElement calendar = driver.findElement(By.cssSelector("[data-handler='selectMonth']"));
				
		calendar.click();
		
		
		Select sc = new Select(calendar);
		
		sc.selectByVisibleText("Dec");
		
		
		
		List<WebElement> selectdays = driver.findElements(By.cssSelector("[data-handler='selectDay']"));
		
		for(WebElement selectday : selectdays)
		{
			String days = selectday.getText();
			
			if(days.equalsIgnoreCase("17"))
			{
				selectday.click();
				break;
			}
		}
		
		
		
		driver.findElement(By.id("to")).click();
		
		
		while(!driver.findElement(By.cssSelector("[class='ui-datepicker-year']")).getText().contains("2025"))
		{
		
		        driver.findElement(By.cssSelector("[title='Next']")).click();
		
		}
		
		
		Thread.sleep(2000);
		
		WebElement tomonth = driver.findElement(By.cssSelector("[data-handler='selectMonth']"));
		
		tomonth.click();
		
        Select sc1 = new Select(tomonth);
        
        sc1.selectByValue("11");
        
        
        List<WebElement> date_sel = driver.findElements(By.cssSelector("[data-handler='selectDay']"));
        
        int count = date_sel.size();
        
        for(int j=0;j<count;j++)
        {
        	String date_dest = driver.findElements(By.cssSelector("[data-handler='selectDay']")).get(j).getText();
        	
        	if(date_dest.equalsIgnoreCase("3"))
        	{
        		driver.findElements(By.cssSelector("[data-handler='selectDay']")).get(j).click();
        		
        	}
        		
        }
        
        
        
        
        
        
        
        
        
		

	}

}
