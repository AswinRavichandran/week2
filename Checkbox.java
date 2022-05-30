package week2.day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following-sibling::input[1]")).click();
		
		driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']")).isSelected();
		System.out.println("Selenum is selected");
		
		List<WebElement> ele2 = driver.findElements(By.xpath("//label[contains(text(),'DeSelect')]/following-sibling::input"));
		for (int i = 0; i < ele2.size(); i++) {
			 if(ele2.get(i).isSelected()) {
				 String text = ele2.get(i).getText();
				 System.out.println(text);
				 Thread.sleep(2000);
				 ele2.get(i).click();
				 
			 }
			
		}
		List<WebElement> ele = driver.findElements(By.xpath("//label[contains(text(),'checkboxes')]/following-sibling::input"));
		
		for (int i = 0; i < ele.size(); i++) {
			ele.get(i).click();
		}
	}

}
