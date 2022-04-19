package Alertsdropdowncheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Agoda {

	public static void main(String[] args) throws InterruptedException 
	
	{
        System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.agoda.com/en-gb/");
		
		
		driver.findElement(By.xpath("//input[@data-selenium='textInput']")).clear();
		
		driver.findElement(By.xpath("//input[@data-selenium='textInput']")).sendKeys("Oot");
		
		
	//	//li[@class='Suggestion__categoryName_item']/span
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='Popup__content']/ul/li[1]/ul/li[1]"));
		
		
		
	
		int datesCount= driver.findElements(By.xpath("//div[@class='Popup__content']/ul/li[1]/ul/li[1]")).size();
		
        
	       
        for(int i=0;i<datesCount;i++)

        {

        String date =driver.findElements(By.xpath("//div[@class='Popup__content']/ul/li[1]/ul/li[1]")).get(i).getText();

        if(date.equalsIgnoreCase("Ooty"))

        {

        	driver.findElements(By.xpath("//div[@class='Popup__content']/ul/li[1]/ul/li[1]")).get(i).click();

           System.out.println(date);

           break;

        }	
		
		
			
		
		
		
		
        }		
 
	}

}
