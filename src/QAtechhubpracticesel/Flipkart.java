package QAtechhubpracticesel;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions c = new ChromeOptions();
		
		c.merge(ch);
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(c);
		
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.flipkart.com/");
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		
		WebElement close = driver.findElement(By.cssSelector("[class='_2KpZ6l _2doB4z']"));
		
		
		if(close.isDisplayed())
		{
			close.click();
		}
		
		
		
		
		
		
		
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.cssSelector("[class='_1_3w1N']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(login).build().perform();
		
		Thread.sleep(2000);
		
		
		WebElement signup = driver.findElement(By.cssSelector("[class='_3wJI0x']"));
		
		signup.click();
		
		
		
		WebElement mobno = driver.findElement(By.cssSelector("[class='_2IX_2- VJZDxU']"));
	
		act.moveToElement(mobno).click().sendKeys("9960528199").build().perform();
		
		
	
		Thread.sleep(2000);
		
		WebElement proceed = driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']/span"));
		
     	act.moveToElement(proceed).click().build().perform();
		
		
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.cssSelector("[type='password']"));
			
		act.moveToElement(pass).click().sendKeys("Pune@123", Keys.ENTER).build().perform();
		
		
		Thread.sleep(2000);
		
		WebElement acc = driver.findElement(By.xpath("//*[text()='My Account']"));
		
		act.moveToElement(acc).build().perform();
		
		List<WebElement> options = driver.findElements(By.cssSelector("[class='_2NOVgj']"));
		
		
		for(WebElement option : options)
		{
			String op = option.getText();
			
			if(op.contains("Logout"))
			{
				Assert.assertTrue(true);
			}
			
		}
		
		
		
		
				
	    
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        FileUtils.copyFile(src, new File("F://Fliplart.com"));
        
        
        		
        		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
