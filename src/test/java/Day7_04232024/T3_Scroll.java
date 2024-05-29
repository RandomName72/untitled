package Day7_04232024;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T3_Scroll {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        //add option to start it maximized
        options.addArguments("start-maximized");
        //add option to start it incognito ( can also just add here^)
        options.addArguments("incognito");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        //go to yahoo.com
        driver.navigate().to("https://www.mlcalc.com/");
        //define the javascriptexecutor
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll down 800 pixels
        jse.executeScript("scroll(0,800)");
        //wait 2 seconds
        Thread.sleep(2000);
        //scroll up 800 pixels
        jse.executeScript("scroll(0,-800)");
        //wait 2 seconds
        Thread.sleep(2000);
        //scroll into the webelement, we need to define calculate button into webelement
        WebElement calcButton = driver.findElement(By.xpath("//*[@value = 'Calculate']"));
        //scroll into view of the calculate button
        jse.executeScript("arguments[0].scrollIntoView(true);",calcButton);
        //wait 4 seconds
        Thread.sleep(4000);
        //quit the browswer
        driver.quit();
    }//end of main
}//end of class
