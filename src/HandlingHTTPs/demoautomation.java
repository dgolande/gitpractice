package HandlingHTTPs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class demoautomation {

	public static void main(String[] args) throws InterruptedException 
	{
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		
		ChromeOptions c = new ChromeOptions();
		
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(c);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		
		
		WebElement droptoggle = driver.findElement(By.xpath("//*[@class='navbar navbar-inverse']/div/div[2]/ul/li[4]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(droptoggle).build().perform();
		
		
		Thread.sleep(2000);
		
		int count = droptoggle.findElements(By.tagName("a")).size();
		
		System.out.println(droptoggle.findElements(By.tagName("a")).size());
		
		for(int i=1;i<count;i++)
		{
			
			String options = droptoggle.findElements(By.tagName("a")).get(i).getText();
			
			if(options.equalsIgnoreCase("Frames"))
			{
				droptoggle.findElements(By.tagName("a")).get(i).click();
			
				break;
			}
		}
		
		
		Thread.sleep(5000);
		
		
		//driver.switchTo().frame(driver.findElement(By.cssSelector("[class='ns-moxhe-l-square-eta-vanilla ns-moxhe-v-11']")));
		
		WebElement ad = driver.findElement(By.id("aswift_2"));
		
		
		driver.switchTo().frame(ad);
		
		
		WebElement frame2 = driver.findElement(By.id("ad_iframe"));
		
		driver.switchTo().frame(frame2);
		
			
		driver.findElement(By.id("dismiss-button")).click();
		
		
		Thread.sleep(5000);
		
		WebElement single = driver.findElement(By.id("singleframe"));
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(single);
		
		Thread.sleep(5000);
		
		WebElement stext = driver.findElement(By.xpath("//*[@class='container']/div/div/input"));
		
		stext.sendKeys("Single frame");
		
		
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='tabpane']/ul/li[2]/a")).click();
		
		
		
		WebElement aniframe = driver.findElement(By.cssSelector("[src='MultipleFrames.html']"));
		
		driver.switchTo().frame(aniframe);
		
		Thread.sleep(2000);
		
		WebElement oframe = driver.findElement(By.cssSelector("[src='SingleFrame.html']"));
		
        driver.switchTo().frame(oframe);
		
		Thread.sleep(5000);
		
		WebElement mtext = driver.findElement(By.xpath("//*[@class='container']/div/div/input"));
		
		mtext.sendKeys("Multiple frame");
		
		
		driver.switchTo().defaultContent();
		
		
		
		driver.findElement(By.xpath("//div[@class='tabpane']/ul/li[1]/a")).click();
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		 
		
		
			
		
		
		
		
		
		
		
		
	}

}
