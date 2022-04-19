package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownnew {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.etihad.com/en-in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("close-btn")).click();
		
		driver.findElement(By.xpath("//input[@id='roundTripOrigin']")).sendKeys("Pun");
				
	 
		
		List <WebElement> dropdowns = driver.findElements(By.xpath("//ul[@class='rbt-menu dropdown-menu show']/li/a/div[1]/div[1]/span[1]"));
		
		
		  for (WebElement dropdown :dropdowns)
		  {
			  if(dropdown.getText().equalsIgnoreCase("Pune"))
			  {
				  dropdown.click();
				  
			  }
			  
		  }
		
		  Thread.sleep(2000);
		  
		  
		//driver.findElement(By.id("roundTripDestination")).click();
		  
		driver.findElement(By.id("roundTripDestination")).sendKeys("Mu");
		
		/*List <WebElement> destination = driver.findElements(By.xpath("//ul[@class='rbt-menu dropdown-menu show']/li/a/div[1]/div[2]/span[1]/span[1]/span[1]"));
		
		
		Thread.sleep(2000);
		
		
		for (WebElement city2 : destination )
		{
			
			if(city2.getText().equalsIgnoreCase("Munich"))
			{
				city2.click();
			}
			
		}
		*/
		
		
		
		
		
		
		
		
		

	}

}
