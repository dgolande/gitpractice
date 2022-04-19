package Synchronization;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronizarionprac2 {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Work related drivers etc\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("openwindow")).click();
		
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> IT = windows.iterator();
		
		String Parent = IT.next();
		
		String Child = IT.next();
		
		
		
		driver.switchTo().window(Child);
		
		driver.manage().window().maximize();
		
		
		System.out.println(driver.findElement(By.xpath("//div[@class='text-center']/h2")).getText());
		
		System.out.println(driver.getCurrentUrl());
		
	//	driver.switchTo().defaultContent();
		
		driver.switchTo().window(Parent);
		
		System.out.println(driver.getCurrentUrl());
		
		
		
	/*
		for (String window2 : driver.getWindowHandles()) {
		    driver.switchTo().window(window2); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		}
		
		
		
		
		System.out.println(driver.findElement(By.xpath("//*[text()=' contact@rahulshettyacademy.com']")).getText());
		
		
		driver.switchTo().window(Parent);
	
		System.out.println(driver.getCurrentUrl());
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
