package Day5Thursday_04182024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thursday_WebDriver {
    public static void main(String[] args) throws InterruptedException {
        //set up WebDriver
        //WebDriverManager.chromedriver().setup();
        //define the WebDriver
        WebDriver driver = new ChromeDriver();
        //navigate to UnitedHealthCare website
        driver.navigate().to("https://www.google.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Brooklyn");
        driver.findElement(By.xpath("//*[@name='btnK']")).click();

        String message = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        System.out.println(message);
        //wait time
        Thread.sleep(3000);
        driver.close();


    }//end of main
}//end of class
