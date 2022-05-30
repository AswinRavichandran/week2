package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createcontact {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
	driver.findElement(By.id("firstNameField")).sendKeys("Aswin");
	driver.findElement(By.id("lastNameField")).sendKeys("Ravichandran");
	driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Aswin");
	driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("R");
	driver.findElement(By.id("createContactForm_departmentName")).sendKeys("selenium automation");
	driver.findElement(By.id("createContactForm_description")).sendKeys("Welcome everyonr!!");
	driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("raviaswin2406@gmail.com");
	WebElement state= driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	Select dd1=new Select(state);
	dd1.selectByVisibleText("New York");
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.className("subMenuButton")).click();
	driver.findElement(By.id("updateContactForm_description")).clear();
	driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Read all instructions carefully");
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	String title = driver.getTitle();
	System.out.println(title);
	
}

}
