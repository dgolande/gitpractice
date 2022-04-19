package Windowhandle;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		
		WebElement checktext = driver.findElement(By.xpath("//label[@for='benz']"));
		
		
		checkbox2.click();
		
		String dropdown = checktext.getText();
		
		//System.out.println(checktext.getText());
		
		
        WebElement drop = driver.findElement(By.cssSelector("[id='dropdown-class-example']"));
        
        
        Select sc = new Select(drop);
        
        sc.selectByVisibleText(dropdown);
        
        
        System.out.println(sc.getFirstSelectedOption().getText());
        
       

        driver.findElement(By.id("name")).sendKeys(dropdown);
        
        
        driver.findElement(By.id("alertbtn")).click();
        
        driver.switchTo().alert();
        
       String alerttext = driver.switchTo().alert().getText();
        
        System.out.println(driver.switchTo().alert().getText());
        
        
            if (alerttext.contains(dropdown))
        {
        	System.out.println("Option 2 is sucessfully selected");
        	
        }
        
       
        
          		
        		
	}

}
