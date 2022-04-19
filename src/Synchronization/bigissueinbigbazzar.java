package Synchronization;

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

public class bigissueinbigbazzar {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub


		ChromeOptions optionz=new ChromeOptions();

		Map<String, Object> prefs=new HashMap<String,Object>();

		prefs.put("profile.default_content_setting_values.notifications", 1);

		//1-Allow, 2-Block, 0-default

		optionz.setExperimentalOption("prefs",prefs);
		
		
		String[] list = {"FROOTI Juice","TATA TEA Tea"};
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(optionz);
		
		
	    driver.get("https://shop.bigbazaar.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.className("loginCross")).click();
		
		
		
		driver.findElement(By.xpath("//div[@class='clear-fixes widget-module__widget-block--21wYS']/div/div/div[6]/div/a")).click();
		
		
		
		
		
		
		List<WebElement> prodcuts = driver.findElements(By.cssSelector("[class='product-name']"));
		
		
		for(int i=0;i<prodcuts.size();i++)
		{
			  String[] names = prodcuts.get(i).getText().split("-");
			
			  String updatednames = names[0].trim();
			
			  //String names1 = prodcuts.get(i).getText();
			
			System.out.println(updatednames);
			
			
			List itmslist = Arrays.asList(list);
			
			
			
			int j=0;
			if(itmslist.contains(updatednames))
			{
				
				
				j++;
				
				
				driver.findElements(By.cssSelector("[class='addbtn-new ripple']")).get(i).click();
			
			    if(j==list.length)
			    {
			    	break;
			    }
			}
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
	}

}
