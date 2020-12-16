package com.cybertek.tests.day2_Locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_FacebookTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();
        String result = (expectedTitle.equals(actualTitle)) ? "Title verification PASSED!!!" : "Titel verification FAILED !!!!";
        System.out.println(result);
        driver.close();



    }
}







/*
TC #1: Facebook Title Verification
1. Open Chrome browser:
-Setup the browser driver
-Use WebDriver instance to open the browser

2. Go to https://www.facebook.com
3. Verify title:
Expected: Facebook - Log In or Sign Up
 */