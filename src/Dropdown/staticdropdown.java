package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select options = new Select(element);
		
		  options.selectByIndex(3);
		
		  System.out.println(options.getFirstSelectedOption().getText());
		  
		 
		  options.selectByVisibleText("AED");
		
		  System.out.println(options.getFirstSelectedOption().getText());
		  

		
		  options.selectByValue("INR");
		
		  System.out.println(options.getFirstSelectedOption().getText());
	
		  
		  Thread.sleep(3000);
		  
		  
		  driver.findElement(By.id("divpaxinfo")).click();
		  
		  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		  
		  Thread.sleep(3000);
		  
		  for (int i=1;i<5;i++)
		  {
		     driver.findElement(By.id("hrefIncAdt")).click();
		  
		  }	  
		   
		  driver.findElement(By.id("btnclosepaxoption")).click();
		  
		  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());	
		  
		  Thread.sleep(3000);
		
		  driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		  
		  driver.findElement(By.xpath("//a[@value='PNQ']")).click();
		  
		  Thread.sleep(2000);
		  
		  //driver.findElement(By.xpath("(//a[@value='JSA']) [2]")).click();

		  driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']  //a[@value='JSA']")).click();
		  
		  
		  Thread.sleep(100);
		  
		  driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ind");
		  
		  Thread.sleep(3000);
		  
		  List <WebElement>  dropdowns = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		  
		  for (WebElement dropdown :dropdowns)
		  {
			  if(dropdown.getText().equalsIgnoreCase("India"))
			  {
				  dropdown.click();
				  
			  }
			  
		  }
		  
		  
		  
		  
		  
		  
		  
		

	}

}
