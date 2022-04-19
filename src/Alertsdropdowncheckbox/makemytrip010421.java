package Alertsdropdowncheckbox;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class makemytrip010421 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Work related drivers etc\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		/*
		WebElement popup = driver.findElement(By.xpath("//div[@class='autopop__wrap makeFlex column defaultCursor']"));
		
		WebElement account = driver.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser']"));
		
		if(popup.isDisplayed())
		{
			account.click();
			
		} */
		

			
		//System.out.println(driver.findElements(By.tagName("select")).size());
		
        
		
        
       
        
        
        
        
        
        
        //Travellers
        
        driver.findElement(By.xpath("(//span[@class='lbl_input latoBold appendBottom10']) [3]")).click();
        
        
        List<WebElement> Adult = driver.findElements(By.xpath("//p[@data-cy='adultRange']/following-sibling::ul[1]"));
        
        int adultscount = driver.findElements(By.xpath("//p[@data-cy='adultRange']/following-sibling::ul[1]/li")).size();
        
        
        for (int k=0;k<adultscount;k++)
        {
        
        	String aged = driver.findElements(By.xpath("//p[@data-cy='adultRange']/following-sibling::ul[1]/li")).get(k).getText();
        	
        	System.out.println(aged);
        	
         	
        	if(aged.equalsIgnoreCase("4"))
        	{
        		driver.findElements(By.xpath("//p[@data-cy='adultRange']/following-sibling::ul[1]/li")).get(k).click();
        		
        		System.out.println(aged);
        		
        	}
        	
        }	
        	
        	
        List<WebElement> children = driver.findElements(By.xpath("//p[@data-cy='childrenRange']/following-sibling::ul[1]/li"));
        
        int child_count = driver.findElements(By.xpath("//p[@data-cy='childrenRange']/following-sibling::ul[1]/li")).size();
        		
        
        for (int l=0;l<child_count;l++)
        {
        	String bacha = driver.findElements(By.xpath("//p[@data-cy='childrenRange']/following-sibling::ul[1]/li")).get(l).getText();
        	
        	System.out.println(bacha);
        	
        	if(bacha.equalsIgnoreCase("3"))
        	{
        		driver.findElements(By.xpath("//p[@data-cy='childrenRange']/following-sibling::ul[1]/li")).get(l).click();
        		
        		break;
        	}
        	
        	
        	
       }
        
       driver.findElement(By.cssSelector("[data-cy='travellerApplyBtn']")).click(); 
        
        
        
       
       
       //Accssing return dates
       
       driver.findElement(By.xpath("(//span[@class='lbl_input latoBold appendBottom10']) [2]")).click();
       
       WebElement range = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']"));
			
       range.getText().contains("May");
       
       
	
       List<WebElement> retun = driver.findElements(By.xpath("//div[@class='dateInnerCell']"));
       
       int r_date = driver.findElements(By.xpath("//div[@class='dateInnerCell']")).size();
       
      
       for (int j=0;j<r_date;j++)
       {
       	
       	String selected_date = driver.findElements(By.xpath("//div[@class='dateInnerCell']/p")).get(j).getText();
       	
       
       if (selected_date.equalsIgnoreCase("15"))
       {
       	driver.findElements(By.xpath("//div[@class='dateInnerCell']/p")).get(j).click();
      
       	 System.out.println(selected_date);
       	 
       	 break;
       }
       
      
	}
       

       
       
       
       
       
       
		
       // Departure, class, Travellers
          driver.findElement(By.xpath("(//span[@class='lbl_input latoBold appendBottom10'])[1]")).click();
          
          
          //pickuping the months
          WebElement month = driver.findElement(By.cssSelector("div[class='DayPicker-Caption']"));

          month.getText().contains("April");
          
           while(!month.getText().contains("April")) {

  driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();

           }
          
          //Get access for all dates for the selected months 
          List<WebElement> element = driver.findElements(By.cssSelector("div[class='dateInnerCell']"));
          
          //Getting size of dates 
          int datesCount= driver.findElements(By.cssSelector("div[class='dateInnerCell']")).size();
          
          
          // for iteratation
          for(int i=0;i<datesCount;i++)

          {

          //Getting the selected date one by one	
          String date =driver.findElements(By.cssSelector("div[class='dateInnerCell']>p")).get(i).getText();

          //Comparing selected date with the mentioned date
          if(date.equalsIgnoreCase("27"))

          {
             //Clicking on selected date
             driver.findElements(By.cssSelector("div[class='dateInnerCell']>p")).get(i).click();

             //Printing selected date
             System.out.println(date);

             break;

          }
          
       
       
       
       
  		
  		driver.findElement(By.xpath("//div[@class='whiteText']")).click();
  		
  		driver.findElement(By.xpath("//div[@class='dropDownCard']/p[1]/span[1]")).click();
  		
  		
  		driver.findElement(By.id("fromCity")).click();
  		
  		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));
  		
  		source.sendKeys("Mumb");
  		
  		source.sendKeys(Keys.ARROW_DOWN);
  		
  		source.sendKeys(Keys.ENTER);
  		
  		
  		
  		WebElement destination = driver.findElement(By.xpath("//input[@placeholder='To']"));
  		
  		Thread.sleep(1000);
  		
  		destination.click();
  		
  		Thread.sleep(1000);
  		
  		destination.sendKeys("DELH");
  		
  		Thread.sleep(1000);
  		
  		for(int s=1;i<3;i++) 
  		{
  		   destination.sendKeys(Keys.ARROW_DOWN);	
  		   destination.sendKeys(Keys.ENTER);
  		}

       
       
       
       
       
       
       
       
       
       
        }    
        
        
        
	}        
        
 	
}

