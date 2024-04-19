import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PraticeWindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\L E N O V O\\\\chrome version\\\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows"); 
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator(); 
		String parent = it.next();
		
		//String child = it.next();
		driver.switchTo().window(it.next());
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
        driver.switchTo().window(parent);
        System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		
	}

}
