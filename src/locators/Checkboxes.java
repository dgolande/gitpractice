package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException 
	
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		
		 WebDriver driver = new ChromeDriver();
		
		
		 driver.manage().window().maximize();
		
		
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		 Assert.assertFalse(driver.findElement(By.name("checkBoxOption1")).isSelected());
		
	 		
	     driver.findElement(By.name("checkBoxOption1")).click();
		
		 Assert.assertTrue(driver.findElement(By.name("checkBoxOption1")).isSelected());
		
	   
	    
	     Thread.sleep(2000);
	    
	    
	     driver.findElement(By.name("checkBoxOption1")).click();
	     
	     Assert.assertFalse(driver.findElement(By.name("checkBoxOption1")).isSelected());
	    
	 
	    //count the no of check boxes
	   System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	   
	  
	    
	    
	    
		
		

	}

}
