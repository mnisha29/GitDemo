 import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*chrome browser*/
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium webdriver\\chromedriver-win64 (1)\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit wait -5
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//id locator
		driver.findElement(By.id("inputUsername")).sendKeys("nisha.com");
		//name locator
		driver.findElement(By.name("inputPassword")).sendKeys("mnisha@123");
		//class locator for cls we can take particly text
		driver.findElement(By.className("submit")).click();
		//css selector locator using classname
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//Link locator
		driver.findElement(By.linkText("Forgot your password?")).click();
		//xpath locator
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Nave");
		//css selector locator
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("nave.com");
		//clear() //xpath locator index
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		//css selector locator
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("yazl.com");
		//xpath parent locator
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543211");
		//css selector using clasname
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//css selector parent locator
		System.out.println(driver.findElement(By.cssSelector("form p")).getText()) ;
		//xpath differnt type parent to chlid 
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		//css selector tagname#id
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahul");
		//css selector regular expression
		driver.findElement(By.cssSelector("input[type *='pass']")).sendKeys("rahulshettyacademy");
		//id locator
		driver.findElement(By.id("chkboxOne")).click();
		//xpath regular expression
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();	
		
		
	}

}
