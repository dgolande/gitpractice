package Windowhandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Work related drivers etc\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Checkboxes")).click();
		
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@type='checkbox'] [1]")).isSelected());
		
		//System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'] [1]")).isSelected());
		
		driver.findElement(By.xpath("//input[@type='checkbox'] [1]")).click();
		
		//System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'] [1]")).isSelected());
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@type='checkbox'] [1]")).isSelected());
		

		Thread.sleep(1000);
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@type='checkbox'] [2]")).isSelected());
		
		WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'] [2]"));
		
		
		for (int i=0;i<1;i++)
		{
			driver.findElement(By.xpath("//input[@type='checkbox'] [2]")).click();
		}
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@type='checkbox'] [2]")).isSelected());
	}

}
