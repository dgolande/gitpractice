package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejetdropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		driver.findElement(By.xpath("//a[@value='BOM']")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("(//a[@value='GOI']) [2]")).click();
		
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click();
		
		driver.findElement(By.xpath("//div[@class='row1 padding-bottom-3 currency-dropdown-wrapper']/div[1]/span")).click();
		
	    System.out.println(driver.findElement(By.xpath("//div[@class='row1 padding-bottom-3 currency-dropdown-wrapper']/div[1]/span")).getText());	
	
	    System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());

	    driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	    
	    
	    WebElement options =  driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
	    
	    
	    Select option = new Select(options);
	    
	    option.selectByIndex(4);
	    
	    System.out.println(option.getFirstSelectedOption().getText());
	    
	    WebElement elements =  driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
	    
	    
	   Select child = new Select(elements);
	   
	   
	   child.selectByVisibleText("2");
	   
	   System.out.println(child.getFirstSelectedOption().getText());
	   
	   
	   WebElement web = driver.findElement(By.id("ctl00_mainContent_ddl_Infant"));
	   
	   
	   
	   
       Select infant = new Select(web);
	   
	   
	   infant.selectByVisibleText("4");
	   
	   System.out.println(infant.getFirstSelectedOption().getText());
	   
	   
	   WebElement Currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	   
	   Select Currencies = new Select(Currency);
	   
	   
	   Currencies.selectByVisibleText("USD");
	   
	   System.out.println(Currencies.getFirstSelectedOption().getText());
	   
	   
	    
       //System.out.println(driver.findElement(By.cssSelector("[class='btn-find-flight-home'] [type='submit']")).getText());
	   
	   driver.findElement(By.xpath("//input[@value='Search']")).click();
	    
	    
	   driver.findElement(By.id("highlight-addons")).click(); 
	   
	   
	   
	   driver.findElement(By.xpath("//li[@id='header-addons']/ul[1]/li[2]")).click();
	    
	   driver.navigate().back();
	   
	   
	   
	  // driver.findElements("//li[@id='header-addons']/ul[1]/li[2]");
	  
	 /* List <WebElement> dropdowns = driver.findElements(By.xpath("//li[@id='header-addons']/ul[1]/li[2]"));
	  
	  
	  for (WebElement dropdown: dropdowns)
		{
			if (dropdown.getText().equalsIgnoreCase("Hot Meals"))
					{
				         dropdown.click();				
					}
	    
	    
	    		
		}	*/	
	    		
	    
	    
	    
	    
	  
		
		
	}

}
