import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.apache.commons.io.FileUtils;

public class e2e {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		/*chrome browser*/
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium webdriver\\chromedriver-win64 (1)\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		//from- click
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//from
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//TO - parent child relationship xpath
	    driver.findElement(By.xpath("//div[@id = 'glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value = 'MAA']")).click();
		//depart date
	    driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	    //return date
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("it is disabled");
			Assert.assertTrue(true);
		}
		else
		{
            Assert.assertTrue(false);
		}
		//checkbox
		driver.findElement(By.cssSelector("input[id *='friendsandfamily']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id *='friendsandfamily']")).isSelected());
	    //dropdown
  		driver.findElement(By.id("divpaxinfo")).click();
  		Thread.sleep(3000);
  		//for loop
  		for(int i =1; i<5; i++)
  		{
  			driver.findElement(By.id("hrefIncAdt")).click();
  		}
  		//child
  		driver.findElement(By.xpath("//div[@class='ad-row-right'] /span[@id='hrefIncChd']")).click();
  		//done button
  		driver.findElement(By.id("btnclosepaxoption")).click();
  		//Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
  		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
  		//static dropdown
        WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropDown);
		// selecting by index
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		//search button
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src,new File("//C:\\Users\\L E N O V O\\NEW Screepshot\\screenshot.png"));
	}

}
