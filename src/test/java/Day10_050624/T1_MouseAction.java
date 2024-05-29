package Day10_050624;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class T1_MouseAction {
    public static void main(String[] args) {
        //set up chrome options
        ChromeOptions options = new ChromeOptions();
        //declare chrome arguments: start-maximized, incognito
        options.addArguments("start-maximized, incognito");
        //set up webdriver
        WebDriver driver = new ChromeDriver(options);
        //navigate to USPS
        driver.navigate().to("https://www.usps.com");
        //set up Action
        Actions mouseAction = new Actions(driver);

    }//end of main
}//end of class
