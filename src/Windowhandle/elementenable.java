package Windowhandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class elementenable {

	public static void main(String[] args) throws InterruptedException 
	
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.airvistara.com/");
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		

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

		
		//page down
				WebElement down = driver.findElement(By.cssSelector("body[class*='html not-front not-logged-in no-sidebars page-node page-node-']"));
				
				down.sendKeys(Keys.PAGE_DOWN);
				
		
				//Validating UI element (Promo code) is disabled after cliking on cv points
				
				System.out.println(driver.findElement(By.xpath("//input[@name='promo']")).getAttribute("style"));
				
				driver.findElement(By.xpath("(//span[@class='radio-checkmark']) [2]")).click();
				
				System.out.println(driver.findElement(By.xpath("//input[@name='promo']")).getAttribute("style"));
				
				
				
				if(driver.findElement(By.xpath("//input[@name='promo']")).getAttribute("style").contains("background-color: rgb(255, 255, 255)"))
				{
					
					System.out.println("it is enabled");
					Assert.assertTrue(true);
					
					
				}
		  

				else 
				{
					Assert.assertFalse(false);
						
				}
		
		
		
		
		
		

	}

}
