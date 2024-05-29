package ActionItem3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_ActionItem {
    public static void main(String[] args) throws InterruptedException {
        //set up and define WebDriver
        WebDriver driver = new ChromeDriver();
        //navigate to Bing website
        driver.navigate().to("https://www.bing.com/");
        //maximize page
        driver.manage().window().maximize();
        //type "soccer" in Bing search bar
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("soccer");
        //search "soccer" in Bing search bar
        driver.findElement(By.xpath("//*[@id='search_icon']")).submit();
        //wait three seconds
        Thread.sleep(3000);
        //store search result into string variable
        String searchResult = driver.findElement((By.xpath("//*[@class='sb_count'"))).getText();
        //create a split
        String[] stringCut = searchResult.split(" ");
        //print out message
        System.out.println("Search number for soccer is " + stringCut[1]);
    }//end of main
}//end of class
