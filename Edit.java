package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		
		//to enter mail id
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("raviaswin2406@gmail.com");
		
		//to append
	    WebElement element = driver.findElement(By.xpath("//input[@id='email']//following::input"));
	    element.sendKeys(Keys.HOME+"Aswin ");
	    
	    //to get default text entered
	    System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
	    
	    //to clear
	    driver.findElement(By.xpath("(//input[@id='email']//following::input)[3]")).clear();
	    
	    //disable or not
	    System.out.println(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")).isEnabled());
	    
	    driver.close();
		
	}

}
