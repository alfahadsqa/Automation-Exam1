package fahad.com.AutomationExam;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TaskOne extends BaseDriver {
		@Test
		public void TaskOneSolution() throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys("MD. Abdullah AL Fahad");
		driver.findElement(By.id("phone")).sendKeys("01863228875");
		driver.findElement(By.id("email")).sendKeys("alfahad757@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Cmt.2013");
		driver.findElement(By.id("address")).sendKeys("Flat no#6B, House#04, Road#3/A, Mohammodia Housing Limited, Mohammadpur , Dhaka.");
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(6000);
		}
}
