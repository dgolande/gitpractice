package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorspractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		String winHandleBefore = driver.getWindowHandle();
		
		driver.manage().window().maximize();
		
		//Searching brocolli
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Brocolli");
		
		//Clicking on Add to Cart
		driver.findElement(By.xpath("//div[@class='product-action']/button")).click();
		
		//clearing the search box
	    driver.findElement(By.xpath("//*[@class='search-keyword']")).clear();
		
		//Searching Cucumber
	    driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Vegetables ')]")).sendKeys("Cucumber");
	    
	    Thread.sleep(3000);
	    
		
	    //Clicking on Add to Cart
		driver.findElement(By.xpath("//*[text()='ADD TO CART']")).click();
		
	    driver.findElement(By.xpath("//div[@class='search']/form/a/following-sibling::input[1]")).clear();
	    
	    
	    //Searching Carrot
	    //driver.findElement(By.xpath("//input[contains(@class,'search-keyword')]")).sendKeys("Carrot");
	    
	    //Getting BeetRoot Text
	    //driver.findElement(By.cssSelector("h4[class='product-name']"));
	    
	    //Printing BeetRoot text on console
	    // System.out.println(driver.findElement(By.cssSelector("h4[class='product-name']")).getText());
	    
	    //Clicking on Add to Cart
	     //driver.findElement(By.xpath("//div[@class='products']/div/div[3]/button")).click();  
	      
	     //driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
	    
	   
	    
	    driver.findElement(By.cssSelector("[alt='Cart']")).click();
	    		
	    		
        driver.findElement(By.xpath("//div[@class='action-block']/button")).click();	  
        
        Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='products']/div[1]/span[3]/following-sibling::button[1]")).click();
		
		Thread.sleep(3000);
		
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='products']/div/div[1]/following-sibling::b[1]")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='products']/div/div[1]/following-sibling::b[1]")).getText());
	
		
		driver.findElement(By.xpath("//div[@class='products']/div[1]/div/following-sibling::b[2]")).click();
		
		
		System.out.println(driver.findElement(By.xpath("//div[@class='products']/div[1]/div/following-sibling::b[2]")).getText());
		
		
		driver.navigate().back();
		
		
		driver.findElement(By.xpath("//div[@class='container']/div[3]/a[2]")).click();
		
		driver.switchTo().window(winHandleBefore);
		
				
		Thread.sleep(2000);
		
		 
       
        for(int i=0;i<5;i++)
        {
        	
        	driver.findElement(By.xpath("//div[@class='products']/div[6]/div[2]/a[2]")).click();
        	
        }
	    
	    
	 driver.findElement(By.xpath("//div[@class='products']/div[6]/div[3]/button")).click();
		
		
	System.out.println(driver.findElement(By.xpath("//div[@class='products']/div[10]/div/following-sibling::h4[1]")).getText());	
	
	
	for (int j=0;j<10;j++)
	{
		
		driver.findElement(By.xpath("//div[@class='products']/div[10]/div[2]/a[2]")).click();
		
	}
	
	
	
	driver.findElement(By.xpath("//div[@class='products']/div[10]/div[3]/button")).click();
	
	
	WebElement cart = driver.findElement(By.xpath("//div[@class='cart']/a/img"));
	
	
		
	{
	
		
	}
	
	
		
		
		//driver.findElement(By.xpath("//div[@class='wrapperTwo']/div/following-sibling::a[1]")).click();
		
		
		//driver.quit();
		
		
		
		
		
		//driver.navigate().back();
		
		//driver.close();
		
	//	driver.findElement(By.xpath("//div[@class='wrapperTwo']/a")).click();
		
		
		
		

	}

}
