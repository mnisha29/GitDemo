import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeExcplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\selenium webdriver\\chromedriver-win64 (1)\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		// username
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("rahulshettyacademy");
		// pwd
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("learning");
		// radio
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		// click okay
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();

		// select dropdown
		WebElement staticDropDown = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select dropdown = new Select(staticDropDown);
		dropdown.selectByIndex(2);
		// checkbox
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		// signin btn
		driver.findElement(By.id("signInBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".card-footer .btn-info")));
		// add to cart
		List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
		for (int i = 0; i < products.size(); i++) {
			products.get(i).click();
		}
		// checkout click
		driver.findElement(By.partialLinkText("Checkout")).click();
	}

}
