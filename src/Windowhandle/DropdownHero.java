package Windowhandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHero {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.findElement(By.linkText("Dropdown")).click();
		
		
		driver.findElement(By.id("dropdown")).click();
		
		WebElement option = driver.findElement(By.id("dropdown"));
		
	    Select dropdown = new Select(option);
	    
	    
	    
		dropdown.selectByIndex(1);
		
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		dropdown.selectByValue("2");
		
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		
		
		
		
		

	}

}
