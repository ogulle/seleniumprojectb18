package test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_EtsyTitle_Verification {
    public static void main(String[] args) {
        //TC#1: Etsy Title Verification
        //1- Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go yo https://www.etsy.com
        driver.get("https://www.etsy.com");
        //3- Search "wooden spoon"
        //driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon" + Keys.ENTER);
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon");

        //locating and clicking to the search button using class attribute value
        //locating the search button
        driver.findElement(By.className("wt-input-btn-group__btn")).click();

        //4- Verify title:
        //      Expected:"Wooden spoon | Etsy"
        if(driver.getTitle().equals("Wooden spoon | Etsy")){
            System.out.println("Etsy title verification Passed!");
            driver.quit();
        }else{
            System.out.println("Etsy title verification Failed!");
        }


    }
}
