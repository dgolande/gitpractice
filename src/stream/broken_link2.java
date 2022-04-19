package stream;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.asserts.SoftAssert;

public class broken_link2 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		
		DesiredCapabilities ch = new DesiredCapabilities();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions c = new ChromeOptions();
		
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(c);
		
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		driver.get("https://www.techbeamers.com/websites-to-practice-selenium-webdriver-online/#1httpsphptravelscomdemo");
		
		
		
		List<WebElement> links = driver.findElements(By.cssSelector("[class='oceanwp-custom-links'] a"));
		
		SoftAssert s = new SoftAssert();
		
		
		for(WebElement link : links)
		{
			       String url = link.getAttribute("href");
			       
			       HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			       
			       conn.setRequestMethod("HEAD");
			      
			       conn.connect();
			    
			       int response = conn.getResponseCode();
 			       
			       System.out.println(response);
			       
			       s.assertFalse(response>400, "The link with text"+link.getText()+"is broken code"+response);
			       
			      
			       
			       
		}
		
		
		s.assertAll();
		
		
			
			
			

	}

}
