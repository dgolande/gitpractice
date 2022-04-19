package QAtechhubpracticesel;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class ebey {

	public static void main(String[] args) throws IOException, InterruptedException 
	{

       DesiredCapabilities ch = DesiredCapabilities.chrome();
       
       ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
       
       ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
       
       ChromeOptions c = new ChromeOptions();
       
       c.merge(ch);
       
       
       System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
       
       WebDriver driver = new ChromeDriver();
       
       driver.manage().window().maximize();
       
       driver.manage().deleteAllCookies();
       
       driver.get("https://www.ebay.com/");
       
       
       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       
       
       FileUtils.copyFile(src, new File("F://ebey.png"));
       
     
       WebElement search = driver.findElement(By.cssSelector("[class='gh-tb ui-autocomplete-input']"));
       
       
       search.sendKeys("Apple Watches");
     
       
       WebElement category = driver.findElement(By.cssSelector("[class='gh-sb ']"));
       
       Select options = new Select(category);
       
       
       options.selectByValue("293");
       
       System.out.println(options.getFirstSelectedOption().getText());
       
       
       driver.findElement(By.cssSelector("[type='submit']")).click();
       
      
       
     
    	   List<WebElement> results = driver.findElements(By.cssSelector("[class='s-item__title']"));
    	   
    	   int count = results.size();
    	   
    	   for(int i=0;i<count;i++)
    	   {
    		   String output = driver.findElements(By.cssSelector("[class='s-item__title']")).get(i).getText();
    		   
    		   System.out.println(output);
    		 		   
    		   
    		   
    	   }
    	   
    	   WebElement nth = driver.findElement(By.xpath("(//li[@class='s-item      s-item--watch-at-corner']/div/div[2]/a/h3) [4] "));
    	   
    	   String fourtproduct = nth.getText();
    	   
    	   System.out.println("\nThe 4 element is "+fourtproduct);
       
       
           driver.navigate().back();       
                   
       
       
       
                  
       
       
       
       
       
       
       
       
       
       
       
       

	}

}
