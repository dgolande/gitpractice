import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Chrome {

	public static void main(String[] args) 
	{
	
		 System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://www.google.com");
		  
		 driver.manage().window().maximize(); 
		 
		 System.out.println(driver.getTitle());
		 
	   	 
	   	 driver.get("http://www.yahoo.com");
	   	 
	   	 driver.navigate().back();
	   	 
		 driver.quit();
		 
		 
		 System.setProperty("webdriver.gecko.driver","C:\\Work related drivers etc\\geckodriver.exe");
		 WebDriver firefox = new FirefoxDriver();
		 
		 firefox.get("http://www.Udemy.com");

		 firefox.manage().window().maximize();
		 
		 firefox.get("http://www.gmail.com");
		 
		 firefox.manage().window().maximize();
		 
		 firefox.navigate().back();
		 
		 firefox.navigate().forward();
		 
         System.out.println(firefox.getTitle());
		 
		
		 
		 firefox.quit();
		 
		 
		 
		 
		
		 
		 System.setProperty("webdriver.ie.driver","C:\\Work related drivers etc\\IEDriverServer.exe");
		 WebDriver IE = new InternetExplorerDriver();
       	 
		 IE.get("http://www.cars24.com");
		 
		 IE.manage().window().maximize();
		 
		 IE.get("http://www.amazon.com");
		 
		 IE.manage().window().maximize();
		 
		 IE.navigate().back();
		 
		 System.out.println(IE.getTitle());
		
		 IE.quit();
		 
		 
		 
		 
		 
         
		 

		
		 
         	}

}
