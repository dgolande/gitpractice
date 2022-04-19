package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdown2Air {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.airindia.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='languageCode']")).click();
		
		WebElement dropdown = driver.findElement(By.name("ctl00$ContentPlaceHolder1$UserLanguage1$drpCountry"));
		
		Select options = new Select(dropdown);
		
		options.selectByIndex(1);
		
		System.out.println(options.getFirstSelectedOption().getText());
		
		options.selectByVisibleText("UK");
		
		System.out.println(options.getFirstSelectedOption().getText());
		
		options.selectByValue("14");
		
		System.out.println(options.getFirstSelectedOption().getText());
		
		options.selectByIndex(4);
		
		System.out.println(options.getFirstSelectedOption().getText());
		
		options.selectByVisibleText("India");
		
		System.out.println(options.getFirstSelectedOption().getText());	
		
		
		driver.findElement(By.xpath("//div[@class='langWrap']/input[1]")).click();
		
		
		driver.close();
		
		
		
		
		
		
		
				  
		  
		  
		  
		  
		  
		

	}

}
