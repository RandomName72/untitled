package Day11_05072024;

import Day13_05142024.TestParent;
import Day5_04162024.T1_GoogleSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Day11_05072024.T1_ReuseableMethods.setupChromeDriver;

public class T2_GoogleReusable extends TestParent {
    //this is a reusable version of day 5 T1
    public static void main(String[] args) throws InterruptedException {

            //define the webdriver variable and set up the chrome driver
            WebDriver driver = setupChromeDriver();
            //go to google.com
            driver.navigate().to("https://www.google.com");
            //send keys from reusable methods
            T1_ReuseableMethods.sendKeysMethod(driver, "//*[@name = 'q']", "bmw", "Google Search");
            //submit using reusable methods
            T1_ReuseableMethods.submitMethod(driver, "//*[@name = 'btnK']" ,"Submit Button");
            // click on the tools button
            T1_ReuseableMethods.clickMethod(driver,"//*[@id = 'hdtb-tls']","Tools Button");
            //store the search result into a string variable
            String searchResult = T1_ReuseableMethods.captureText(driver,"//*[@id = 'result-stats']", "Search Result" );
            //print out the result stats
            System.out.println("Search Result is " + searchResult);
            //quit the chrome browser
            driver.quit();
        }//end of main

    }//end of class
