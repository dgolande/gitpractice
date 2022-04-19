package locators;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class bigbazzar {

	public static void main(String[] args) throws InterruptedException 
	{
	
		
		ChromeOptions optionz=new ChromeOptions();

		Map<String, Object> prefs=new HashMap<String,Object>();

		prefs.put("profile.default_content_setting_values.notifications", 1);

		//1-Allow, 2-Block, 0-default

		optionz.setExperimentalOption("prefs",prefs);
		
		
		
		
		
		
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(optionz);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String[] list = {"Beverages"};
		
		driver.get("https://shop.bigbazaar.com/");
		
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.className("loginCross")).click();
		
		//Thread.sleep(1000);
		
		//driver.findElement(By.cssSelector("[class='shopby-btn']")).click();
		
		
		
		
		
		
		
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='clear-fixes widget-module__widget-block--21wYS']"));
		
		
		for (int i=0;i<options.size();i++)
		{
			String names = options.get(i).getText();
			
			String[] changed = options.get(i).getText().split("-");
			
			String Updatedname = changed[0].trim();
			
			
		    System.out.println(Updatedname);
		    
		    
		    List shoplist = Arrays.asList(list);
		    
		    int j=0;
		    if (shoplist.contains(Updatedname))
		    {
		    	j++;
		    	
		    	driver.findElements(By.xpath("//div[@class='clear-fixes widget-module__widget-block--21wYS']/div/div/div[6]/div/a")).get(i).click();
		    
		    	if (j==list.length)
		    	{
		    		break;
		    	}
		    
		    }
			
			
		}
				
	
		
		

	}

}
