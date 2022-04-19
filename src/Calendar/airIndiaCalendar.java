package Calendar;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class airIndiaCalendar {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.airindia.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		//From city
	
		WebElement from = driver.findElement(By.cssSelector("[value='From']"));
		
        from.sendKeys("Mu");
        
        List<WebElement> dropdowns = driver.findElements(By.cssSelector("[class='ui-menu-item']"));
        
        int maxno = dropdowns.size();
        
         
        
        for (int i=0;i<maxno;i++)
        {
        	
        	String options = driver.findElements(By.cssSelector("[class='ui-menu-item']")).get(i).getText();
        	
        	System.out.println(options);
        	
        	if(options.contains("Mumbai"))
        	{ 	
        		driver.findElements(By.cssSelector("[class='ui-menu-item']")).get(i).click();
        	}
		
        }
		

        Thread.sleep(2000);
        
        // To City
        
        
        WebElement destination = driver.findElement(By.id("to"));
        
        destination.sendKeys("Fr");

        Thread.sleep(2000);
        
        List<WebElement> destcity = driver.findElements(By.cssSelector("[id='ui-id-3'] [class='ui-menu-item']"));
        
        int noofcities = destcity.size();
        
        
        for (int r=0;r<noofcities;r++)
        {
        	
        	String newcities = driver.findElements(By.cssSelector("[id='ui-id-3'] [class='ui-menu-item']")).get(r).getText();
        	
        	System.out.println(newcities);
        	
        	if(newcities.contains("Frankfurt"))
        	{
        		driver.findElements(By.cssSelector("[id='ui-id-3'] [class='ui-menu-item']")).get(r).click();
        	}
        }
        
        
        		
		Thread.sleep(5000);
	
		//Handling Calendar (Deaprting)
		
		
		driver.findElement(By.cssSelector("[title='Departing']")).click();
		
		
		//Selecting Month
		
		    while(!driver.findElement(By.cssSelector("[class='ui-datepicker-month']")).getText().contains("November"))
       {
	
			driver.findElement(By.cssSelector("[class='ui-icon ui-icon-circle-triangle-e']")).click();
			
       }

		
		
		
		//Selecting Date
		
		List<WebElement> dates = driver.findElements(By.cssSelector("[data-handler='selectDay']"));
		
		int count = driver.findElements(By.cssSelector("[data-handler='selectDay']")).size();
		
		
		for(int j=0;j<count;j++)
		{
			String text = driver.findElements(By.cssSelector("[data-handler='selectDay']")).get(j).getText();
			
            if(text.equalsIgnoreCase("3"))
            {
            	driver.findElements(By.cssSelector("[data-handler='selectDay']")).get(j).click();
            	break;
            }

			
            
		}
		
		
		
		
		
		//Handling Calendar (Returning)	
			
			driver.findElement(By.cssSelector("[title='Returning']")).click();
			
			
		//Selecting Month
			
			while(!driver.findElement(By.cssSelector("[class='ui-datepicker-month']")).getText().contains("January"))
	       {
		
				driver.findElement(By.cssSelector("[class='ui-icon ui-icon-circle-triangle-e']")).click();
				
	       }

			
			
			
		//Selecting Date
			
			List<WebElement> returndates = driver.findElements(By.cssSelector("[data-handler='selectDay']"));
			
			int countdates = driver.findElements(By.cssSelector("[data-handler='selectDay']")).size();
			
			
			for(int k=0;k<countdates;k++)
			{
				String textreturn = driver.findElements(By.cssSelector("[data-handler='selectDay']")).get(k).getText();
				
	            if(textreturn.equalsIgnoreCase("17"))
	            {
	            	driver.findElements(By.cssSelector("[data-handler='selectDay']")).get(k).click();
	            	break;
	            }

				
			}
			

			//Radio button
			
			List<WebElement> radio = driver.findElements(By.cssSelector("[class = 'radioDate mart6 alignLeft']"));
			
			System.out.println("The no of Radio buttons are "+radio.size());
			
			//Assert.assertFalse(driver.findElement(By.xpath("//ul[@class='block block1 rule cf']/li/fieldset/div[1]")).isSelected());
			
			driver.findElement(By.xpath("//ul[@class='block block1 rule cf']/li/fieldset/div[1]")).click();
		
			//Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='block block1 rule cf']/li/fieldset/div[1]")).isSelected());	
		
			Thread.sleep(2000);
			
			
			//Selectdropdwon
			
			WebElement sdrop = driver.findElement(By.cssSelector("[name='concessionaryType1']"));
			
			Select Concessionary = new Select(sdrop);
			
			Concessionary.selectByIndex(2);
			
			System.out.println(Concessionary.getFirstSelectedOption().getText());
			
			
			//Adult dropdown
			
            WebElement adrop = driver.findElement(By.cssSelector("[title='Adults']"));
			
			Select Adults = new Select(adrop);
			
			Adults.selectByIndex(3);
			
			System.out.println(Adults.getFirstSelectedOption().getText());
			
			
			
			//Book Now or Hit
			
			
			driver.findElement(By.cssSelector("[title='Book Now']")).click();
			
			
			
			
			
			
	}	
	

}
