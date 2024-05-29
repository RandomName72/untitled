package Day13_05142024;

import ActionItem7.ReusableMethods;
import Day11_05072024.T1_ReuseableMethods;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.lang.reflect.Method;

import static Day11_05072024.T1_ReuseableMethods.setupChromeDriver;

public class TestParent {
    public static WebDriver driver;

    public static ExtentReports reports;

    public static ExtentTest logger;

    //declare a global public webDriver variable
    @BeforeSuite
    public void setUpReports(){
        reports = new ExtentReports("src/main/java/HTML_Report/AutomationReport.html");
    }//end of before suite

    @BeforeClass
    public void setUpDriver(){
        driver = ReusableMethods.setupChromeDriver();
    }//end of before class

    @BeforeMethod
    public void setTestName (Method methodName){
        logger = reports.startTest(methodName.getName());
    }//end of before method

    @AfterMethod
    public void endTest (){
        reports.endTest(logger);
    }//end of before method

    @AfterClass
    public void quitDriver(){
        driver.quit();
    }//end of after class

    @AfterSuite
    public void flushReport(){
        reports.flush();
    }//end of after suite

    public void assertEqualsLoggers(String expectedText, String actualText) {
        try {
            Assert.assertEquals(expectedText, actualText);
            logger.log(LogStatus.PASS, "Expected Text " + expectedText + " Matches " + actualText);
        }
        catch (Exception e){
            logger.log(LogStatus.FAIL, "Expected Text " + expectedText + " Matches " + actualText);
        }
    }//end of assertEqualsLoggers



}//end of class