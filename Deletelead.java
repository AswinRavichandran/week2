package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Deletelead {
	public static void main(String[] args) throws InterruptedException {
		//http://leaftaps.com/opentaps/control/main
		 WebDriverManager.chromedriver().setup();
		 //	Launch the browser
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
		
		//Click on Phone
		 driver.findElement(By.linkText("Phone")).click();
		
		//Enter phone number
		 driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		 driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("+91");
		 driver.findElement(By.name("phoneNumber")).sendKeys("99");
		
		//Click find leads button
		 
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		
		
		
		//12	Click First Resulting lead
		 driver.findElement(By.partialLinkText("11822")).click();
		//13	Click Delete
		 driver.findElement(By.partialLinkText("Delete")).click();
		 
		//14	Click Find leads
		 driver.findElement(By.linkText("Find Leads")).click();
		 
		//15	Enter captured lead ID
		 driver.findElement(By.name("id")).sendKeys("11822");
		 
		//16	Click find leads button
		 driver.findElement(By.linkText("Find Leads")).click();
		  Thread.sleep(3000);
		 
		 
		
		//17	Close the browser (Do not log out)
		  driver.close();
	}

}
