package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforcesibbling {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
	driver.get("https://www.salesforce.com//ap//hub//sales//");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//ul[@class='wwww-main-nav searchEnabled']/li[1]")).click();
	
    System.out.println(driver.findElement(By.xpath("//ul[@class='wwww-main-nav searchEnabled']/li[1]")).getText());

	driver.findElement(By.xpath("//ul[@class='wwww-main-nav searchEnabled']/li[1]/following-sibling::li[1]")).click();
	
	System.out.println(driver.findElement(By.xpath("//ul[@class='wwww-main-nav searchEnabled']/li[1]/following-sibling::li[1]")).getText());
	
	driver.findElement(By.xpath("//ul[@class='wwww-main-nav searchEnabled']/li[1]/following-sibling::li[2]")).click();
	
	System.out.println(driver.findElement(By.xpath("//ul[@class='wwww-main-nav searchEnabled']/li[1]/following-sibling::li[2]")).getText());
	
	driver.findElement(By.xpath("//ul[@class='wwww-main-nav searchEnabled']/li[1]/following-sibling::li[3]")).click();
	
	System.out.println(driver.findElement(By.xpath("//ul[@class='wwww-main-nav searchEnabled']/li[1]/following-sibling::li[3]")).getText());
	
	driver.findElement(By.xpath("//ul[@class='wwww-main-nav searchEnabled']/li[1]/following-sibling::li[4]")).click();
	
	
	System.out.println(driver.findElement(By.xpath("//ul[@class='wwww-main-nav searchEnabled']/li[1]/following-sibling::li[4]")).getText());
	
	
	driver.findElement(By.xpath("//ul[@class='wwww-main-nav searchEnabled']/li[4]/parent::ul/parent::nav/parent::div[@id='globalnavbar-header-container']")).getSize();
	
	System.out.println(driver.findElement(By.xpath("//ul[@class='wwww-main-nav searchEnabled']/li[4]/parent::ul/parent::nav/parent::div[@id='globalnavbar-header-container']")).getText());
	
	
	//driver.findElement(By.xpath("//ul[@class='wwww-main-nav searchEnabled']/li[4]/parent::ul/parent::nav/parent::div[@id='globalnavbar-header-container']/div[3]")).click();
	
	
	//System.out.println(driver.findElement(By.xpath("//ul[@class='wwww-main-nav searchEnabled']/li[4]/parent::ul/parent::nav/parent::div[@id='globalnavbar-header-container']/div[3]")).getText());
	

	//driver.findElement(By.xpath("//*[text()= 'About Salesforce']")).click();
	
	//System.out.println(driver.findElement(By.xpath("//*[text()= 'About Salesforce']")).getText());

	
	driver.findElement(By.xpath("//*[@role='banner']")).click();
	
	System.out.println(driver.findElement(By.xpath("//*[@role='banner']")).getText());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

	}

}
