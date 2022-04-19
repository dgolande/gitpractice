package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) 
	{
	   System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
	   
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("http://www.facebook.com");
	   
	   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9960528199");
	   
	 //tagName[contains(@attribute,'value')]
	   
	   driver.findElement(By.xpath("//input[contains(@name,'pas')]")).sendKeys("Hello World");
	   
	   //driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	   driver.findElement(By.xpath("//button[contains(@name,'log')]")).click();
	   
	   
	   //driver.close();
	   
	   
	   
	 
	}

}
