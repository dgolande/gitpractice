package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tryluck {

	public static void main(String[] args) throws InterruptedException 
	{
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.etihad.com/en-in/");
		
		driver.manage().window().maximize();
		
		
//driver.findElement(By.className("close-btn")).click();
		
	//	driver.findElement(By.xpath("//input[@id='roundTripOrigin']")).sendKeys("Pune");
				
	 
		
	/*	List <WebElement> dropdowns = driver.findElements(By.xpath("//ul[@class='rbt-menu dropdown-menu show']/li/a/div[1]/div[1]/span[1]"));
		
		
		  for (WebElement dropdown :dropdowns)
		  {
			  if(dropdown.getText().equalsIgnoreCase("Pune"))
			  {
				  dropdown.click();
				  
			  }
			  
		  }*/
	
		
		
		
		
		
	   Thread.sleep(2000);	
		
		
		
		driver.findElement(By.id("roundTripDestination")).click();
		  
		driver.findElement(By.id("roundTripDestination")).sendKeys("Munich");
				
				
		/*			
				
		//List <WebElement> destination = driver.findElements(By.xpath("//ul[@class='rbt-menu dropdown-menu show']/li[2]/a/div/div"));
		
		List <WebElement> destination = driver.findElements(By.xpath("//ul[@class='rbt-menu dropdown-menu show']/li[2]/a/div/div/span"));
		
		System.out.println(destination.size());
				

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
