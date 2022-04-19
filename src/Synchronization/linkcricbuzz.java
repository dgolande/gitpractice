package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkcricbuzz {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement bottom = driver.findElement(By.xpath("//footer[@id='FooterWraper']"));
		
		System.out.println(bottom.findElements(By.tagName("a")).size());
		
		
		//WebElement website = bottom.findElement(By.xpath("//div/div/div[3]/ul/li"));
		
		//System.out.println(website.findElements(By.tagName("a")).size());
		
 
		System.out.println(driver.findElements(By.xpath("//footer[@id='FooterWraper']/div/div/div[3]/ul/li")).size());
		
	}

}
