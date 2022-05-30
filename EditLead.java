package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
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
		 
		 driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen248']//input")).sendKeys("as");
		 
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 
		 driver.findElement(By.partialLinkText("10056")).click();
		 
		 System.out.println(driver.getTitle());
		  
		 driver.findElement(By.linkText("Edit")).click();
		 
		 driver.findElement(By.id("updateLeadForm_companyName")).clear();
		   
		 driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("infy");
		 
		 driver.findElement(By.name("submitButton")).click();
		   
		 String text=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		 System.out.println(text);
		 
		 driver.close();
	}

}
