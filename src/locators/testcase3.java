package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class testcase3 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.linkedin.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("+91 9960528199");
		
		driver.findElement(By.xpath("//input[contains(@name,'session_pass')]")).sendKeys("Pune@123");
		
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div[2]/form/button")).click();
		
		
		driver.close();
		
		
		
		

	}

}
