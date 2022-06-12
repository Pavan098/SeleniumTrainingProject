package Seleniumpack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/fileupload");
		String filepath = "F:\\Learning\\Selenium Essential Training\\Ex_Files_Selenium_EssT\\Exercise Files\\04_05\\start\\test\\file-to-upload.png";
		
		
		
		WebElement choose = driver.findElement(By.id("file-upload-field"));
		
		choose.sendKeys(filepath);
		
		//	System.out.println(choose.getText());
		Thread.sleep(1000);
		WebElement reset = driver.findElement(By.xpath("//button[text()='Reset']"));
		reset.click();
		 driver.quit();

	}

}
