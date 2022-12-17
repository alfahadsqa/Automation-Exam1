package fahad.com.AutomationExam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {

	WebDriver driver;
	@BeforeSuite
	public void start() {
		
		String browser = System.setProperty("browser" , "chrome");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl = "https://itera-qa.azurewebsites.net/home/automation";
		driver.get(baseUrl);
		
	}
	
//	@AfterSuite
//	public void end() {
//		driver.quit();
//	}
//		
		
}
 