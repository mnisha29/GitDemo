import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PracticeCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*chrome browser*/
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium webdriver\\chromedriver-win64 (1)\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Check the first  Checkbox and verify if it is successfully checked
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		//Uncheck it again to verify if it is successfully Unchecked
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		//How to get the Count of number of check boxes present in the page
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
	}

}
