import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;


public class Miscelleanous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\selenium webdriver\\chromedriver-win64 (1)\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//delete allcookies
		driver.manage().deleteAllCookies();
		//delete particular cookies
		//driver.manage().deleteCookieNamed(null); 
		
		driver.get("https://google.com");
		//take a screenshot
		
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src,new File("C:\\Users\\L E N O V O\\screenshot.png"));
		 
		 //C:\Users\L E N O V O\NEW Screepshot
		
	}

}
