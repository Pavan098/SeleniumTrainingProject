package Seleniumpack;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FullAutomationform {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		 driver.get("https://formy-project.herokuapp.com/form");
		 
		 //Enter first name
		 WebElement fname = driver.findElement(By.id("first-name"));
		 fname.sendKeys("ron");
		 
		 //enter last name
		 WebElement lname = driver.findElement(By.id("last-name"));
		 lname.sendKeys("cool");
		 
		 //Enter job title
		 WebElement jtitle = driver.findElement(By.id("job-title"));
		 jtitle.sendKeys("Enginner");
		 
		 //Check the Education
		 WebElement radio3 = driver.findElement(By.id("radio-button-3"));
		 radio3.click();
		 
		 //Gender 
		 WebElement check3 = driver.findElement(By.id("checkbox-1"));
		 check3.click();
		 
		 //select years of Experience
		 WebElement selectmenu = driver.findElement(By.id("select-menu"));
		 Select years = new Select(selectmenu);
		 years.selectByValue("2");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		 
		 //Enter the Date in datepicker
		 WebElement datepicker = driver.findElement(By.id("datepicker"));
		 datepicker.sendKeys("06/12/2022");
	     datepicker.sendKeys(Keys.RETURN);
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	     
	     //Click on Submit the Button
	     WebElement submit = driver.findElement(By.xpath("//a[text()='Submit']"));
	     submit.click();
	     
	     
	     WebElement alert = driver.findElement(By.xpath("//div[@role='alert']"));
	    		 
	     String txt = alert.getText();
	     
	     
	     
	     System.out.println(txt);
	     
	     driver.quit();

	}

}
