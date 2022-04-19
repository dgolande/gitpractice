package Synchronization;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitwait {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String[] list = {"Carrot","Tomato","Beans","Brinjal"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		//addItems(driver,list);
		
		//Implicit wait
		//implicitwait i = new implicitwait();
		
		//Calling a method 
		addItems(driver, list);
		
		
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		
		driver.findElement(By.cssSelector("div.action-block button")).click();
		
		//Explicit wait
		
		WebDriverWait wait2 = new WebDriverWait(driver,5);
		
		
		
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		
		
		//Explicit wait
		WebDriverWait w = new WebDriverWait(driver,5);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		
		
		
		
		
		

	}



    
    public static void addItems(WebDriver driver, String[] list)
    {
    	
    

    List<WebElement> options = driver.findElements(By.cssSelector("h4.product-name"));


for (int i=0;i<options.size();i++)
{
	  //String names = options.get(i).getText();
	
	  //System.out.println(names);
	
	
	String[] Splitname = options.get(i).getText().split("-");
	
	String Updatedname = Splitname[0].trim();
	
//	System.out.println(Updatedname);
	
	
	List shopinglist = Arrays.asList(list);
	
	int j=0;
	if(shopinglist.contains(Updatedname))
	{
		j++;
		
		driver.findElements(By.cssSelector("div.product button")).get(i).click();

		
		if(j==4)
		{
			break;
		}
	}
	
}
	
    
}
}