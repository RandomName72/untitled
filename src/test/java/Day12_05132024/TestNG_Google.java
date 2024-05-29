package Day12_05132024;

import Day11_05072024.T1_ReuseableMethods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static Day11_05072024.T1_ReuseableMethods.setupChromeDriver;

public class TestNG_Google {
    WebDriver driver;

    @BeforeSuite
    public void setUpChromeDriver(){
        driver = setupChromeDriver();
    }//end of before suite

    @Test(priority = 1)
    public void searchForACar(){
        //navigate to google home page
        driver.navigate().to("https://www.google.com");
        //search for a car
        T1_ReuseableMethods.sendKeysMethod(driver, "//*[@name = 'q']", "bmw", "Google Search");
        //hit submit
        T1_ReuseableMethods.submitMethod(driver, "//*[@name = 'btnK']", "Submit Button");
    }//end of test case 1

    @Test(priority = 2)
    public void captureSearchResult(){
        // click on the tools button
        T1_ReuseableMethods.clickMethod(driver,"//*[@id = 'hdtb-tls']","Tools Button");
        //store the search result into a string variable
        String searchResult = T1_ReuseableMethods.captureText(driver,"//*[@id = 'result-stats']", "Search Result" );
        //print out the result stats
        System.out.println("Search Result is " + searchResult);
    }//end of test case 2

    @AfterSuite
    public void cleanUpDriver(){
        driver.quit();
    }//end of after suite
}//end of class
