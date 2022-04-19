package QAtechhubpracticesel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class snapdeal {

	public static void main(String[] args) throws InterruptedException 
	{
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions c = new ChromeOptions();
		
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(c);
		
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://www.snapdeal.com/");
		
		
		
		WebElement signup = driver.findElement(By.cssSelector("[class*='accountUserName']"));
        
        
        Actions act = new Actions(driver);
		
        act.moveToElement(signup).build().perform();	
		
		
		Thread.sleep(2000);
		
		
		WebElement login = driver.findElement(By.cssSelector("[class*='accountBtn btn rippleWhite']"));
		
		
		act.moveToElement(login).click().build().perform();
		
		
		Thread.sleep(2000);
		
		
		int count = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(count);
		
		
		driver.switchTo().frame(driver.findElement(By.id("loginIframe")));
		
		
		
		
		
		
		
		System.out.println(driver.findElement(By.xpath("//*[text()='login/sign up on snapdeal']")).getText());
		
		
		WebElement mob = driver.findElement(By.id("userName"));
		
		act.moveToElement(mob).click().sendKeys("9960528199",Keys.ENTER).build().perform();
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.cssSelector("[class='screen1'] header")).getText());	
	
		
		driver.switchTo().activeElement().sendKeys("Dhananjay_9922@rediffmail.com");	
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("j_name")).sendKeys("Dhananjay");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("j_password")).sendKeys("Pune@123");
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("[for='keepLoginSignUp'] ")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("userSignup")).click();
				
		
		
		
		
		
		
		
	}

}
