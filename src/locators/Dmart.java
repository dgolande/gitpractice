package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dmart {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.dmart.in/");
	    
	    driver.manage().window().maximize();
		   
		   
	   driver.findElement(By.xpath("//input[@placeholder='Enter your city, area or pincode']")).sendKeys("Pune");
	   
	   driver.findElements(By.xpath("//div[@class='src-client-components-pincode-widget-__pincode-widget-module___listdiv']/ul/li[3]"));

	  /* List<WebElement> places = driver.findElements(By.xpath("//div[@class='src-client-components-pincode-widget-__pincode-widget-module___listdiv']/ul/li[3]"));
	
	   for (WebElement place :places)
	   {
		   //if(place.getText().equalsIgnoreCase("Pune"));
		   
		   if(place.getText().equals("Pune"));
		   {
			   place.click();
		   }
	   }*/
	}
	
	

}
