package stream;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class seleniumeasytablesortstream_2 {

	public static void main(String[] args) throws IOException, InterruptedException 
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
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		
		
		File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		FileUtils.copyFile(Src, new File("F://Seleniumeasy.png"));
		
		
		//Click on position column
		driver.findElement(By.xpath("//tr/th[2]")).click();
		
		//Capture all elements in list
		List<WebElement> List = driver.findElements(By.xpath("//tr/td[2]"));
		
		//Capture text of all elements in list
		List<String> ListElement = List.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//Sort the original list -> Sorted List
		List<String> sortlist = ListElement.stream().sorted().collect(Collectors.toList());
		
		//Compare original list with sorted list
		Assert.assertEquals(ListElement, sortlist);
		
		
		
		//Date picker
		
		
		driver.findElement(By.xpath("//*[@id='navbar-brand-centered']/ul[1]/li[2]/a")).click();
		
		
		
		WebElement datepicker = driver.findElement(By.xpath("//*[@class='nav navbar-nav']/li[2]/ul"));
		
		
		int count = datepicker.findElements(By.tagName("a")).size();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			
			
			String pickertype = datepicker.findElements(By.tagName("a")).get(i).getText();
			
			System.out.println(pickertype);
			
			
			if(pickertype.equalsIgnoreCase("Bootstrap Date Picker"))
			{
			
				datepicker.findElements(By.tagName("a")).get(i).click();
				
				break;
			}
		}
		
		Thread.sleep(2000);
		
		/*
		 
		//Date Example
		
		WebElement text = driver.findElement(By.cssSelector("[id='sandbox-container1'] h4"));
		
		System.out.println(text.getText());
		
		WebElement cal_open = driver.findElement(By.xpath("(//*[@class='form-control'])[1]"));
		
		cal_open.click();
		
		
		
		Thread.sleep(5000);
		
		
		
		
		List<WebElement> calendar_days = driver.findElements(By.xpath("//tr/td"));
		
		int count2 = calendar_days.size();
			
		for (WebElement calendar_day : calendar_days)
		{
			String dates = calendar_day.getText();
			
		     Thread.sleep(2000);
			
			if(dates.equalsIgnoreCase("20"))
			{
				calendar_day.click();
				break;
			}
			
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[class='glyphicon glyphicon-th']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[class='clear']")).click();
		
		
		
		Thread.sleep(5000);
	
		*/
		
		
		//scroll
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scroll(0,600)");
		
		
		
		
		
		//Date Range Example
		
		
		driver.findElement(By.xpath("//*[@id='datepicker']/input[1]")).click();
		
		//Select Month
		
	
		
		WebElement month = driver.findElement(By.xpath("//*[@class='datepicker-days']/table/thead/tr[2]/th[2]"));
		
		System.out.println(month.getText());
		
		
		while(!month.getText().contains("November"))
	{
		driver.findElement(By.xpath("(//*[@class='next']) [1]")).click();
		
	}	 
		
	
		
		//Select Date
		
		List<WebElement> date_range = driver.findElements(By.cssSelector("[class='day']"));
		
		int date_size = date_range.size();
		
		for(int j=0;j<date_size;j++)
		{
			Thread.sleep(2000);
			
			String date_selection = driver.findElements(By.cssSelector("[class='day']")).get(j).getText();
			
		
			
			
			if(date_selection.equalsIgnoreCase("3"))
			{
				date_range.get(j).click();
				
				break;
			}
		}
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@class='input-daterange input-group']/span")).click();
		
		Thread.sleep(2000);

	
		driver.findElement(By.xpath("//*[@id='datepicker']/input[2]")).click();
		
		
        WebElement end_month = driver.findElement(By.xpath("//*[@class='datepicker-days']/table/thead/tr[2]/th[2]"));
		
		System.out.println(end_month.getText());
		
		
		while(!end_month.getText().contains("January"))
		{
			driver.findElement(By.xpath("(//*[@class='next']) [1]")).click();
		}
		
		
		List<WebElement> end_dates = driver.findElements(By.xpath("//tbody/tr/td"));
		
		for(WebElement end_date : end_dates)
		{
			String nos = end_date.getText();
			
			System.out.println(nos);
			
			
			if(nos.equalsIgnoreCase("10"))
			{
				end_date.click();
				
				break;
			}
			
		}
		
		
	
		
		

	}

}
