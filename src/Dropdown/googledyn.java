package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googledyn {

	public static void main(String[] args) throws InterruptedException 
	
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Work related drivers etc\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys("Seleniu");
		
		Thread.sleep(1000);
		
		List <WebElement> dropdowns = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		
		for (WebElement dropdown :dropdowns)
		{
			
			if(dropdown.getText().equalsIgnoreCase("Selenium grid"))
			
					{
				       dropdown.click();
				       
				       break;
					}	
			
			
		}
		
		
		
		
		
		
	}

}
