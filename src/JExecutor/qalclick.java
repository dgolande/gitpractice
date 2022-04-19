package JExecutor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qalclick {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']/li[5]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scroll(0,650)");
		
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr"));
		
		int r_count = rows.size();
		
		System.out.println("The number of rows are "+r_count);
		
		
		
		List<WebElement> columns = driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr[3]/td"));
		
		int c_count = columns.size();
		
		System.out.println("The number of columns are "+c_count);
		
		
		for(int i=0;i<c_count;i++)
		{
			String row2 = columns.get(i).getText();
			
			System.out.println(row2);
		}
	
		
			
			
			
		
		
		
		
		
		
	}

}
