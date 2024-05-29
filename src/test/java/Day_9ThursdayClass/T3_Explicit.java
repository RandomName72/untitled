package Day_9ThursdayClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T3_Explicit {
    public static void main(String[] args) {
        //set up chrome options
        ChromeOptions options = new ChromeOptions();
        //declare chrome arguments: start-maximized, incognito
        options.addArguments("start-maximized");
        //set up webdriver
        WebDriver driver = new ChromeDriver(options);

        //navigate to UPS
        driver.navigate().to("https://www.ups.com");
        //declare explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //click on tracking
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Tracking']"))).click();
        }catch (Exception e) {
            System.out.print("Unable to click on tracking " + e);
        }//end of try catch exception

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Track a Package']"))).click();
        }catch (Exception e ) {
            System.out.println("Unable to click on track a package " + e);
        }

        driver.quit();

    }//end of main
}//end of class
