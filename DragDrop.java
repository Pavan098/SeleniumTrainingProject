package Seleniumpack;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class DragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/dragdrop");
		
		WebElement image = driver.findElement(By.xpath("//img[@alt='Selenium logo']"));
		WebElement box = driver.findElement(By.id("box"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(image, box).build().perform();
		
		Assert.isTrue(true, box.getText(),"Dropped!");
		System.out.println(box.getText());
		driver.quit();

	}

}
