package Day13_05142024;

import Day11_05072024.T1_ReuseableMethods;
import org.testng.annotations.Test;

import static Day13_05142024.TestParent.driver;

public class T1_Google_Inheritance {

    @Test(priority = 1)
    public void tc001_searchForACar() {
        //navigate to google home page
        driver.navigate().to("https://www.google.com");
        //search for a car
        T1_ReuseableMethods.sendKeysMethod(driver, "//*[@name = 'q']", "bmw", "Google Search");
        //hit submit
        T1_ReuseableMethods.submitMethod(driver, "//*[@name = 'btnK']", "Submit Button");
    }//end of test case 1

    @Test(dependsOnMethods = "tc001_searchForACar")
    public void tc002_captureSearchResult() {
        // click on the tools button
        T1_ReuseableMethods.clickMethod(driver, "//*[@id = 'hdtb-tls']", "Tools Button");
        //store the search result into a string variable
        String searchResult = T1_ReuseableMethods.captureText(driver, "//*[@id = 'result-stats']", "Search Result");
        //print out the result stats
        System.out.println("Search Result is " + searchResult);
    }//end of test case 2

}
