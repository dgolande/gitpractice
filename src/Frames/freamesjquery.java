package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class freamesjquery {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://jqueryui.com/droppable");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		//Check how many frames are there
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//Switch to frame by index
		//driver.switchTo().frame(0);

		//Switch to frame by string 
		driver.switchTo().frame(driver.findElement(By.cssSelector("[class='demo-frame']")));
		
		//Source element in frame
		WebElement source = driver.findElement(By.id("draggable"));
		
		//Target element in frame
		WebElement target = driver.findElement(By.id("droppable"));
		
		//Action class
		Actions act = new Actions(driver);
		
		act.dragAndDrop(source, target).build().perform();
		
		
		
		//Back to default content
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
