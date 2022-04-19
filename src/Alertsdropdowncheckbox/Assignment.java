package Alertsdropdowncheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Work related drivers etc\\geckodriver.exe");
		
		WebDriver firefox = new FirefoxDriver();
		
		firefox.get("https://www.cleartrip.com/");
		
		firefox.manage().window().maximize();
		
		
	    //Select dropdown
		
		WebElement Adult = firefox.findElement(By.id("Adults"));
		WebElement Child = firefox.findElement(By.className("[name='childs']"));
		
		Select dropdowns = new Select(Adult);
		
		dropdowns.selectByIndex(4);
		
		System.out.println(dropdowns.getFirstSelectedOption().getText());
		
		Select options = new Select(Child);
		
		options.selectByValue("3");
		
		System.out.println(options.getFirstSelectedOption());
		
		
		
		

		
		
		
		
		
		


	}

}
