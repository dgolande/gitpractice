package JExecutor;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Paytm {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://paytm.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		
	//	JavascriptExecutor js = (JavascriptExecutor)driver;
		
	//	js.executeScript("window.scroll(0,1000)");
		
		
		
		
		
	/*	
		driver.findElement(By.cssSelector("[class='_3ac-']")).click();
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("[scrolling='no']")));
				
		
		
		WebElement menu = driver.findElement(By.cssSelector("[class='menuContainer']"));
		
		System.out.println(menu.findElements(By.tagName("a")).size());
		
		for(int i=0;i<menu.findElements(By.tagName("a")).size();i++)
		{
			String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			menu.findElements(By.tagName("a")).get(i).sendKeys(click);
			
		}
		
		
	    String parent = driver.getWindowHandle();
	
		Set<String> win = driver.getWindowHandles();
		
		Iterator<String> IT = win.iterator();
		
		while(IT.hasNext())
		{
			driver.switchTo().window(IT.next());
			
			System.out.println(driver.getTitle());
			
			driver.switchTo().window(parent);
		}
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.cssSelector("[alt='close']")).click();
		
		
		
		driver.findElement(By.cssSelector("[class='iconMenu cursor']")).click();
		
		
		WebElement shop = driver.findElement(By.xpath("//div[@class='_26bf']"));
		
		
		System.out.println(shop.findElements(By.tagName("a")).size());
		
		for(int i=0;i<shop.findElements(By.tagName("a")).size();i++)
		{
		  
			String items = shop.findElements(By.tagName("a")).get(i).getText();
			
			System.out.println(items);
			
		
		}
		
	    Thread.sleep(5000);
		
		WebElement mens =  driver.findElement(By.xpath("//div[@class='_26bf']/a[6]"));
		
		
		
		act.moveToElement(mens).build().perform();
		
		
		WebElement mensfashion = driver.findElement(By.cssSelector("[class='bbKy']"));
		
		System.out.println(mensfashion.getText());
		
		*/
		
		
		Actions act = new Actions(driver);
		
		WebElement search = driver.findElement(By.cssSelector("[type='search']"));
		
		
		
		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("mobile",Keys.ENTER).build().perform();
		
		WebElement sort = driver.findElement(By.cssSelector("[class='_32-f']"));
		
		act.moveToElement(sort).build().perform();
		
		
		WebElement options =  driver.findElement(By.cssSelector("[class='_29BM']"));
		
		System.out.println(options.findElements(By.tagName("div")).size());
		
		System.out.println(options.getText());
		
		for(int i=0;i<options.findElements(By.tagName("div")).size();i++)
		{
			String sname = options.findElements(By.tagName("div")).get(i).getText();
			
			if(sname.contains("Low Price"))
			{
				options.findElements(By.tagName("div")).get(i).click();
			}
			
			
	    }
		
		Thread.sleep(3000);
		
		JavascriptExecutor sc = (JavascriptExecutor)driver;
		
		sc.executeScript("window.scroll(2,4000)");
		
		
		driver.findElement(By.xpath("//*[text()='Mobile Recharge']")).click();
		
		driver.findElement(By.xpath("//div[@class='_3J5h Uv1l']/a[2]")).click();
		
		//WebElement telno = driver.findElement(By.cssSelector("[type='tel']"));
		
		//act.moveToElement(telno).click().sendKeys("9960528199").doubleClick().keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		
		Thread.sleep(1000);
		
		
		Set<String> win = driver.getWindowHandles(); 
        
        Iterator<String> IT = win.iterator();
        
        String parent = IT.next();
		
        String child = IT.next();
       
       
        
        driver.switchTo().window(child);
        
		System.out.println(driver.getTitle());
		
		//driver.findElement(By.cssSelector("[id='radio1']")).click();
		
		//driver.switchTo().activeElement().sendKeys("Maharashtra");
		
		Thread.sleep(5000);
		
       WebElement op = driver.findElement(By.xpath("//div[@class='dfy8']/ul/li[3]"));
		
	   act.moveToElement(op).click().sendKeys("Maha",Keys.ENTER).build().perform();
		
	   Thread.sleep(5000);
	   
	   driver.findElement(By.cssSelector("[class='_11kC  _15qf _2qE6']")).click();
	   
	   Thread.sleep(5000);
	   
	   driver.findElement(By.xpath("//*[text()='Rs. 149']")).click();
	   
	   Thread.sleep(5000);
	   
	   
	   driver.close();
	   
	  // WebElement tel = driver.findElement(By.cssSelector("[class='_37RZ'] [type='tel']"));
	   
	  // tel.sendKeys("9960528199");
	   
	   Thread.sleep(5000);
	   
	   driver.findElement(By.cssSelector("[class='icon-logoColored wpwl']")).click();
	   
	   System.out.println(driver.getTitle());
	   
	   Thread.sleep(5000);
	   
	   
	   JavascriptExecutor js = (JavascriptExecutor)driver;
		
	  js.executeScript("window.scroll(0,100)");
	   
	   
	   
	   driver.findElement(By.cssSelector("[alt='Flight']")).click();
	   
	   Thread.sleep(5000);
	   
	   System.out.println(driver.getTitle());
	   
	  
	   
	   
	   
	   
	   

	   
	   /*
	   
	   driver.findElement(By.cssSelector("[data-reactid='165']")).sendKeys("Mum");
	   
	   List<WebElement> from = driver.findElements(By.cssSelector("[class='_2Alu']"));
	   
	   int count = from.size();
	   
 	   System.out.println(count);
 	   
 	   
 	   for(int j=0;j<count;j++)
 	   {
 		   String cities = from.get(j).getText();
 		   
 		   System.out.println(cities);
 		   
 	   }
 	   
 	   */
		
	}

}
