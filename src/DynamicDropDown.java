 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*chrome browser*/
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium webdriver\\chromedriver-win64 (1)\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		//parent child relationship xpath
	    driver.findElement(By.xpath("//div[@id = 'glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value = 'MAA']")).click();
		 
	    //depart date
	    driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	    
	    //radio button
	    //System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		/*if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("it is enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}*/

	}

}
