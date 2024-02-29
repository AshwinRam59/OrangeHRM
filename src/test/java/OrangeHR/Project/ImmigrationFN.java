package OrangeHR.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class ImmigrationFN extends Login{

    @AfterMethod
    public void immi() {
        // Get the WebDriver instance from the parent class
        WebDriver driver = Login.driver;
        
        // Click on the 'Add Details' button
        WebElement AddImmi = driver.findElement(By.xpath("(//button[@class=\"oxd-button oxd-button--medium oxd-button--text\"])[1]"));
        AddImmi.click();
        System.out.println("Clicked on Add Details");
        
        // Select visa as document
        WebElement Visa = driver.findElement(By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[2]"));
        Visa.click();
        System.out.println("Select visa as document");
        
        // Enter visa number
        WebElement Number = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
        Number.click();
        Number.sendKeys("3451323452244345");
        System.out.println("Number Entered");
        
        // Select issue date
        WebElement select_issue_date = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[1]"));
        select_issue_date.click();
        select_issue_date.sendKeys("2024-20-02");
        System.out.println("Issue Date Selected");
        
        // Select expiry date
        WebElement select_Expiry_date = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]"));
        select_Expiry_date.click();
        select_Expiry_date.sendKeys("2028-20-06");
        System.out.println("Expiry Date Selected");
        
        // Update eligibility status
        WebElement Elegible_Status = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]"));
        Elegible_Status.click();
        Elegible_Status.sendKeys("Eligible");
        System.out.println("Eligibility status updated");
        
        // Click on the dropdown to select issuer
        WebElement Issued_by = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
        Issued_by.click();
        System.out.println("Issuer dropdown clicked");
        
        // Add comments
        WebElement comments = driver.findElement(By.xpath("(//textarea[@placeholder='Type Comments here'])[1]"));
        comments.click();
        comments.sendKeys("Review Details");
        System.out.println("Comment added");

        // Select eligible review date
        WebElement Elegible_Review_date = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[3]"));
        Elegible_Review_date.click();
        Elegible_Review_date.sendKeys("2024-10-02");
        System.out.println("Eligible review date Selected");
        
        // Click on the Save button
        WebElement Save = driver.findElement(By.xpath("//button[@type='submit']"));
        Save.click();
        System.out.println("Details Saved");
    }
}
