package Seleniumpack;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ScrollInView {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");
        Actions act = new Actions(driver);
        
        WebElement fullname = driver.findElement(By.id("name"));
        WebElement date = driver.findElement(By.id("date"));
        act.moveToElement(date);
        
        fullname.sendKeys("Pavan");
        date.sendKeys("06/11/2022");

        driver.quit();
        System.out.println("Sucess");

	}

}
