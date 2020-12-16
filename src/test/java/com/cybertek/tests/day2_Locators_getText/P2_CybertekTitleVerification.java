package com.cybertek.tests.day2_Locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cybertekschool.com");
        driver.manage().window().maximize();

        String expectedInUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();

        String result = (actualUrl.contains(expectedInUrl)) ? "Test Passed" : "Test failed !!";
        System.out.println(result);


        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();



        result = (expectedTitle.equals(actualTitle)) ? "Title verification PASSED !!!" : "Title verification FAILED !!!";
        System.out.println(result);

        driver.close();



    }
}

//TC #2: Cybertek verifications
//1. Open Chrome browser
//2. Go to https://practice.cybertekschool.com
//3. Verify URL contains
//Expected: cybertekschool
//4. Verify title:
//Expected: Practice
