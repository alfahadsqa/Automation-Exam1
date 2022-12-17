package fahad.com.AutomationExam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TaskThree extends BaseDriver {
	@Test	
	public void TaskTwoSolution() throws InterruptedException {
		WebElement checkbox = driver.findElement(By.id("tuesday"));
	    checkbox.click();
	    WebElement checkbox2 = driver.findElement(By.id("friday"));
	    checkbox2.click();
	    Thread.sleep(6000);	
	}
}
