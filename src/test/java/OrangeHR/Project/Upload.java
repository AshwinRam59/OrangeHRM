package OrangeHR.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class Upload extends ImmigrationFN{

    @AfterMethod
    public void uploadAttachment() {
        WebDriver driver = Login.driver;

        // Click on the Immigration tab
        WebElement immigrationTab = driver.findElement(By.xpath("(//div[@class=\"orangehrm-tabs-wrapper\"])[5]"));
        immigrationTab.click();
        System.out.println("Clicked on Immigration");

        // Click on the Add Attachments button
        WebElement addAttachmentsButton = driver.findElement(By.xpath("(//button[@class=\"oxd-button oxd-button--medium oxd-button--text\"])[2]"));
        addAttachmentsButton.click();
        System.out.println("Clicked on Add Attachments");

        // Select the file to upload
        WebElement browseButton = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
        browseButton.sendKeys("C:\\Users\\ashwi\\OneDrive\\Pictures\\Screenshots\\Upp.png");

        // Enter comments
        WebElement commentsTextArea = driver.findElement(By.xpath("//textarea[@placeholder='Type comment here']"));
        commentsTextArea.click();
        commentsTextArea.sendKeys("Text File Uploaded");
        System.out.println("Entered comments");

        // Save the attachment
        WebElement saveButton = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
        saveButton.click();
        System.out.println("Attachment is Saved");
    }
}
