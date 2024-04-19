import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\selenium webdriver\\chromedriver-win64 (1)\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//1.Give me the count of links on the page.
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2. Get me the count of links present in the footer section
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); //limiting webdriver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3. Get me the link of footer 1st column
		
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//4. Click on each link in the column and check if pages are opening
	    for(int i=1; i<columndriver.findElements(By.tagName("a")).size(); i++) 
	    {
	    	String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	
	    	columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
	    	Thread.sleep(5000l);
	    }
	    Set<String> abc = driver.getWindowHandles();
    	Iterator<String> it = abc.iterator();
    	while(it.hasNext()) {
    		driver.switchTo().window(it.next());
    		System.out.println(driver.getTitle());
    	}
	}

}
