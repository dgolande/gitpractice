package Alertsdropdowncheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignmentchrome {

	public static void main(String[] args) throws InterruptedException 
	{

		
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	    //Select dropdown
		
		WebElement Adult = driver.findElement(By.cssSelector("[id='Adults']"));
		WebElement Child = driver.findElement(By.cssSelector("[name='childs']"));
		
		Select dropdowns = new Select(Adult);
		
		dropdowns.selectByIndex(4);
		
		System.out.println(dropdowns.getFirstSelectedOption().getText());
		
		Select options = new Select(Child);
		
		options.selectByValue("3");
		
		System.out.println(options.getFirstSelectedOption().getText());
		
		
		
		//Date Selection
		
		
		driver.findElement(By.cssSelector("[title='Depart date']")).click();
		
		
		driver.findElement(By.cssSelector("[class='ui-state-default ui-state-highlight ui-state-active ']")).click();
		
		
		//More options link
		
		driver.findElement(By.xpath("//div[@id='MoreOptionsDiv']/p/a/strong")).click();
		
		Thread.sleep(1000);
		
		
		//Preferred Airline
		
		driver.findElement(By.cssSelector("[placeholder='Airline name']")).sendKeys("Indigo");
		
		
		
		//Search Flights
		
		driver.findElement(By.cssSelector("[id='SearchBtn']")).click();
		
		
		//Home error message
		
		System.out.println(driver.findElement(By.cssSelector("[id='homeErrorMessage']")).getText());
		
		
		

	}

}
