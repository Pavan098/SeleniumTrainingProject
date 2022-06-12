package Seleniumpack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Timeouts;
//import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import java.time.Duration;


public class SeleniumAuto {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/keypress");
		
		//enter the full name
		WebElement name = driver.findElement(By.id("name"));
		name.click();
		name.sendKeys("Ron Cool");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		WebElement button = driver.findElement(By.id("button"));
		button.click();

        driver.quit();
	}

}
