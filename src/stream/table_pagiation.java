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
import org.testng.annotations.Test;

public class table_pagiation {

	public static void main(String[] args) 
	{
		
        DesiredCapabilities ch = DesiredCapabilities.chrome();
        
        //DesiredCapabilities ch = DesiredCapabilities.chrome();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);

		
      //  ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		
	  //	ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		
		
		ChromeOptions c = new ChromeOptions();
		
		c.merge(ch);
		
	//	ChromeOptions c = new ChromeOptions();
	//	c.merge(ch);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(c);
		
		

	//	System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
	//	WebDriver driver = new ChromeDriver(c);
		
		
		
		
		
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		
		
		
		
		driver.findElement(By.xpath("//*[@class='nav navbar-nav']/li[3]/a")).click();
		
		
		List<WebElement> tables = driver.findElements(By.xpath("//*[@class='nav navbar-nav']/li[3]/ul/li"));
		
		for (WebElement table : tables)
		
		{
			if(table.getText().contains("Pagination"))
		 {
				table.click();
				
				break;
		 }
			
		}
		
		List<String> value;
		
		do
		{
			
		
		List<WebElement> table1 = driver.findElements(By.xpath("//tr/td[1]"));
		
		value = table1.stream().filter(s->s.getText().contains("8")).map(s->getColumnvalue(s)).collect(Collectors.toList());
		
		
		value.forEach(a->System.out.println(a));
		
		
		if(value.size()<1)
		{
			driver.findElement(By.cssSelector("[class='next_link']")).click();
		}
		}while(value.size()<1);
			
			
		
	}	
		
		
	
		
		
		/*
		
         driver.findElement(By.xpath("//*[@class='nav navbar-nav']/li[3]/a")).click();
		
		
		List<WebElement> tables = driver.findElements(By.xpath("//*[@class='nav navbar-nav']/li[3]/ul/li"));
		
		for (WebElement table : tables)
		
		{
			if(table.getText().contains("Table Data Search"))
		 {
				table.click();
				
				break;
		 }
			
		
		*/
		
		
		
		
		
		

 		private static String getColumnvalue(WebElement s) {
 			
 			String pricevalue = s.findElement(By.xpath("//*[text()='Table heading 2']")).getText();
 			
 			return pricevalue;
 			
 		}
		
		
		
		
		
		
		
		
		
		

	}


