import java.util.HashMap;

import java.util.Map;
import java.time.Duration;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SslCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\selenium webdriver\\chromedriver-win64 (1)\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		// this proxy
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
        option.setCapability("proxy", proxy);
		
        //hashmap
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", "/directory/path");
        option.setExperimentalOption("prefs", prefs);
        
	    // this setAcceptInsecureCerts for ssl certification
		//option.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com");
		System.out.println(driver.getTitle());

	}

}
