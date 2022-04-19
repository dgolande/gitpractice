package Alertsdropdowncheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Indigo {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.goindigo.in");
		
	//	driver.findElement(By.xpath("//form[@name='flight-search']/div[2]/div[2]/label[1]")).click();
		
	//	driver.findElement(By.xpath("//form[@name='flight-search']/div[2]/div[1]/label/label[1]")).click();
		
		
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='row justify-content-around bw-mobile ie-justify-dest']    //input[@placeholder='Departure Date']")).click();
		
		
		
		/*WebElement element = driver.findElement(By.xpath("//input[@name='passenger']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(element).click().perform();
		
		
		action.click();   */
		
		
		driver.findElement(By.xpath("//input[@name='passenger']")).click();
		
		
		for (int i=1;i<5;i++)
		{
			driver.findElement(By.xpath("//li[@class='adult-pax-list extra-seat']/div[1]/button[2]/span[1]")).click();
		}
		
		Thread.sleep(3000);
		
		/*
		for (int i=1;i<3;i++)
		{
			driver.findElement(By.cssSelector("[class='child-pax-list extra-seat'] [class='pax-plus btn btn-info']")).click();
		}
		
			
		int j=0;
		 while(j<3) 
			 {
			    
			      driver.findElement(By.xpath("//li[@class='child-pax-list extra-seat']/div[1]/button[2]/span[1]")).click();
                  j++;			 
			 
			 }   */
	

	}

}
