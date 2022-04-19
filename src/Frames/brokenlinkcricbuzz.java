package Frames;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

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
import org.testng.asserts.SoftAssert;

public class brokenlinkcricbuzz {

	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
		ChromeOptions c= new ChromeOptions();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(c);
		
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/");
		
		
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File("F://cricbuzz.png"));
		
		
		
		
		
		
	    List<WebElement> links = driver.findElements(By.cssSelector("[class='cb-ftr-lst'] a"));
		
	    SoftAssert a = new SoftAssert();
	    
	    for (WebElement link : links)
	    {
	    	String url = link.getAttribute("href");
	    	
	    	HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			
			conn.setRequestMethod("HEAD");
			
			conn.connect();
	        		
	        int responsecount = conn.getResponseCode();		
	        	
	        System.out.println(responsecount);		
	        
	        a.assertTrue(responsecount<400, "The link with text "+link.getText()+ "is broken "+responsecount);
	        

	    	
	    	
	    }
	    
	    
	    a.assertAll();
	    
	    
	    /*
		
		String url = driver.findElement(By.cssSelector("a[href*='facebook']")).getAttribute("href");
		
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		
		conn.setRequestMethod("HEAD");
		
		conn.connect();
        		
        int responsecount = conn.getResponseCode();		
        	
        System.out.println(responsecount);		
		
		
		*/
		
	}

}
