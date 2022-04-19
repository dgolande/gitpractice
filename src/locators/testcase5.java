package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase5 {

	public static void main(String[] args) 
	{
	
        System.setProperty("webdriver.gecko.driver", "C:\\Work related drivers etc\\geckodriver.exe");
		
		WebDriver firefox = new FirefoxDriver();
		
		firefox.get("https://www.rediff.com/");
		
		firefox.manage().window().maximize();
		
		firefox.findElement(By.cssSelector("a[class='signin']")).click();
		
		firefox.findElement(By.cssSelector("[id='login1']")).sendKeys("Dhananjay_9922@rediffmail.com");
		
		firefox.findElement(By.cssSelector("[type*=pass]")).sendKeys("Pune@123");
		
		firefox.findElement(By.cssSelector("input.signinbtn")).click();
		
		firefox.findElement(By.cssSelector("a[class='skiplink']")).click();
		
		
		//firefox.findElement(By.cssSelector("[title*='Logout from Red']")).click();
		
		//firefox.findElement(By.cssSelector("div.floatL:nth-child(6) > a:nth-child(1)")).click();
		
		
	}

}
