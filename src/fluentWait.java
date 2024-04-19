import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\selenium webdriver\\chromedriver-win64 (1)\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().window().maximize();
		
		//start button
		driver.findElement(By.cssSelector("div[id='start'] button")).click();
		//driver.findElement(By.cssSelector("div[id='finish'] h4"));
		//driver.findElement(By.linkText("Elemental Selenium")).click();
		
		//fluent wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		WebElement foo = wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				if( driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed())
				{
					return driver.findElement(By.cssSelector("div[id='finish'] h4"));
				}
				else {
					return null;
				}
			}
		});
		//explicit wait
		/*WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));
		waits.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='finish'] h4")));
		*/
		
		System.out.println(driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed());
	}

}
