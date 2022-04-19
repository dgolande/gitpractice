package Windowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[class='blinkingText']")).click();
		
		
		Set<String> windows =  driver.getWindowHandles();
		
		Iterator<String> IT = windows.iterator();
		
		String parent_id = IT.next();
		
		String child_id = IT.next();
		
		
		
		driver.switchTo().window(child_id);
		
		System.out.println(driver.findElement(By.cssSelector("[class='im-para red']")).getText());
		
		driver.findElement(By.cssSelector("[class='im-para red']"));
		
		String email_id = driver.findElement(By.cssSelector("[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(parent_id);
		
		driver.findElement(By.id("username")).sendKeys(email_id);
		
		
		
		
		
		
		
	}

}
