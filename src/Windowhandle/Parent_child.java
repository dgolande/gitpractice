package Windowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Parent_child {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		
		
		WebElement Hot_Meal = driver.findElement(By.xpath("//ul[@class='add-ons-tab']/li[3]/a"));
		
		act.moveToElement(Hot_Meal).keyDown(Keys.CONTROL).click().build().perform();
		
		//act.contextClick(Hot_Meal).keyDown(Keys.CONTROL).click().build().perform();
		
		
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> IT = windows.iterator();
		
        String Parent = IT.next();		
		
		String Child = IT.next();
		
		driver.switchTo().window(Child);
		
		
		driver.findElement(By.xpath("//div[@class='col-5 offset-1 pt-4 text-left']/p/a")).click();
		
		
		driver.switchTo().window(Parent);
		

	}

}
