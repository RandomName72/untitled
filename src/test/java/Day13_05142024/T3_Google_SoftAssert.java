package Day13_05142024;

import Day11_05072024.T1_ReuseableMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class T3_Google_SoftAssert extends TestParent{

    @Test
    public void tc001_verifiedGoogleTitle(){
        //navigate to google homepage
        driver.navigate().to("https://www.google.com");
        //store the title of google page in a string variable
        String actualTitle = driver.getTitle();
        //store the expected Title
        String expectedTitle = "Google";
        //use soft assert
        SoftAssert softie = new SoftAssert();
        //assert the search results
        softie.assertEquals(actualTitle,expectedTitle);
        softie.assertAll();
    }//end of test case 1

    @Test(priority = 2)
    public void tc002_searchForACar(){
        //navigate to google home page
        driver.navigate().to("https://www.google.com");
        //search for a car
        T1_ReuseableMethods.sendKeysMethod(driver, "//*[@name = 'q']", "bmw", "Google Search");
        //hit submit
        T1_ReuseableMethods.submitMethod(driver, "//*[@name = 'btnK']", "Submit Button");
    }//end of test case 2

    @Test(priority = 3)
    public void tc003_captureSearchResult(){
        // click on the tools button
        T1_ReuseableMethods.clickMethod(driver,"//*[@id = 'hdtb-tls']","Tools Button");
        //store the search result into a string variable
        String actualGoogleSearchResult = T1_ReuseableMethods.captureText(driver,"//*[@id = 'result-stats']", "Search Result" );
        String expectedGoogleSearchResult = "About 1,390,000,000 results (0.51 seconds)";
        //use soft assert
        SoftAssert softie = new SoftAssert();
        //assert the search results
        softie.assertEquals(actualGoogleSearchResult,expectedGoogleSearchResult);
        softie.assertAll();
    }//end of test case 3


}//end of class
