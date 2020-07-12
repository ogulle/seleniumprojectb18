package test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

    public static void main(String[] args) throws InterruptedException{

        //1-This line creates the connection between driver and selenium.
        //and sets up the driver
        WebDriverManager.chromedriver().setup();

        //2- Creating the instance of ChromeDriver to be able to do action on ChromeBrowser
        WebDriver driver = new ChromeDriver();

        //The line below maximizes the browser page after opening it.
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();

        //3- we get google.com
        driver.get("https://www.google.com");
        System.out.println("driver.getTitle() --> " +driver.getTitle());
        System.out.println("driver.getCurrentUrl() --> " +driver.getCurrentUrl());

        //BROWSER NAVIGATION
        // THIS LINE WILL TAKE USER TO PREVIOUS PAGE
        Thread.sleep(2000); //this line adds 2000 milliseconds of wait = 2 seconds
        driver.navigate().back();

        //Thread.sleep is being aded just to be able to see selenium movements
        Thread.sleep(2000);
        driver.navigate().forward(); //This line will go to next page

        Thread.sleep(2000);
        driver.navigate().refresh(); //This line will refresh the page

        driver.navigate().to("https://www.facebook.com");

        System.out.println("driver.getTitle() --> " +driver.getTitle());
        System.out.println("driver.getCurrentUrl() --> " +driver.getCurrentUrl());

        System.out.println(driver.getPageSource());

        driver.close(); //will close the current browser tab
        //driver.quit(); //will close all of the tabs, and ends the session
        //pkill -9 Google Chrome --> Closes all the chrome browsers at once






    }
}
