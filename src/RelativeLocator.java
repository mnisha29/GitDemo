import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\L E N O V O\\chrome version\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		//above relative-locator
		WebElement nameedit = driver.findElement(By.cssSelector("input[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameedit)).getText());
	 	
		//below relative-locator
		WebElement dob = driver.findElement(By.cssSelector("label[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dob)).click();
		
		//leftof relative-locator
		WebElement left = driver.findElement(By.cssSelector("label[class='form-check-label']"));
		driver.findElement(with(By.className("form-check-input")).toLeftOf(left)).click();
		
		//rightof relative-locator
		WebElement right = driver.findElement(By.id("inlineRadio1"));
		driver.findElement(with(By.tagName("label")).toRightOf(right)).getText();
		
		
		
	}

}
