package Practice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Seleniumexam1 {

	public static void main(String[] args) throws InterruptedException 
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
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	
		/*
		 
		 
		//Radio Button
		
		driver.findElement(By.xpath("//*[@for='radio2']/input")).click();
		
		
		//Suggestion class

		
		driver.findElement(By.id("autocomplete")).sendKeys("In");
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//*[@class='ui-menu-item']/div"));
		
		
		for(WebElement suggestion : suggestions)
		{ 
		
			String cname = suggestion.getText();
			
			if(cname.contains("Ukraine"))
			{
				suggestion.click();
			}
			
		}
		
		Thread.sleep(2000);
		
		//Scrolling
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scroll(0,100)");
		
		
		Thread.sleep(2000);
		
		//Dropdown
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select sc = new Select(dropdown);
		
		sc.selectByIndex(2);
		
		System.out.println(sc.getFirstSelectedOption().getText());
		
		Thread.sleep(2000);
		
		sc.selectByValue("option1");
		
		System.out.println(sc.getFirstSelectedOption().getText());
		
		
		sc.selectByVisibleText("Option3");
		System.out.println(sc.getFirstSelectedOption().getText());
		
		
		Thread.sleep(2000);
		
		//Checkbox
		
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption2")).isSelected());
		
		driver.findElement(By.id("checkBoxOption2")).click();
		
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption2")).isSelected());
		
				
		Thread.sleep(2000);
		
		
		
		
		//Switch window Example
		
		driver.findElement(By.id("openwindow")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> IT = windows.iterator();
		
		String parent = IT.next();
		
		String child = IT.next();
		
		driver.switchTo().window(child);
		
		System.out.println(driver.getTitle());
			
		driver.close();
		
		driver.switchTo().window(parent);
		
		Thread.sleep(5000);
		
		
		//Switch tab Example
		
		driver.findElement(By.id("opentab")).click();
		
		Set<String> tabs = driver.getWindowHandles();
		
		Iterator<String> reoccur = tabs.iterator();
		
		String otab = reoccur.next();
		
		String childtab = reoccur.next();
		
		driver.switchTo().window(childtab);
		
		
		System.out.println(driver.findElement(By.cssSelector("[class='navigation clearfix']")).getText());
		
		driver.close();
		
		driver.switchTo().window(otab);
		
		Thread.sleep(2000);
		
		
		//Alert
		
		
		driver.findElement(By.id("name")).sendKeys("DJinn");
		
		
		driver.findElement(By.id("alertbtn")).click();
		
		Alert normal = driver.switchTo().alert();
		
		System.out.println(normal.getText());
		
		normal.accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		
		
		Alert normal2 = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		System.out.println(normal2.getText());
		
		Thread.sleep(2000);
		
		normal2.dismiss();
		
		
		
		
		//Element displayed example
		
		Assert.assertTrue(driver.findElement(By.id("displayed-text")).isDisplayed());
		
		driver.findElement(By.id("displayed-text")).sendKeys("DJ");
		
		driver.findElement(By.id("hide-textbox")).click();
		
		Assert.assertFalse(driver.findElement(By.id("displayed-text")).isDisplayed());
     
	*/	
		
		//Web Table Fixed header
		
		Thread.sleep(500);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scroll(5,700)");
		
		Thread.sleep(500);
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=1000");
		
		
		List<WebElement> amount = driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
				
			
		int sum=0;
		
		for(int i=0;i<amount.size();i++)
		{
			sum = sum + Integer.parseInt(amount.get(i).getText());
			
		}
		
		System.out.println(sum);
		
		
		
		driver.findElement(By.cssSelector("[class='totalAmount']")).getText();
		
		
		int Total = Integer.parseInt(driver.findElement(By.cssSelector("[class='totalAmount']")).getText().split(":")[1].trim());
		
		System.out.println(Total);
		
		Assert.assertEquals(sum, Total);
		
		Thread.sleep(2000);
		
		//Web Table Example
		
		List<WebElement> webtable = driver.findElements(By.xpath("//*[@name='courses']/tbody/tr/td[3]"));
		
		int total_value =0;
		
		for(int j=0;j<webtable.size();j++)
		{
			total_value = total_value +Integer.parseInt(webtable.get(j).getText());
			
			
		}
		
		System.out.println(total_value);

	}

}
