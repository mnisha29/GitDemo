import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "Rizwan";
		/*chrome browser*/
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium webdriver\\chromedriver-win64 (1)\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*edge browser*/
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Edge unzip file\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//id locator
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		//name locator
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		//class locator
		driver.findElement(By.className("submit")).click();
		Thread.sleep(2000);
		//tagname locator
		//driver.findElement(By.tagName("p")).getText();
		//TestNg
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		//css selector using parent and childtagname
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		//using xpath using text
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		//driver.close();
		driver.quit();
		
		}

	    public static String getPassword(WebDriver driver) throws InterruptedException
	    {
	    	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	    	driver.findElement(By.linkText("Forgot your password?")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	    	//Please use temporary password 'rahulshettyacademy' to Login.
			String passwordText = driver.findElement(By.cssSelector("form p")).getText();
			String[] passwordArray = passwordText.split("'");
			//0th index Please use temporary password
			//1st index 'rahulshettyacademy' to Login.
			// 2 way we can create array 1 is
			//String[] passwordArray2 = passwordArray[1].split("'");
			//String password = passwordArray2[0];
			//0th index 'rahulshettyacademy'
			//1st index  to Login.
			//another way is
			String password = passwordArray[1].split("'")[0];
			return password;			
	    }
}
