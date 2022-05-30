package week2.day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Find where am supposed to go without clicking me?')]")).getAttribute("href"));
		
		//String url="http://www.leafground.com/pages/error.html";
		
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String title = driver.getTitle();
		String pageTitle="404 Not Found";
		
		if(title.equals(pageTitle)) {
			System.out.println("image is broken");
			
		}
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		driver.navigate().back();
		 
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("numberof links are:"+links.size());
		
		
		
		
	}

}
