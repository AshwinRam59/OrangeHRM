package OrangeHR.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class JobDetails extends Login{
	
	@AfterMethod
	public void jobs() {
		// Get the WebDriver instance from the parent class
		WebDriver driver = Login.driver;
		
		// Click on the 'Job' link
		WebElement jobDetails = driver.findElement(By.xpath("//a[normalize-space()='Job']"));
		jobDetails.click();
		System.out.println("Clicked on Job");
		
		// Click on the slider to show Contract Details
		WebElement slider = driver.findElement(By.xpath("//div[@class='oxd-switch-wrapper']"));
		slider.click();
		System.out.println("Clicked on button now its showing Contract Details");
	}
}
