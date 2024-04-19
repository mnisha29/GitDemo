import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\selenium webdriver\\chromedriver-win64 (1)\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// (for mouse over)
		driver.get("https://www.browserstack.com/guide/mouse-hover-in-selenium"); 
		// driver.get("https://www.google.com/"); (search box)
		driver.manage().window().maximize();
		
	      WebElement move = driver.findElement(By.id("products-dd-toggle"));
		 //mouse over // contextclick is used for to right click 
		  Actions a = new Actions(driver);
		  a.moveToElement(move).contextClick().build().perform(); 
		
		// search box
		//Actions searchbox = new Actions(driver);
		//searchbox.moveToElement(driver.findElement(By.id("APjFqb"))).click().keyDown(Keys.SHIFT)
		          //.sendKeys("nisha").doubleClick().build().perform();
				
				
				
				
				
		
	}

}
