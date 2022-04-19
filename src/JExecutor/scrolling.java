package JExecutor;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class scrolling {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scroll(5,700)");
		
		Thread.sleep(500);
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		
		
		List<WebElement> amount = driver.findElementsByXPath("//div[@class='tableFixHead']/table/tbody/tr/td[4]");
		
	
		int sum=0;
		
		for(int i=0;i<amount.size();i++)
		{
			sum = sum + Integer.parseInt(amount.get(i).getText());
			
		}
		
		System.out.println(sum);
		
		
		driver.findElement(By.cssSelector("[class='totalAmount']")).getText();
		
		
		int Total = Integer.parseInt(driver.findElement(By.cssSelector("[class='totalAmount']")).getText().split(":")[1].trim());
		
		
		Assert.assertEquals(sum, Total);
		
		
		
		List<WebElement> webtable = driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr/td[3]"));
		
		int add=0;
		
		for (int j=0;j<webtable.size();j++)
		{
			add = add + Integer.parseInt(webtable.get(j).getText());
			
		}
		
		System.out.println(add);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
