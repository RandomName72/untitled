package Day_9ThursdayClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class T1_ThursdayClass {
    public static void main(String[] args) {
        //set up chrome options
        ChromeOptions options = new ChromeOptions();
        //declare chrome arguments: start-maximized, incognito
        options.addArguments("start-maximized");
        //set up webdriver
        WebDriver driver = new ChromeDriver(options);
        //navigate to USPS
        driver.navigate().to("https://www.usps.com");
        //define Action command
        Actions mouseAction = new Actions (driver);

        //hover over send tab to  open drop down list
        try {
            WebElement sendTab = driver.findElement(By.xpath("//*[text()='Send']"));
            mouseAction.moveToElement(sendTab).perform();
        }catch (Exception e) {
            System.out.println("Unable to hover over send tab " + e);
        }//end of try catch exception

        //Click on look up a zip code from the drop-down list
        try {
            WebElement zipCodeLookup = driver.findElement(By.xpath("//*[text()='Look Up a ZIP Code']"));
            mouseAction.moveToElement(zipCodeLookup).click().perform();
        }catch (Exception e) {
            System.out.println("Unable to click on look up a zipcode " + e);
        }//end of try catch exception

        //click on find cities by zip
        try {
            WebElement findCity = driver.findElement(By.xpath("//*[text()='Find Cities by ZIP']"));
            mouseAction.moveToElement(findCity).click().perform();
        }catch (Exception e) {
            System.out.println("Unable to click on find cities by zip code " + e);
        }//end of try catch exception

        //enter zipcode
        try {
            WebElement enterZip = driver.findElement(By.xpath("//*[@id='tZip']"));
            mouseAction.moveToElement(enterZip).click().sendKeys("11221").perform();
        }catch (Exception e) {
            System.out.println("Unable to enter zip code " + e);
        }//end of try catch exception





    }//end of main
}//end of class
