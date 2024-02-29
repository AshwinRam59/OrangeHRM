package OrangeHR.Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
    public static WebDriver driver;

    @SuppressWarnings("deprecation")
    @Test
    public void logintest() {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashwi\\Downloads\\chromedriver-win64 (1) - Copy\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        // Enter username
        WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
        Username.sendKeys("Admin");
        System.out.println("Username entered");

        // Enter password
        WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
        Password.sendKeys("admin123");
        System.out.println("Password entered");

        // Click on login button
        WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        LoginButton.click();
        System.out.println("Clicked on login");

        // Click on 'Myinfo' menu item
        WebElement myinfo = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
        myinfo.click();
        System.out.println("Clicked on Myinfo");

        // Click on 'Immigration' tab
        WebElement immigration = driver.findElement(By.xpath("(//div[@class=\"orangehrm-tabs-wrapper\"])[5]"));
        immigration.click();
        System.out.println("Clicked on Immigration");
    }
}
