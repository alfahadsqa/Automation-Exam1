package fahad.com.AutomationExam;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskFour {

	WebDriver driver;

	@Test
	public void TaskFourSolution() throws InterruptedException {

		// webdriver Setup
		String browser = System.setProperty("browser", "chrome");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl = "https://the-internet.herokuapp.com/javascript_alerts";
		driver.get(baseUrl);

		// validating first Js alert
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		Thread.sleep(3000);
		alert1.accept();
		if (driver.getPageSource().contains("You successfully clicked an alert")) {
			System.out.println("You successfully clicked an alert");
		} else {
			System.out.println("it's failed to validate");
		}

		// validating Second JS alert
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		Thread.sleep(3000);
		alert2.dismiss();
		if (driver.getPageSource().contains("You clicked: Cancel")) {
			System.out.println("You clicked: Cancel");
		} else {
			System.out.println("it's failed to validate");
		}

		// validating Third Js alert
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.sendKeys("I'm Fahad");
		Thread.sleep(3000);
		alert3.accept();
		if (driver.getPageSource().contains("You entered: I'm Fahad")) {
			System.out.println("You entered: I'm Fahad");
		} else {
			System.out.println("it's failed to validate");
		}
		driver.quit();
	}
}
