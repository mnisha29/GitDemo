import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\selenium webdriver\\chromedriver-win64 (1)\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));	
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		//one way
		a.clickAndHold(from).moveToElement(to).release().build().perform();
		//another way
		a.dragAndDrop(from, to).build().perform();
		
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.cssSelector(".entry-title")).getText());
		
		//to get iframe counts
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		
				
	}

}
