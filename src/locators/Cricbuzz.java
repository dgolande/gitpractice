package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cricbuzz {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

	   System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
	   
	   WebDriver driver = new ChromeDriver();
	   
	   
	   driver.get("https://www.yatra.com/");
	   
	   driver.manage().window().maximize();
		
	   driver.findElement(By.cssSelector("[class='demo-icon icon-hotels']")).click();
	   
	   driver.findElement(By.cssSelector("[class='hotel_passengerBox dflex relative'] div i")).click();
	   
	   System.out.println(driver.findElement(By.xpath("//span[@class='txt-ellipses hotel_passengerBox travellerPaxBox']")).getText());
	   
	   driver.findElement(By.cssSelector("[class='hotel_passengerBox dflex relative'] div i"));

	   
	   for (int i=0;i<5;i++)
	   {
		   
		   driver.findElement(By.xpath("//div[@class='dd ddcommon borderRadius ddSpinnerMain']/div/span[2]")).click();
	
		   
		   
	   }
	  
	   int j=0;
	   while (j<2)
	   {
		  driver.findElement(By.xpath("//div[@id='BE_Hotel_pax_box']/div/div/div[3]/div/div/span[2]")).click();
		   j++;
		   
	   }  
	   
	   Thread.sleep(2000);
	   
	  
	   
	   WebElement Age = driver.findElement(By.xpath("//ul[@class='select-child-ages clearfix']/li[2]/div/select"));
	   
	   
	   WebElement Age2 = driver.findElement(By.xpath("//ul[@class='select-child-ages clearfix']/li[3]/div/select"));
	   
	   Select childern = new Select(Age);
	   
	   Select childern2 = new Select(Age2);
	   
	   childern.selectByIndex(5);
	   
	   System.out.println(childern.getFirstSelectedOption().getText());
	   
	   childern2.selectByVisibleText("8");
	   
	   childern2.getFirstSelectedOption();
	   
	   
	   
	driver.findElement(By.cssSelector("[value='Search Hotels']")).click();
			    
	   
	   
	   
		
	}

}
