package HandlingHTTPs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.commons.io.FileUtils;



public class httpsssl {

	public static void main(String[] args) throws IOException 
	{

		
		//SSL certificates
		
		//Desired Capabilities
		//General chrome profile
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		
		//ch.acceptInsecureCerts();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		
		
		//Belongs to your local profile
		
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(c);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		
		driver.get("http://Google.com");
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File("F://screenshot.png"));
		
		
		
		
		
		
	}

}
