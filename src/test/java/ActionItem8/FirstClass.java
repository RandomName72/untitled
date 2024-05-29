//package ActionItem8;
//
//import Day13_05142024.TestParent;
//import Day14_05202024.ReusableMethods_Loggers;
//import com.relevantcodes.extentreports.LogStatus;
//import org.testng.annotations.Test;
//
//public class FirstClass extends TestParent {
//
//    //navigate to Find Care tab, enter information, and search
//    @Test (priority = 1)
//    public void FindCare(){
//        driver.navigate().to("https://www.emblemhealth.com/");
//        //click on Find A Doctor Tab
//        ReusableMethods_Loggers.clickMethod(driver,logger,"*[text()='Find a Doctor']","FindDoc");
//        //click on Find Care Tab
//        ReusableMethods_Loggers.clickMethod(driver,logger,"","");
//        //switch tabs
//        //enter zipcode
//        ReusableMethods_Loggers.sendKeysMethod(driver,logger,"","","");
//        //enter last name
//        ReusableMethods_Loggers.sendKeysMethod(driver,logger,"","","");
//        //enter first name
//        ReusableMethods_Loggers.sendKeysMethod(driver,logger,"","","");
//        //click search button
//        ReusableMethods_Loggers.clickMethod(driver,logger,"","");
//        //capture the search results
//    }//end of test
//
//    //navigate to Find Care tab, specialize in vision, and enter information
//    @Test (dependsOnMethods = "FindCare")
//    public void FindVision(){
//        driver.navigate().to("https://www.emblemhealth.com/");
//        //click on Find A Doctor Tab
//        ReusableMethods_Loggers.clickMethod(driver,logger,"","");
//        //click on Find Care Tab
//        ReusableMethods_Loggers.clickMethod(driver,logger,"","");
//        //switch tabs
//
//        //click on vision
//        ReusableMethods_Loggers.clickMethod(driver,logger,"","");
//        //click continue
//        ReusableMethods_Loggers.clickMethod(driver,logger,"","");
//        //enter zipcode
//        ReusableMethods_Loggers.sendKeysMethod(driver,logger,"","","");
//        //click on search by zip
//        ReusableMethods_Loggers.clickMethod(driver,logger,"","");
//    }//end of Test 2
//
//    //navigate to Find Care tab, select pharmacy, and arrive at pharmacy locator and cost calculator
//    @Test (dependsOnMethods = "FindVision")
//    public void FindPharmacy(){
//        driver.navigate().to("https://www.emblemhealth.com/");
//        //click on Find A Doctor Tab
//        ReusableMethods_Loggers.clickMethod(driver,logger,"","");
//        //click on Find Care Tab
//        ReusableMethods_Loggers.clickMethod(driver,logger,"","");
//        //switch tabs
//
//        //click on pharmacy tab
//        ReusableMethods_Loggers.clickMethod(driver,logger,"","");
//        //click on Medicare Advantage and Prescription Drug Plans pharmacies
//        ReusableMethods_Loggers.clickMethod(driver,logger,"","");
//        //click on 2024 Rx Cost Calculator and Pharmacy Locator
//        ReusableMethods_Loggers.clickMethod(driver,logger,"","");
//        //click continue
//        ReusableMethods_Loggers.clickMethod(driver,logger,"","");
//
//    }
//
//
//}//end of class

