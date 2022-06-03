package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		
		//To go home page
		driver.findElement(By.xpath("//button[@id='home']")).click();
		
		//To navigate back
		driver.navigate().back();
		
		//To find location of button
		System.out.println(driver.findElement(By.xpath("(//button[@id='home']//following::button)[1]")).getLocation());
		
		//To find color of button
		System.out.println(driver.findElement(By.xpath("(//button[@id='home']//following::button)[2]")).getCssValue("background-color"));
		
		//To find size of button
		System.out.println(driver.findElement(By.xpath("(//button[@id='home']//following::button)[3]")).getSize());
//		
		driver.close();
	}

}
