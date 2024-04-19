import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\L E N O V O\\chrome version\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();

		// click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// capture all the webElement into list
		List<WebElement> elementlist = driver.findElements(By.xpath("//tr/td[1]"));

		// capture text of all webElement into new(original)list
		// List<String> orginallist =
		// elementlist.stream().map(s->s.getText()).collect(Collectors.toList());

		// sort on the original list of step--> sorted list
		// List<String> sortedlist =
		// orginallist.stream().sorted().collect(Collectors.toList());

		// capture original list vs sort list
		// Assert.assertTrue(orginallist.equals(sortedlist));
		    List<String> price;
		// scan the name column with gettext ->rice-> print the beans price
		do {
			List<WebElement> row = driver.findElements(By.xpath("//tr/td[1]"));
			 price = row.stream().filter(s -> s.getText().contains("Rice"))
					.map(s -> getPriceVeggie(s)).collect(Collectors.toList());
			price.forEach(s -> System.out.println(s));
			if (price.size()<1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		} while (price.size() < 1);
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub\
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
	