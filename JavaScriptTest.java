package Seleniumpack;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class JavaScriptTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	    driver.get("https://formy-project.herokuapp.com/modal");

	    WebElement openmodal = driver.findElement(By.id("modal-button"));
	    
	    openmodal.click();
	    
	    WebElement close = driver.findElement(By.id("close-button"));
	    WebElement ok = driver.findElement(By.id("ok-button"));
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    js.executeScript("arguments[0].click()",close);
	    
	    js.executeScript("arguments[0].click()",ok);
	    
	    driver.quit();
        System.out.println("Sucess");
	}

}
