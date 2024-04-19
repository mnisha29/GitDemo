import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*chrome browser*/
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium webdriver\\chromedriver-win64 (1)\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
			
			/*edge browser*/
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Edge unzip file\\msedgedriver.exe");
	    //WebDriver driver = new EdgeDriver();
			
		
	    driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		//driver.quit();

	}

}
