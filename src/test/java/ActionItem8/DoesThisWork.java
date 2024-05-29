package ActionItem8;

import Day13_05142024.TestParent;
import Day14_05202024.ReusableMethods_Loggers;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DoesThisWork extends TestParent {
    //navigate to Find Care tab, enter information, and search
    @Test(priority = 1)
    public void FindCare() throws InterruptedException {
        //navigate to EmblemHealth site
        driver.navigate().to("https://www.emblemhealth.com/");
        Thread.sleep(2000);
        //click on Find A Doctor Tab
        driver.findElements(By.xpath("//*[contains(@class , 'cmp-navigation__item-link mega-menu-nav-primary no')]")).get(6).click();
        Thread.sleep(2000);
        //click on Find Care Tab
        driver.findElements(By.xpath("//*[contains(@class , 'h3 mt-1 mega-menu-nav-secondar')]")).get(28).click();
        //switch tabs

        //enter zipcode
        ReusableMethods_Loggers.clickMethod(driver,logger,"[@class='vlocity-input nds-input nds-input_mask providerZipCode']","clickCode");
        ReusableMethods_Loggers.sendKeysMethod(driver,logger,"//*[@class='vlocity-input nds-input nds-input_mask providerZipCode']","10002","zipCode");
        Thread.sleep(2000);
        //enter last name
        ReusableMethods_Loggers.sendKeysMethod(driver,logger,"","","");
        //enter first name
        ReusableMethods_Loggers.sendKeysMethod(driver,logger,"","","");
        //click search button
        ReusableMethods_Loggers.clickMethod(driver,logger,"","");
        //capture the search results

    }//end of test
}
