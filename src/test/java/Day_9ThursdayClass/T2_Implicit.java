package Day_9ThursdayClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class T2_Implicit {
    public static void main(String[] args) throws InterruptedException {
        //set up chrome options
        ChromeOptions options = new ChromeOptions();
        //declare chrome arguments: start-maximized, incognito
        options.addArguments("start-maximized");
        //set up webdriver
        WebDriver driver = new ChromeDriver(options);
        //declare and define your global implicit wait for all web elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //navigate to ups
        driver.navigate().to("https://www.ups.com");
        //sleep for 10 sec
        Thread.sleep(10000);
        //click on track
        driver.findElement(By.xpath("//*[text()='Tracking']")).click();
        //click on track a package
        driver.findElement(By.xpath("//*[text()='Track a Package']")).click();
        //quit browser
        driver.quit();

    }//end of main
}//end of class
