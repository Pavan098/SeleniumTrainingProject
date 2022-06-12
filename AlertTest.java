package Seleniumpack;

import org.openqa.selenium.chrome.ChromeDriver;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertbtn = driver.findElement(By.id("alert-button"));
        
        alertbtn.click();
        Alert alert = driver.switchTo().alert();
        
        String alertext = driver.switchTo().alert().getText();
        Assert.isTrue(true, alertext,"This is a test alert!");
        System.out.println(alertext);
        alert.dismiss();
        alertbtn.click();
        
        alert.accept();
        driver.quit();
        System.out.println("Sucess");

	}

}
