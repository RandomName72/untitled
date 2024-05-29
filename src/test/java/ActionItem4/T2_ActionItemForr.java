package ActionItem4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class T2_ActionItemForr {
    public static void main(String[] args) throws InterruptedException {
        //declare and define chrome options
        ChromeOptions options = new ChromeOptions();
        //add option to start it maximized
        options.addArguments("start-maximized");
        //add option to start it incognito ( can also just add here^)
        options.addArguments("incognito");
        //declare webdriver and pass chrome options
        WebDriver drivers = new ChromeDriver(options);
        //declare arraylist
        ArrayList<String> zipCode = new ArrayList<>();
        //add values to ArrayList
        zipCode.add("27513");//index 0
        zipCode.add("27601");//index 1
        zipCode.add("27605");//index 2
        //create for loop
        for (int i = 0; i < zipCode.size(); i++) {
            //go to weight watchers site
            drivers.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");
            //wait 3 seconds
            Thread.sleep(3000);
            //click on find a workshop
            WebElement findShop = drivers.findElement(By.xpath("//*[@class = 'button-0XZcQ menuItemLink-CDLir menuItem-t5omZ noStyle-mN5oQ large-IxRQp']"));
            findShop.click();
            //click on in person
            WebElement inPerson = drivers.findElement(By.xpath("//*[@class = 'buttonWrapper-XwbdD selected-A_tMr']"));
            inPerson.click();
            //wait 2 sec
            Thread.sleep(2000);
            //clear field
            inPerson.clear();
            //Enter zipcode
            WebElement searchBar = drivers.findElement(By.xpath("//*[@id='location-search'"));
            //click search arrow
            WebElement searchArrow = drivers.findElement(By.xpath("//*[@id='location-search-cta'"));
            searchArrow.click();
            //wait 3 seconds
            Thread.sleep(3000);
            //click on specific studio link
            ArrayList<WebElement> studioResults = new ArrayList<>(drivers.findElements(By.xpath("//*[contains(@class , 'linkUnderline']")));
            // add for loop for studioResults
            if (i==0) {
                studioResults.get(1).click();
            }else if (i==1) {
                studioResults.get(2).click();
            }else if (i==2) {
                studioResults.get(3).click();
            }//end of if else conditions
            //wait 3 seconds
            Thread.sleep(3000);
            //store address
            String address = drivers.findElement(By.xpath("//*[@class='address-FnT8k']")).getText();
            //print the address
            System.out.println("Address " + address);
            //set JSE JavascriptExecutor
            JavascriptExecutor JSE = (JavascriptExecutor) drivers;
            //define workshop web element
            WebElement workshop = drivers.findElement(By.xpath("//*[@class='title-UbUc9']"));
            //scroll until workshop is in view
            JSE.executeScript("arguments[0].scrollIntoView(true);", workshop);
            //capture schedule into String
            String schedule = drivers.findElement(By.xpath("//*[@class='scheduleContainerMobile-ps6Rm']")).getText();
            //print
            System.out.println("Schedule: " + schedule);
        }//end of for loop
        drivers.quit();
    }//end of main

}//end of class
