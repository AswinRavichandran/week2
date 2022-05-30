package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Enter the username
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		 
		 //Enter the password
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 
		 //Click Login
	     driver.findElement(By.className("decorativeSubmit")).click();
	     
	     //Click crm/sfa link
		 driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		 
		 //Click Leads link
		 driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		
		//	Click Find leads
		 driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		 
		 driver.findElement(By.linkText("Email")).click();
		 
		 driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("raviaswin2406@gmal.com");
		 
		 driver.findElement(By.partialLinkText("10032")).click();
	 
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		  
		 driver.getTitle();
			
     	 driver.findElement(By.className("smallSubmit")).click();
     	 
		 String dd1 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		 System.out.println(dd1);
		 
		 driver.close();
		    
		 
		
	}

}
