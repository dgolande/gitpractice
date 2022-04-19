package Frames;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, false);

		
		ChromeOptions c = new ChromeOptions();
		
		c.merge(ch);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(c);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		// String url = driver.findElement(By.cssSelector("a[href*='broken']")).getAttribute("href");
		
		List<WebElement> links = driver.findElements(By.cssSelector("[class='gf-li'] a"));
		
		SoftAssert a = new SoftAssert();
		
		
		for(WebElement link : links)
		{
			
			String url = link.getAttribute("href");
			
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			
			conn.setRequestMethod("HEAD");
			
			conn.connect();
			
			int responsecode = conn.getResponseCode();
			
			System.out.println(responsecode);
			
			
			a.assertTrue(responsecode<400, "The link with text "+link.getText()+" is broken "+responsecode);
            			
			
		}
		
		
		a.assertAll();
		
		/*
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		
		conn.setRequestMethod("HEAD");
		
		conn.connect();
		
		int responsecode = conn.getResponseCode();
		
		System.out.println(responsecode);
		
		*/

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
