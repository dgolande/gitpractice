package HandlingHTTPs;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Demoautomationalerts {

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
		
		
		driver.get("http://demo.automationtesting.in/Register.html");
		

		WebElement dropdown = driver.findElement(By.xpath("//*[@class='nav navbar-nav']/li[4]/a"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(dropdown).build().perform();
		
		Thread.sleep(2000);
		
		
		List<WebElement> s_options = driver.findElements(By.xpath("//*[@class='nav navbar-nav']/li[4]/ul/li"));
		
		for(WebElement s_option : s_options )
		{
			String names = s_option.getText();
			
			if(names.contains("Alerts"))
			{
				s_option.click();
			}
		}
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		FileUtils.copyFile(src, new File("F://Alert.png"));
		
		
		
		
		
		WebElement frame1 = driver.findElement(By.id("aswift_2"));
		
		driver.switchTo().frame(frame1);
		
		
		
	
		
		WebElement frame2 = driver.findElement(By.id("ad_iframe"));
		
		driver.switchTo().frame(frame2);
		
		
		driver.findElement(By.id("dismiss-button")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[onclick='alertbox()']")).click();
		
		
		//Alert with OK
		
		driver.switchTo().alert();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
	
		Thread.sleep(5000);
		
		//Alert with OK & Cancel
		
		driver.findElement(By.xpath("//*[@class='nav nav-tabs nav-stacked']/li[2]")).click();
		
		
		driver.findElement(By.cssSelector("[onclick='confirmbox()']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(5000);
		
		
		//Alert with text box
		
		driver.findElement(By.xpath("//*[@class='nav nav-tabs nav-stacked']/li[3]")).click();
		
		driver.findElement(By.cssSelector("[onclick='promptbox()']")).click();
		
		
		Alert last_alert = driver.switchTo().alert();
		
		last_alert.sendKeys("Dhananjay");
		
	    System.out.println(last_alert.getText());
		
		last_alert.accept();
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
