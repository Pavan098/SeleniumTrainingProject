package Seleniumpack;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class DatePicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/datepicker");

	     WebElement datepicker = driver.findElement(By.id("datepicker"));
	     
	     datepicker.sendKeys("06/12/2022");
	     datepicker.sendKeys(Keys.RETURN);
	     System.out.println("date entered");
		 driver.quit();
	}

}
