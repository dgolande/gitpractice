package Calendar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgodaCalendar {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String text = "Jai";
		
		driver.get("https://www.agoda.com/en-gb/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.findElement(By.cssSelector("[role='button']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//dropdown
		
		WebElement destination = driver.findElement(By.cssSelector("[aria-label='Enter a destination or property']"));
		
		destination.clear();
		
		destination.sendKeys(text);
		
		
		
		
		List<WebElement> options = driver.findElements(By.cssSelector("[class='Suggestion__categoryName_item']"));
		
		
		int count = options.size();
		
		System.out.println(count);
		
		for (int i=0;i<count;i++)
		{
		
			String received = options.get(i).getText();
			
			if(received.contains("Jaipur Airport"))
			{
				options.get(i).click();
			}
			
			
		}
		
		
		/*
		Thread.sleep(2000);
		
		//Calendar
		
		
		WebElement godate = driver.findElement(By.cssSelector("[class='Searchbox__wrapper'] [class='IconBox IconBox--checkIn IconBox--focused']"));
		
		godate.click();
		
		
		
		
		
		
		
		
		// Date seelction
		
		List<WebElement> date = driver.findElements(By.cssSelector("[class='DayPicker-Day'] "));
		
		int nos = date.size();
		
		System.out.println(nos);
		
		for (int j=0;j<nos;j++)
		{
			String DMY = date.get(j).getText();
			
			System.out.println(DMY);
			
			if(DMY.equalsIgnoreCase("24"))
			{
				 date.get(j).click();
			}
		}
		
		
		*/
		
		
		
		

	}

}
