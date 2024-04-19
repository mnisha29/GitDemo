import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//testNg is one of the testing framework which we will use when we are building automation framework using selenium


public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*chrome browser*/
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium webdriver\\chromedriver-win64 (1)\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		//checkbox
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id *='friendsandfamily']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id *='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id *='friendsandfamily']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id *='friendsandfamily']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id *='friendsandfamily']")).isSelected());
		
		//count of checkbox
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		//dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		
		//while loop
		/* int i = 1;
		 while (i<5){
			driver.findElement(By.id("hrefIncAdt")).click(); //4times
			i++;
		 }
		 */
		//for loop
		for(int i =1; i<5; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		//child
		driver.findElement(By.xpath("//div[@class='ad-row-right'] /span[@id='hrefIncChd']")).click();
		//driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
		
		//done button
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			
	}
}
