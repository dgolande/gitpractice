package locators;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Greenkartfun {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		String[] itemsneeded = {"Onion","Potato","Carrot","Palak"};
		
		
		driver.get("https://www.bigbasket.com/");
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Greenkartfun g = new Greenkartfun();
		g.addItems(driver, itemsneeded);
		
		
		driver.findElement(By.id("toTop")).click();
		
		driver.findElement(By.xpath("//span[@class='basket-content']")).click();
		
		
		//WebDriverWait w = new WebDriverWait(driver,5);
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@class='basket-content']")));
		
		
		
		
		
		
	}		
		
		
		public void addItems (WebDriver driver,String[] itemsneeded )
{
	

		
		
		List<WebElement> products = driver.findElements(By.xpath("//section[@class='row custom-component carousel-section ng-scope']  //div[@qa='product_name']/a"));
		
		
		//section[@class='row custom-component carousel-section ng-scope']
		
		//div[@qa='product_name']/a
		
		
		//List<WebElement> products = driver.findElements(By.xpath("//div[@qa='product_name']"));
		
		for (int i=0;i<products.size();i++)
		{
			 String[] name = products.get(i).getText().split("-");
			
			 String formattedName = name[0].trim();
			
		
			//String name = products.get(i).getText();
			
			//System.out.println(products.get(i).getText());
			
			//format it to get actual vegetable name
			
		
			//check whether name you have extracted is present in array or not
			//convert array into array list for easy search
			
			List itemlist = Arrays.asList(itemsneeded);
			
			
			
			int j=0;
			
			if(itemlist.contains(formattedName))
			{
				j++;
				
				driver.findElements(By.xpath("//button[@qa='add']")).get(i).click();	
				
				if(j==itemsneeded.length)
				{
				  break;
			    }
		     }
		
		}		
		

}	

}
	
