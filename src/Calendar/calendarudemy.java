package Calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarudemy {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("travel_date")).click();
		
		//Selecting month
		
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("November"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		
		
		
		//Selecting Date
		
	    List<WebElement> dates = driver.findElements(By.cssSelector("[class='day']"));
		
		int count = driver.findElements(By.cssSelector("[class='day']")).size();
		
		for(int i=0;i<count;i++)
		{
			String text = driver.findElements(By.cssSelector("[class='day']")).get(i).getText();
			
			
			if(text.equalsIgnoreCase("3"))
			{
				driver.findElements(By.cssSelector("[class='day']")).get(i).click();
				break;
			}
		}
		
		
		
		
				
		

	}


	}


