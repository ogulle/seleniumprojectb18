package test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_GoogleTitleVerification {
    public static void main(String[] args) {
        //TC    #1: Google Title Verification
        // 1. Open Chrome browser
            //Set up my webdriver
        WebDriverManager.chromedriver().setup();
            //Create an instance of my chrome driver
        WebDriver driver = new ChromeDriver();
            //Make the browser full screen
        driver.manage().window().maximize();
        //2. go to https://www.google.com
        driver.get("https://www.google.com");
        //3. verify title: Expected: Google

        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Google title verification PASSED!");
        }else{
            System.out.println("Google title verification FAILED!!!");
        }

        WebDriver driver2 = new ChromeDriver();
        driver2.get("http://practice.cybertekschool.com");
        String actualTitle2 = driver2.getTitle();
        String expectedTitle2 = "Practice";

        if(actualTitle2.equals(expectedTitle2)){
            System.out.println("Verification Passed!");
        }else {
            System.out.println("Verification Failed!");
        }



    }
}
