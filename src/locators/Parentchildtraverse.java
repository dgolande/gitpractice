package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentchildtraverse {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("Selenium");
		
		driver.findElement(By.xpath("//div[@class='LX3sZb']/div/div/div/div/div[2]/a")).click();
		
		
		//driver.findElement(By.xpath("//a[contains(text(),'Images')]")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='gb_Ue']/a")).click();
		
		
		driver.findElement(By.xpath("//div[@class='aCsJod oJeWuf']/div/div[1]/input")).sendKeys("Randycena30@gmail.com");
		
		
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		
		
		
		
	}

}
