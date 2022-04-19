package Windowhandle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heroku {

	public static void main(String[] args) 
	
	{
		//Browser initialization
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Get the URL
		driver.get("https://the-internet.herokuapp.com/");
	    		
        //Maximize the URL
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		//Clicking/accessing multiple windows options
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		
		//Click operation for opening another window  
		driver.findElement(By.xpath("//div[@class='example']/a")).click();
		
		//Handling windows
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> IT = windows.iterator();
		
		String parent = IT.next();
		
		String child = IT.next();
		
		
		//Move to child window
		driver.switchTo().window(child);
		
		//Extracting data from child window
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		
		//Move to parent window
		driver.switchTo().window(parent);
		
		//Extracting data from parent window
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		
		
		
		//Close all the open browsers
		driver.quit();
		
	
		
		
		
	}

}
