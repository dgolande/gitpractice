package locators;

import java.util.Arrays;
import org.openqa.selenium.Keys;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Groffers {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    
	    
	    String[] item = {"Maggi Masala Noodles","Fortune Sunlite Refined"};
	   
	    
	   driver.get("https://grofers.com/");
	   
	   driver.manage().window().maximize();
	    
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   
	   
	   Actions a = new Actions(driver);
	   
	   //WebDriverWait w = new WebDriverWait(driver,5);
	   
	  //w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[data-test-id='area-input-box']")));
	   
	  
	   WebElement move = driver.findElement(By.cssSelector("[data-test-id='area-input-box']"));
	   
	   a.moveToElement(move).sendKeys("Mumbai" + Keys.ENTER).build().perform();
	   
	   
	   
	   
	   
	   
	   
	
	  
	//   driver.findElement(By.cssSelector("[data-test-id='area-input-box']")).sendKeys("Pune, Maharashtra\n");

	  
	   
	   
	 
	   
	   
	   
	   
	   
	  

	   
//	   
//	   Thread.sleep(1000);
//	   
	   
	  
	   List<WebElement> products = driver.findElements(By.xpath("//div[@data-test-id ='plp-product-name']"));
			   
	   //Getting prod
	   for (int i=0;i<products.size();i++)
	   {
		  String name =  products.get(i).getText();
		  
		  String[] namechanged = products.get(i).getText().split("-");
		  
		  String newname = namechanged[0].trim();
		  
//		  System.out.println(name);
	   
	      List purchase = Arrays.asList("item");
	      
	      int j=0;
	      if (purchase.contains(newname))
	    		  {
	    	         j++;
	    	          
	    	         driver.findElements(By.xpath("//div[@aria-label='AddToCart']")).get(i).click();
	    	         
	    	         if(j==item.length)
	    	         {
	    	        	 break;
	    	         }
	    	         
	    	         
	    		  }
	   
	   
	   } 

	}

}
