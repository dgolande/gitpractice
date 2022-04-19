package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class attribute {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		
		
		//Handling Attribute before enabled & after enabled
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("It is enabled");
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}
		
		
		//Handling Checkbox
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		
		
		
		//Handling Dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.cssSelector("[class='mapbg']  [value='JSA']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[id='glsctl00_mainContent_ddl_destinationStation1_CTNR']  [value='UDR']")).click();
		
		Thread.sleep(2000);
		
		//Handling Calendar
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click();
		
		
		
		//Handling Dropdown for Select
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		
		WebElement Adult = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		
		Select options = new Select(Adult);
		
		
		options.selectByVisibleText("4");
		
		System.out.println(options.getFirstSelectedOption().getText());
		
		
		
		WebElement Child = driver.findElement(By.id("ctl00_mainContent_ddl_Infant"));
		
		Select dropdown = new Select(Child);
		
		
		dropdown.selectByIndex(2);
		
		System.out.println(options.getFirstSelectedOption().getText());
		
		
		//Handling Dropdown for Select
		
		WebElement Currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select Handle = new Select(Currency);
		
		
		Handle.selectByVisibleText("USD");

		System.out.println(Handle.getFirstSelectedOption().getText());
		
		
		
		
		
		
		
	}

}
