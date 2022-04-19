package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Herokuframe {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Nested Frames")).click();
		
		
		System.out.println(driver.findElements(By.tagName("frame")).size());
		
		
		driver.switchTo().frame(0);
		
		// driver.switchTo().frame(driver.findElement(By.cssSelector("[name='frame-top']")));
		 
		 driver.switchTo().frame(driver.findElement(By.cssSelector("[name='frame-middle']")));
		 
		 System.out.println(driver.findElement(By.id("content")).getText());
		 
		 
		 driver.close();
		
		 
		 

	}

}
