package Seleniumpack;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;

public class RadioBtn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		 driver.get("https://formy-project.herokuapp.com/radiobutton");

	     WebElement radio1 = driver.findElement(By.id("radio-button-1"));
		 radio1.click();
		 
		 WebElement radio2 = driver.findElement(By.cssSelector("input[value='option2']"));
		 
		 radio2.click();
		 
		 WebElement radio3 = driver.findElement(By.xpath("//input[@value='option3']"));
		 radio3.click();
		 
		 ///Checkbox Automate
		 driver.get("https://formy-project.herokuapp.com/checkbox");
		 WebElement check1 = driver.findElement(By.id("checkbox-1"));
		 check1.click();
		 
		 WebElement check2 = driver.findElement(By.cssSelector("input[id='checkbox-2']"));
		 
		 check2.click();
		 
		 WebElement check3 = driver.findElement(By.id("checkbox-3"));
		 check3.click();
		 Thread.sleep(1000);
		 System.out.println("checked");
		 driver.quit();

	}

}
