package Day6_04222024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T4_XpathContainsFindElements {
    public static void main(String[] args) throws InterruptedException {

        //declare and define chrome options
        ChromeOptions options = new ChromeOptions();
        //add option to start it maximized
        options.addArguments("start-maximized");
        //add option to start it incognito ( can also just add here^)
        options.addArguments("incognito");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        //go to yahoo.com
        driver.navigate().to("https://www.yahoo.com/");
        //click on the finance header (ensure to add .get(1) bc it is the 'second' index)
        driver.findElements(By.xpath("//*[contains(@class , '_yb_jujrfs')]")).get(1).click();
        //wait for 2 seconds
        Thread.sleep(2000);
        //quit the driver
        driver.quit();
    }//end of main
}//end of class