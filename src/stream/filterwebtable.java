package stream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class filterwebtable {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.id("search-field")).sendKeys("Rice");
		
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
		
		veggies.stream().map(s->s.getText()).forEach(a->System.out.println(a));
		
		
		List<WebElement> filteredlist = veggies.stream().filter(veggie->veggie.getText().contains("Rice")).collect(Collectors.toList());		
		
		Assert.assertEquals(veggies.size(), filteredlist.size());
		
		
	}

}
