package test.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_CybertekURLVerification {
    public static void main(String[] args) {
        //TC #3: PracticeCybertek/ForgotPassword URL verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3. Enter any email into input box
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("anyemail@email.com");

        //int inte2123 = driver.findElement(By.id("form_submit"));

        //4. Click on Retrieve password
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        //5. Verify URL contains:
        //  Expected: “email_sent”
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "email_sent";

        System.out.println("Current URL: "+actualUrl);

        if (actualUrl.contains(expectedUrl)){
            System.out.println("Url verification passed!");
        }else{
            System.out.println("Url verification failed!");
        }

        //6. Verify textbox displayed the content as expected.
        //String actualMessage = driver.findElement(By.name("confirmation_message")).getText();
        WebElement confirmationMessage = driver.findElement(By.name("confirmation_message"));
        //String actualMessage = driver.findElement(By.name("confirmation_message")).getText();

        String actualMessageText = confirmationMessage.getText();
        String expectedMessageText = "Your e-mail's been sent!";

        // System.out.println("actualMessage: " + actualMessageText);

        if(actualMessageText.equals(expectedMessageText)){
            System.out.println("Confirmation message text verification PASSED!");
        }else{
            System.out.println("Confirmation message text verification FAILED!");
        }

        if (confirmationMessage.isDisplayed()){
            System.out.println("Message is displayed, verification PASSED!");
        }else{
            System.out.println("Message is NOT displayed, verification FAILED!");
        }










    }
}
