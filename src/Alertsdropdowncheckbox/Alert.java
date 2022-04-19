package Alertsdropdowncheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Work related drivers etc\\geckodriver.exe");
		
		FirefoxDriver firefox = new FirefoxDriver();
		
		firefox.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		firefox.manage().window().maximize();
		
		String text = "Dhananjay";
		
		firefox.findElement(By.id("name")).sendKeys(text);
		
		firefox.findElement(By.id("alertbtn")).click();
		
		System.out.println(firefox.switchTo().alert().getText());
		
		Thread.sleep(1000);
		
		firefox.switchTo().alert().accept();
		
		
		
		firefox.findElement(By.id("confirmbtn")).click();
		
		System.out.println(firefox.switchTo().alert().getText());

        Thread.sleep(1000);
		
		firefox.switchTo().alert().dismiss();
		
		
		
		
	}

}
