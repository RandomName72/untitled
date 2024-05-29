package Day9_04302024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class InClassActionItem {
    public static void main(String[] args) throws InterruptedException {
        //In class Action Item, but WITHOUT the arraylists
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        //navigate to statefarm site
        driver.navigate().to("https://www.statefarm.com/");
        Thread.sleep(3000);

        //click on Get a Quote
        try {
            WebElement gQuote = driver.findElement(By.xpath("//*[text()='Get a Quote']"));
            gQuote.click();
        }catch (Exception e) {
            System.out.println("Unable to click on Get a Quote");
        }

        try {
            WebElement strQuote = driver.findElement(By.xpath("//*[@id='product-select1']"));
            Select strQuoteDropdown = new Select(strQuote);
            strQuoteDropdown.selectByVisibleText("Homeowners");
            //Select Homeowners
        }catch (Exception e) {
            System.out.println("Unable to click Homeowners on drop down");
        }

        try {
            WebElement strQuote = driver.findElement(By.xpath("//*[@id='product-select1']"));
            Select strQuoteDropdown = new Select(strQuote);
            strQuoteDropdown.selectByVisibleText("Homeowners");
            //Select Homeowners
        }catch (Exception e) {
            System.out.println("Unable to click Homeowners on drop down");
        }

        //click on start a quote
        try {
            driver.findElement(By.xpath("//*[@id='quote-submit-button1']")).click();
        }catch (Exception e) {
            System.out.println("Unable to click on Start a Quote");
        }

        //
        try {
            WebElement gQuote = driver.findElement(By.xpath("//*[@aria-label='Get a Quote']"));
            gQuote.click();
        }catch (Exception e) {
            System.out.println("Unable to click on Get a Quote");
        }


    }
}
