package Day9_04302024;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class T3_InClassActionItem2 {
    public static void main(String[] args) throws InterruptedException {
        //Automate Statefarm website
        //Declare and define Chrome options & webdriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        //create array list for zipcodes
        ArrayList<String> zipCode = new ArrayList<>();
        //add 2 zipcodes
        zipCode.add("10011");
        zipCode.add("10003");
        //create array list for policyStart
        ArrayList<String> policyStart = new ArrayList<>();
        policyStart.add("5/05/2024");
        policyStart.add("6/01/2024");
        //create array list for first name
        ArrayList<String> firstName = new ArrayList<>();
        firstName.add("Akashdeep");
        firstName.add("Bobby");
        //create array list for last name
        ArrayList<String> lastName = new ArrayList<>();
        lastName.add("Chahal");
        lastName.add("Shmurda");
        //create array list for street name
        ArrayList<String> streetAdd = new ArrayList<>();
        streetAdd.add("47 W 13th St");
        streetAdd.add("820 Cooper Square");
        //create array list for date of birth
        ArrayList<String> dob = new ArrayList<>();
        //
        dob.add("04/02/2002");
        dob.add("02/02/1994");
        //create array list for co first name
        ArrayList<String> coFirstName = new ArrayList<>();
        coFirstName.add("Akash");
        coFirstName.add("Bob");
        //create array list for co last name
        ArrayList<String> coLastName = new ArrayList<>();
        coLastName.add("Ch");
        coLastName.add("Sh");


        //set up for loop to iterate through
        for (int i = 0; i < 2; i++) {
            //navigate to statefarm site
            driver.navigate().to("https://www.statefarm.com/");
            Thread.sleep(3000);

            //wait 10 seconds for better performance
            Thread.sleep(10000);
            //click on Get a Quote
            try {
                WebElement gQuote = driver.findElement(By.xpath("//*[text()='Get a Quote']"));
                gQuote.click();
            } catch (Exception e) {
                System.out.println("Unable to click on Get a Quote" + e);
            }//end of Get a Quote

            //select drop down as homeowners
            try {
                WebElement strQuote = driver.findElement(By.xpath("//*[@id='product-select1']"));
                Select strQuoteDropdown = new Select(strQuote);
                strQuoteDropdown.selectByVisibleText("Homeowners");
                //Select Homeowners
            } catch (Exception e) {
                System.out.println("Unable to click Homeowners on drop down" + e);
            }//end of drop down homeowners

            //click on and enter zipcode
            try {
                WebElement zipType = driver.findElement(By.xpath("//*[@class='-oneX-textfield__input']"));
                zipType.click();
                zipType.sendKeys(zipCode.get(i));
            } catch (Exception e) {
                System.out.println("Unable to click on and type zipcode" + e);
            }//end of zipcode

            //click on start a quote
            try {
                WebElement aQuote = driver.findElement(By.xpath("//*[@id='quote-submit-button1']"));
                aQuote.click();
                aQuote.sendKeys(policyStart.get(i));
            } catch (Exception e) {
                System.out.println("Unable to click on Start a Quote" + e);
            }//end of start a quote

            //Enter Policy Date
            try {
                WebElement gQuote = driver.findElement(By.xpath("//*[@id='effectiveDate']"));
                gQuote.click();
                gQuote.sendKeys(policyStart.get(i));
            } catch (Exception e) {
                System.out.println("Unable to click on and enter policy date" + e);
            }
            Thread.sleep(2000);

            //enter first name
            try {
                driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys(firstName.get(i));
            } catch (Exception e) {
                System.out.println("unable to enter first name" + e);
            }//end of entering first name

            Thread.sleep(2000);

            //enter last name
            try {
                driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys(lastName.get(i));
            } catch (Exception e) {
                System.out.println("unable to enter last name" + e);
            }//end of entering last name

            Thread.sleep(2000);

            //enter street address
            try {
                driver.findElement(By.xpath("//*[@id='street']")).sendKeys(streetAdd.get(i));
            } catch (Exception e) {
                System.out.println("unable to enter street address" + e);
            }//end of street address

            Thread.sleep(2000);

            //enter date of birth
            try {
                driver.findElement(By.xpath("//*[@id='dateOfBirth']")).sendKeys(dob.get(i));
            } catch (Exception e) {
                System.out.println("unable to enter Date of Birth" + e);
            }//end of dob


            Thread.sleep(2000);
            //define javascript executor
            JavascriptExecutor jse = (JavascriptExecutor) driver;

            //define continue button
            try {
                WebElement continueButton = driver.findElement(By.xpath("//*[@name = 'continue']"));

                //scroll into view of the continue button and click
                jse.executeScript("arguments[0].scrollIntoView(true);", continueButton);
                Thread.sleep(2000);
                continueButton.click();
            } catch (Exception e) {
                System.out.println("unable to click continue" + e);
            }//end of try and catch continue

            Thread.sleep(2000);

            //define continue button as web element and click continue again
            try {
                WebElement contButton = driver.findElement(By.xpath("//*[@name = 'continue']"));
                contButton.click();
            } catch (Exception e) {
                System.out.println("Unable to click continue" + e);
            }//end of try catch continue

            //select value for fire protection
            try{
                WebElement fireProtect = driver.findElement(By.xpath("//*[@id = 'fireProtectionAreaNameSelectId']"));
                Select fireProtectionDropDown = new Select(fireProtect);
                fireProtectionDropDown.selectByIndex(1);
            } catch (Exception e) {
                System.out.println("Unable to select Fire Protection from dropdown " + e);
            }//end of fire protection

            Thread.sleep(2000);

            //define and click continue again
            try {
                WebElement contButton = driver.findElement(By.xpath("//*[@name = 'continue']"));
                contButton.click();
            } catch (Exception e) {
                System.out.println("Unable to click continue" + e);
            }//end of continue button

            //capture Personal Info Message
            try {
                String pMessage = driver.findElement(By.xpath("//*[@class='sfx-pageDescription']")).getText();
                System.out.println("Personal message is " + pMessage);
            }catch (Exception e) {
                System.out.println("unable to capture personal message " + e);
            }//end of personal message

            Thread.sleep(2000);

            //capture Email Info
            try {
                String emailInfo = driver.findElement(By.xpath("//*[@class='help-block']")).getText();
                System.out.println("Email info message is " + emailInfo);
            }catch (Exception e) {
                System.out.println("Unable to capture email info message " + e);
            }//end of email message

            Thread.sleep(2000);
            //capture add applicant info
            try {
                String appInfo = driver.findElement(By.xpath("//*[@id='addApplicantDescription']")).getText();
                System.out.println("Application info message is " + appInfo);
            }catch (Exception e) {
                System.out.println("Unable to capture application info message " + e);
            }//end of application message

            Thread.sleep(2000);
            //click on add co applicant
            try {
                //click on add co-op applicant
                driver.findElement(By.xpath("//*[@id = 'addApplicantModuleNewAdd']")).click();
            } catch (Exception e) {
                System.out.println("unable to click add applicant" + e);
            }//end of applicant info

            Thread.sleep(2000);
            //enter Co First Name
            try {
                driver.findElement(By.xpath("//*[@name ='additionalApplicants[0].client.firstName']")).sendKeys(coFirstName.get(i));
            } catch (Exception e) {
                System.out.println("unable to enter first name" + e);
            }//end of try catch for first name

            Thread.sleep(2000);

            //enter Co Last Name
            try {
                driver.findElement(By.xpath("//*[@name= 'additionalApplicants[0].client.lastName']")).sendKeys(coLastName.get(i));
            } catch (Exception e) {
                System.out.println("unable to enter last name" + e);
            }//end of try catch for last name

            Thread.sleep(2000);
            //click continue again
            try {
                WebElement contButton = driver.findElement(By.xpath("//*[@name = 'continue']"));
                contButton.click();
            } catch (Exception e) {
                System.out.println("unable to click continue" + e);
            }//end of continue button

            //capture Error Message
            try {
                String errorMessage = driver.findElement(By.xpath("//*[@id='sfx_global_alert']")).getText();
                System.out.println("Error message is " + errorMessage);
            }catch (Exception e) {
                System.out.println("unable to capture error message " + e);
            }//end of error message

            Thread.sleep(4500);


        }//end of for loop
    }//end of main
}//end of class
