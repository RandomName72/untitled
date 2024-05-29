package ActionItem7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReusableMethods {

    //create a click method for a new web element
//    public static void clickMethod(WebDriver driver, String xpathValue, String elementName) {
//        //set up explicit wait
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        try {
//            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).click();
//        } catch (Exception e) {
//            System.out.println("Unable to click on " + elementName + " due to the exception " + e);
//
//        }//end of try catch exception
//
//    }//end of click method

    public static String captureText(WebDriver driver, String xpathValue, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String message = "";
        try {
            message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue))).getText();
        }//end of try block
        catch (Exception e) {
            System.out.println("Unable to capture text " + elementName + " due to exception " + e);
        }//end of catch block
        return message;
    }//end of capture text method

    public static WebDriver setupChromeDriver() {
        //declare chrome options
        ChromeOptions options = new ChromeOptions();
        //add chrome options for maximized and incognito
        options.addArguments("start-maximized", "incognito");
        //pass the chrome options to the driver
        WebDriver driver = new ChromeDriver(options);
        return driver;
    }//end of setupDriver method

    public static void submitMethod(WebDriver driver, String xpathValue, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).submit();
        }//end of try block
        catch (Exception e) {
            System.out.println("Unable to submit on " + elementName + " due to exception " + e);
        }//end of catch block
    }//end of submit method

//    public static void sendKeysMethod(WebDriver driver, String xpathValue, String userInput, String elementName) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        try {
//            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).sendKeys(userInput);
//        } catch (Exception e) {
//            System.out.println("Unable to send keys on " + elementName + " due to exception " + e);
//
//        }//end of try catch Exception
//    }//end of sendKeysMethod

    public static void sendKeysMethods(WebDriver driver, String xpathValue, String userInput, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).sendKeys(userInput);
        } catch (Exception e) {
            System.out.println("Unable to send keys on " + elementName + " due to exception " + e);

        }//end of try catch Exception
    }//end of sendKeysMethod)

    public static void switchToTabByIndex(WebDriver driver, String xpathValue, String userInput, String elementName) {

    }

    public static void scrollByPixel(WebDriver driver, String xpathValue, String userInput, String elementName) {

    }

    public static void clickMethod(WebDriver driver, String xpathValue, String elementName) {
        //set up explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on " + elementName + " due to the exception " + e);

        }//end of try catch exception

    }//end of click method) {
}//end of class
