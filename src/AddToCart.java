
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\L E N O V O\\\\chrome version\\\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		// implicitlyWait
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// explicitwait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));

		// array
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Carrot" };
		Thread.sleep(3000);
		addItems(driver, itemsNeeded);
		// click cart
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		// proceed to checkout
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		// explicitwait		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		// promoCode 
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		// apply btn
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		// explicitwait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formatedName = name[0].trim();
			// convert array into arraylist for each search
			// check whether name you extracted is present in arraylist or not
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formatedName)) {
				j++;
				// click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length)
					break;
			}

		}
	}

}