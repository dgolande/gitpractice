package Synchronization;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver,5);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@class='_2KpZ6l _2doB4z']")));
		
		//close the pop up
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//Action class
		Actions act = new Actions(driver);
		
		//Move to specific element
		act.moveToElement(driver.findElement(By.xpath("//img[@alt='Fashion']"))).build().perform();
		
		
		//Move to specific element by creating webelement variable for the same
		WebElement Electronics = driver.findElement(By.xpath("//img[@alt='Electronics']"));
		act.moveToElement(Electronics).contextClick().build().perform();
		
		
		
		//Move to Search box & type in Capital letter
		act.moveToElement(driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"))).click().keyDown(Keys.SHIFT).sendKeys("poco" +Keys.ENTER).build().perform();
		
		
		
		
		driver.findElement(By.xpath("//div[@class='_1YAKP4']")).click();
		
		
	    WebElement min = driver.findElement(By.xpath("//div[@class='_1YAKP4']/select"));
		
		Select amount = new Select(min);
		
		amount.selectByIndex(3);
		
		
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.xpath("//div[@class='_3uDYxP']")).click();
		
		WebElement max = driver.findElement(By.xpath("//div[@class='_3uDYxP']/select"));
		
		Select maxamount = new Select(max);
		
		maxamount.selectByValue("13000");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
