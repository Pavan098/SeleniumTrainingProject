package Seleniumpack;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class SwitchtoWindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement tabbtn = driver.findElement(By.id("new-tab-button"));
        
        tabbtn.click();
        String originalwindow = driver.getWindowHandle().toString();   
        
        for(String handle1 : driver.getWindowHandles())
        {
        driver.switchTo().window(handle1);
        }
        
        driver.switchTo().defaultContent();
        
        driver.switchTo().window(originalwindow);
        driver.quit();
        System.out.println("Sucess");
    }

	}


