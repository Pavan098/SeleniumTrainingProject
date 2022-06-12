package Seleniumpack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/dropdown");
		
		WebElement dropdown = driver.findElement(By.id("dropdownMenuButton"));
		
		dropdown.click();
		
		WebElement autoiddrop = driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Checkbox']"));
		autoiddrop.click();
		
		System.out.println("dropdown item selected");
		 driver.quit();
	}

}
