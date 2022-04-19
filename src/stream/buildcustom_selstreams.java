package stream;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.util.Strings;

public class buildcustom_selstreams {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on column
		
		driver.findElement(By.cssSelector("[aria-label='Veg/fruit name: activate to sort column ascending']")).click();
		
		//get the all element in list
		
		List<WebElement> veggie_names = driver.findElements(By.xpath("//tr/td[1]"));
		
		//create the list of elements with stream
		
		 List<String> vnames = veggie_names.stream().map(s->s.getText()).collect(Collectors.toList());
		 
		//sorted the list
		
		 
		 List<String> sortednames = vnames.stream().sorted().collect(Collectors.toList());
		
		//compare the list
		
		Assert.assertEquals(vnames, sortednames);
		
		List<String> price;
		
		do 
		{
			
	    List<WebElement> v_names = driver.findElements(By.xpath("//tr/td[1]"));
			
		price = v_names.stream().filter(s->s.getText().contains("Strawberry")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));
		
		if(price.size()<1)
		{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		
		
		}while(price.size()<1);
		
	}

	private static String getPriceVeggie(WebElement s) {
		
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return pricevalue;
		
	}

}
