package Day8_04292024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T1_SelectMethod {
    public static void main(String[] args) throws InterruptedException {
        //select start month from the dropdown on mortgagecalculator.org
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgae calculator site
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(3000);
        //enter home value
        driver.findElement(By.xpath("//*[@id='homeval']")).sendKeys("450000");
        //enter down  payment
        driver.findElement(By.xpath("//*[@id='downpayment']")).sendKeys("100000");
        //select a start month from the start month dropdown
        WebElement strMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));
        //call select function to select start month
        Select strMonthDropdown = new Select(strMonth);
        //Select May by visible text
        strMonthDropdown.selectByVisibleText("May");
        //if you wanted to select May by index -->
        //strMonthDropdown.selectByIndex(4);
        //if you wanted to select May by value -->
        //strMonthDropdown.selectByValue(5);


    }//end of main
}//end of class
