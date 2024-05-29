package Day7_04232024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class T2_Webelements {
    public static void main(String[] args) throws InterruptedException {
        //declare and define chrome options
        ChromeOptions options = new ChromeOptions();
        //add option to start it maximized
        options.addArguments("start-maximized");
        //add option to start it incognito ( can also just add here^)
        options.addArguments("incognito");
        //declare webdriver and pass chrome options
        WebDriver driver = new ChromeDriver(options);
        //go to yahoo.com
        driver.navigate().to("https://www.yahoo.com/");
        //)store yahoo headers in an array list of webelements
        ArrayList<WebElement> yahooHeader = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@class , '_yb_jujrfs')]")));
        for (int i = 0; i < yahooHeader.size(); i++){
            System.out.println("Yahoo headers are " + yahooHeader.get(i).getText());
        }//end of for loop
        //click on sports header (should be in index 2 bc its in 3rd position)
        yahooHeader.get(2).click();
        //wait 2 sec
        Thread.sleep(2000);
        //quit the driver
        driver.quit();
    }//end of main
}//end of class
