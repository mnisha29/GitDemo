import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*chrome browser*/
		// if we using selenium manager ,then 
		//selenium manager is a beta version, not completely introduced
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium webdriver\\chromedriver-win64 (1)\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();

	}

} 
