package test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Task2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("");

        if (driver.getTitle().equals("Log in to ZeroBank")){
            System.out.println("Test is passed!");
        }else {
            System.out.println("Test is failed!");
        }





    }
}
