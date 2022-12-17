package fahad.com.AutomationExam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TaskTwo extends BaseDriver {
	@Test
	public void TaskTwoSolution() throws InterruptedException {
	

	WebElement dropdown = driver.findElement(By.className("custom-select"));
	Select select = new Select(dropdown);
	select.selectByVisibleText("Norway");  
	
	Thread.sleep(6000);	
	}
}
