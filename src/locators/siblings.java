package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class siblings {

	public static void main(String[] args) 
	
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.cssSelector("[name*=txtPassword]")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		driver.findElement(By.xpath("//div[@id='mainMenu']/ul/li[3]/a")).click();
		
		driver.findElement(By.xpath("//input[@id='btnSearch']/following-sibling::input[1]")).click();
		
		driver.findElement(By.xpath("//li[@class='current main-menu-first-level-list-item']/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"menu__Performance\"]/b")).click();
		
		
	    driver.findElement(By.xpath("//*[text()='My Info']")).click();
	    
	    
		driver.findElement(By.xpath("//div[@class='stepper-input']/a/following-sibling::a[1]")).click();
	    
		
		
		

	}

}
