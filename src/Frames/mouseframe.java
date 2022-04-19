package Frames;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class mouseframe {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		//Desired Capabilities
		
		//General chrome profile
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		//Belongs to your local profile
		
		ChromeOptions c = new ChromeOptions();
		
		c.merge(ch);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File("F://RahulAutoprac.png"));
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scroll(0,800)");		
		
		
		WebElement mouse = driver.findElement(By.id("mousehover"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(mouse).build().perform();
		
		
		Thread.sleep(5000);
		
		
		
		
		
		List<WebElement> content = driver.findElements(By.cssSelector("[class='mouse-hover-content']"));
		
		
		System.out.println(content.size());
		
		int mitems = content.size();
		
		for(int i=0;i<mitems;i++)
		{
			String items = content.get(i).getText();
			
			System.out.println(items);
			
			
			if(items.contains("Top"))
			{
				content.get(i).click();
			}
		}
	
		
	    js.executeScript("window.scroll(0,1500)");
	    
	    
	    driver.switchTo().frame(driver.findElement(By.cssSelector("[id='courses-iframe']")));
	    
	    WebElement upper = driver.findElement(By.cssSelector("[class='main-menu']"));
	    
	   System.out.println(upper.getText());
	    
	   Thread.sleep(5000);
	   
	 //  js.executeScript("document.querySelector('[name='iframe-name']').scrollTop=5000");
	   
	  
	   
	   
		
	   
	
		
		
	}

}
