package Seleniumpack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class AutoComplete {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement address = driver.findElement(By.id("autocomplete"));
        
        address.sendKeys("A-16");
         //cannot automate this as autocomplete values are not coming up due to location isse
        
        
        driver.quit();

	}

}
