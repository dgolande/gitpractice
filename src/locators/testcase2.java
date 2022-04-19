package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase2 {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.gecko.driver", "C:\\Work related drivers etc\\geckodriver.exe");
		
		WebDriver firefox = new FirefoxDriver();
		
		firefox.get("http://www.cricbuzz.com");
		
		firefox.findElement(By.cssSelector("a[title='Live Cricket Score']")).click();
		
		firefox.findElement(By.cssSelector("[id='league-tab']")).click();
		
		firefox.findElement(By.cssSelector("a#domestic-tab")).click();
		
		firefox.findElement(By.cssSelector("a[title*='Series Schedule']")).click();
		
		firefox.navigate().back();
		
		firefox.findElement(By.cssSelector("a[title*='Cricket Sch']")).click();
		
		firefox.navigate().back();
		
	    
	    
	    

	}

}
