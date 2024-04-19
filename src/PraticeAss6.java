import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PraticeAss6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\selenium webdriver\\chromedriver-win64 (1)\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]/input")).click();
		 
		String checkboxvalue=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]")).getText();
		System.out.println(checkboxvalue);
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select s = new Select(dropdown);
		s.selectByVisibleText(checkboxvalue);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(checkboxvalue);
		driver.findElement(By.id("alertbtn")).click();
		
		String alerttext = driver.switchTo().alert().getText();
		if(alerttext.contains(checkboxvalue))
		{
			System.out.println("Alert message right");
		}
		else
		{
			System.out.println("Alert message worng");
		}
	
		
		
	}
	

}
