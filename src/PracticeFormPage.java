import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeFormPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*chrome browser*/
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium webdriver\\chromedriver-win64 (1)\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		//name 
		driver.findElement(By.xpath("//div[@class='form-group'] //input[@name='name']")).sendKeys("Nisha M");
		//email
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("mnisha123@gmail.com");
		//password
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Nisha@123");
		//checkbox
		driver.findElement(By.cssSelector("input#exampleCheck1")).click();
		//gender
		WebElement staticDropDown = driver.findElement(By.cssSelector("select#exampleFormControlSelect1"));
	    Select dropdown = new Select(staticDropDown);
		dropdown.selectByIndex(1);
		//radio
		driver.findElement(By.cssSelector("input#inlineRadio1")).click();
		//date of birth
		driver.findElement(By.name("bday")).sendKeys("29/08/1999");
		// submit btn
		driver.findElement(By.cssSelector(".btn-success")).click();
		//get message
		System.out.println(driver.findElement(By.className("alert")).getText());
		
	}

}
