package Day8_04292024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T2_ClickDropdown {
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
        driver.findElement(By.xpath("//*[@name='param[start_month]']")).click();
        //click on dropdown value May by using xpath text
        driver.findElement(By.xpath("//*[text()='May']")).click();
        //click outside to see the correct





    }//end of main
}//end of class
