package fahad.com.AutomationExam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskFive {

	WebDriver driver;
	@Test
	public void TaskFiveSolution() throws InterruptedException {

		// webdriver Setup
		String browser = System.setProperty("browser", "firefox");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl = "https://www.daraz.com.bd/";
		driver.get(baseUrl);
		
		//Action Class        
        Actions actions = new Actions(driver);
        
        //WebElement 'Automotive & Motorbike' to perform mouse hover 
    	WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"Level_1_Category_No12\"]/a/span"));
    	//Mouse hover menuOption 'Automotive & Motorbike'
    	actions.moveToElement(menuOption).perform();
    	System.out.println("Select 'Automotive & Motorbike' from Menu");
    	
    	//Select 'Motorcycle Riding Gear' from sub menu 
    	WebElement subMenuOption = driver.findElement(By.xpath("//*[@id=\"J_3442298940\"]/div/ul/ul[12]/li[11]/a/span")); 
    	//Mouse hover menuOption 'Motorcycle Riding Gear'
    	actions.moveToElement(subMenuOption).perform();
    	System.out.println("Select 'Motorcycle Riding Gear' from Menu");
    	
    	//select 'Helmet'
    	WebElement selectMenuOption = driver.findElement(By.xpath("//*[@id=\"J_3442298940\"]/div/ul/ul[12]/li[11]/ul/li[1]/a/span"));
    	selectMenuOption.click();
    	System.out.println("Select 'Helmet' from Menu");
    	Thread.sleep(3000);
    	driver.quit();

	}
}
