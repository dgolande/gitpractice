package Frames;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class brokenlinkespncricinfo {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        ChromeOptions c = new ChromeOptions();
        
        c.merge(ch);
        
        System.setProperty("webdriver.chrome.driver","C:\\Work related drivers etc\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver(c);
        
        driver.manage().window().maximize();
        
        driver.manage().deleteAllCookies();
        
//      driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        
        driver.get("https://www.espncricinfo.com");
        
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        FileUtils.copyFile(src, new File("F://espncricinfo.png"));
        
      
        
        //move to live score
        
        
        WebElement livescore = driver.findElement(By.cssSelector("[title='Live Scores']"));
        
        Actions act = new Actions(driver);
        
        act.moveToElement(livescore).build().perform();
 
        Thread.sleep(30000);
        
        
        
        
        WebElement pop_up = driver.findElement(By.cssSelector("[class='wzrk-alert wiz-show-animate']"));
        
        
        
        
        if(pop_up.isDisplayed())
        {
        	driver.findElement(By.cssSelector("[class='No thanks']")).click();
        }
        
        
        
        
        driver.findElement(By.xpath("//div[@class='slick-list']/div/div[3]/div/div/a")).click();
        
        Thread.sleep(2000);
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
        js.executeScript("window.scroll(0,300)");
        
        
        driver.findElement(By.xpath("//*[text()='Scorecard']")).click();
        
        Thread.sleep(2000);
        
        js.executeScript("window.scroll(0,300)");
        
        
        driver.findElement(By.xpath("//div[@class='match-scorecard-page']/div[1]/div/span/div/div/div[2]")).click();
        
        Thread.sleep(2000);
        
        js.executeScript("window.scroll(0,300)");
        
        Thread.sleep(2000);
        
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
        
      
        List<WebElement> links = driver.findElements(By.cssSelector("[class='d-flex info-items'] a"));
      
        SoftAssert a = new SoftAssert();
        
        
        for(WebElement link : links)
        {
        	String url = link.getAttribute("href");
        	
        	HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        			
        	conn.setRequestMethod("HEAD");
        	
        	conn.connect();
        	
        	int responsecount = conn.getResponseCode();
        	
        	System.out.println(responsecount);
        	
        	a.assertTrue(responsecount<400, "The incorrect link is "+link.getText() + "& https code for the same is "+responsecount);
        	
        	
        }
        
        a.assertAll();
        
        
        
        
        
        
        
        
        
	}

}
