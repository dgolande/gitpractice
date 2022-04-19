package Synchronization;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Automationpracticeall {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Work related drivers etc\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		WebDriverWait w = new WebDriverWait(driver,5);
		
		
		//Radio Button
		List<WebElement> radio = driver.findElements(By.xpath("//div[@id='radio-btn-example']/fieldset/label/input"));
		
	
		for (int i=0;i<radio.size();i++)
	{
		
			w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='radio-btn-example']/fieldset/label/input")));
			driver.findElements(By.xpath("//div[@id='radio-btn-example']/fieldset/label/input")).get(i).click();
			
    }
	
		
		//Suggestion class
		
		
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@class='ui-menu-item']/div")));
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));
		
		
		for (WebElement suggestion : suggestions )
		{
			if(suggestion.getText().equalsIgnoreCase("India"))
					{
				       suggestion.click();
                    }
			
		}
		
		
		//Select dropdown
		
		
		WebElement drop = driver.findElement(By.id("dropdown-class-example"));
		
		Select s = new Select(drop);
		
		s.selectByIndex(1);
		
		System.out.println(s.getFirstSelectedOption().getText());
		
		
		s.selectByVisibleText("Option2");
		
		System.out.println(s.getFirstSelectedOption().getText());
		
		
		s.selectByValue("option3");
				
        System.out.println(s.getFirstSelectedOption().getText());
		
		
		
		//Select checkboxes
        
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int j=0;j<checkboxes.size();j++)
		{
			
			driver.findElements(By.xpath("//input[@type='checkbox']")).get(j).click();
		}
		
 		/*
		//Switching window
		
		driver.findElement(By.cssSelector("[id='openwindow']")).click();
		
		String parent = driver.getWindowHandle();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> IT = windows.iterator();
		
		
		while(IT.hasNext())
		{
			
			String child = IT.next();
			
			driver.switchTo().window(child);
			
			driver.manage().window().maximize();
			
			System.out.println(driver.getTitle());
			
			driver.switchTo().window(parent);
	   }
	   */
		
    
		//Alert
		
		
		WebElement name = driver.findElement(By.id("name"));
		
		name.sendKeys("Dhananjay");
		
		driver.findElement(By.cssSelector("[value='Alert']")).click();
		
		driver.switchTo().alert();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		
		name.sendKeys("Rahul");
	
		driver.findElement(By.cssSelector("[value='Confirm']")).click();
		
		driver.switchTo().alert();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().dismiss();
		
		
		//Element displayed
		
		Assert.assertTrue(driver.findElement(By.id("displayed-text")).isDisplayed());
		
		//System.out.println(driver.findElement(By.id("displayed-text")).isDisplayed());
		
		driver.findElement(By.id("hide-textbox")).click();;
		
		//System.out.println(driver.findElement(By.id("displayed-text")).isDisplayed());
		
		Assert.assertFalse(driver.findElement(By.id("displayed-text")).isDisplayed());
		
		
		
		
		//Switch tab
		
		driver.findElement(By.id("opentab")).click();
		
		String currentwin = driver.getWindowHandle();
		
		Set<String> allwin = driver.getWindowHandles();
		
		
		Iterator<String> IT1 = allwin.iterator();
		
		String cwin = IT1.next();
		
		String newwin = IT1.next();

		driver.switchTo().window(newwin);
		
		System.out.println("Tab is " +driver.getCurrentUrl());
		
		
		
		
		
	}

}
