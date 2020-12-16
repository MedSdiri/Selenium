package com.cybertek.tests.day2_Locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_GmailTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //open browser
        WebDriver driver = new ChromeDriver();

        // go to https://google.com
        driver.get("https://www.google.com");
        // maximising the the window (full screen)
        driver.manage().window().maximize();

        //to be able to click we need to locate the web element from the page
        Thread.sleep(3000);

        driver.findElement(By.linkText("Gmail")).click();
        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedInTitle)){
            System.out.println("Title verification PASSED !!!");
        }else {
            System.out.println("Title verification FAILED !!!");
        }


        driver.navigate().back();
        // verify the title is Google

        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();

        if (actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Google Title verification PASSED !");
        }else {
            System.out.println("Google Title verification FAILED !!!!");
        }


        driver.close();





        //TC #3: Back and forth navigation
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Click to Gmail from top right.
//4- Verify title contains:
//Expected: Gmail
//5- Go back to Google by using the .back();
//6- Verify title equals:
//Expected: Google
    }
}
