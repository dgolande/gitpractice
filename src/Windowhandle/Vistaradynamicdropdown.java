package Windowhandle;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;
import org.testng.Assert;

public class Vistaradynamicdropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.airvistara.com/");
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
/*		
		WebElement country1 = driver.findElement(By.xpath("//ul[@class='dropdown-menu flagstrap-menu']/li[2]"));
		WebElement country2 = driver.findElement(By.xpath("//ul[@class='dropdown-menu flagstrap-menu']/li[1]"));
		
		for (int r=0;r<1;r++) 
		{
			driver.findElement(By.cssSelector("[class='flagstrap-selected']")).click();
			
			if(country1.isDisplayed())
			{
				country1.click();
			}
			
		}
		
		driver.findElement(By.cssSelector("[class='flagstrap-selected']")).click();
		
		if (country2.isDisplayed())
		{
			country2.click();
		}
		
		
		
		driver.findElement(By.cssSelector("[class='dropdown-toggle modal-dropdown-style']")).click();
		
		driver.findElement(By.cssSelector("[data-lang-value='en']")).click();
		
		
		driver.findElement(By.id("domain-done")).click();
		
	*/	
		
		
		
		//driver.findElement(By.xpath("//ul[@class='dropdown-menu flagstrap-menu']/li[1]")).click();
		
		//System.out.println("The Select country is India "+ driver.findElement(By.xpath("//ul[@class='dropdown-menu flagstrap-menu']/li[1]")).getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		//First Pop up
		WebElement popup = driver.findElement(By.xpath("//div[@class='modal-content']"));
		
		
		if(popup.isDisplayed())
		{
		
		   driver.findElement(By.xpath("//button[@class='modal-title close close-visiblity col-xs-2']")).click();
		
		}
		
		Thread.sleep(5000);
		
		//Second Pop up
		WebElement subpop = driver.findElement(By.xpath("//div[@class='att_popup']"));
		
		if(subpop.isDisplayed())
		{
			
		    driver.findElement(By.id("att_lightbox_close")).click();
			
		}

	/*	
		//page down
		WebElement down = driver.findElement(By.cssSelector("body[class*='html not-front not-logged-in no-sidebars page-node page-node-']"));
		
		down.sendKeys(Keys.PAGE_DOWN);
		
		
		Thread.sleep(1000);
		
		
		//Origin City or From 
		WebElement city = driver.findElement(By.xpath("//input[@placeholder='Origin']"));
		
        city.sendKeys("Mumbai");
		
        Thread.sleep(1000);
        
		city.sendKeys(Keys.ARROW_DOWN);
		
		city.sendKeys(Keys.ENTER);
		
			
	    Thread.sleep(2000);
		
	    
	   //Destination City or To
		WebElement city2 = driver.findElement(By.xpath("//input[@name='flightSearchTo']"));
		
		city2.sendKeys("Pune");
		
		Thread.sleep(1000);
		
		city2.sendKeys(Keys.ARROW_DOWN);
		
		city2.sendKeys(Keys.ENTER);
		
		*/
		
		/*	
		//Date selection is working by clicking on date multiple times 
		WebElement repeat = driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active"));
		
		for (int d=0;d<2;d++)
		{
			driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
		}
		
		//in case you want to close the Calendar
		driver.findElement(By.xpath("//button[@class='close close-visiblity closePaxModal']")).click();
		
		
		*/
		
		
		//Date selection is working by double click on date
	
		WebElement date = driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active"));
		
		Actions act = new Actions(driver);
		
		Thread.sleep(1000);
		
		act.moveToElement(date).doubleClick().build().perform(); 
		
		
	
		
		//Validating UI element (Promo code) is disabled after cliking on cv points
		
		System.out.println(driver.findElement(By.xpath("//input[@name='promo']")).getAttribute("style"));
		
		driver.findElement(By.xpath("(//span[@class='radio-checkmark']) [2]")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@name='promo']")).getAttribute("style"));
		
		
		
	/*	
		
		//Click on pay by options checkbox
		
		Assert.assertFalse(driver.findElement(By.xpath("(//span[@class='radio-checkmark']) [2]")).isSelected());
		
		//System.out.println(driver.findElement(By.xpath("(//span[@class='radio-checkmark']) [2]")).isSelected());
		
		driver.findElement(By.xpath("(//span[@class='radio-checkmark']) [2]")).click();
		
		
		//System.out.println(driver.findElement(By.xpath("(//span[@class='radio-checkmark']) [2]")).isSelected());
		
		Assert.assertFalse(driver.findElement(By.xpath("(//span[@class='radio-checkmark']) [2]")).isSelected());
		
		
		
		/*
		//Clicking on Search flights options
		driver.findElement(By.id("book-flight-widget")).click();
		
		
		WebElement error = driver.findElement(By.cssSelector("[class='warning']"));
		
		WebElement back = driver.findElement(By.id("back-home"));
		
		
		if(error.isDisplayed())
	{	
		System.out.println(driver.findElement(By.cssSelector("[class='warning']")).getText());
		
	}
		else
	{
	    back.click();
			
	}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		/*
		List<WebElement> source = driver.findElements(By.xpath("//div[@class='scombobox-list']"));
		
		/*
		for(int i=0;i<source.size();i++)

		{

		

		String[] name=source.get(i).getText().split(" ( ");

		String formattedName=name[0].trim();
  
		System.out.println(formattedName);
		
		
		
		int range = driver.findElements(By.xpath("//div[@class='scombobox-list']")).size();
		
		for(int j=0;j<range;j++)
		{
			String names = driver.findElements(By.xpath("//div[@class='scombobox-list']")).get(j).getText();
			
			System.out.println(names);
		
		
		
		for (WebElement Src : source )
		{
		
			System.out.println(Src.getText());
			
			Thread.sleep(1000);
			
			if(Src.getText().equalsIgnoreCase("Mumbai (BOM)"))
			{
				
				Src.click();
				break;
			}
			
		}
		
		
		
		}
		
	*/
		
		

		
		
		
		
		
		
		
		
		
		
		
	}


}