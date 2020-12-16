package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        //1- set up the web driver
        WebDriverManager.chromedriver().setup();
        // 2- create the instance of the chrone driver
        WebDriver driver = new ChromeDriver();
        // 3- test if driver is working
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize(); // maximize the navigator window
        System.out.println("Current title of the page is: "+driver.getTitle());

        // using basic navigation
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        driver.navigate().to("https://www.twitter.com");

        System.out.println("Current title of the page is: "+driver.getTitle());
        // putting the page's URL in a string called currentUrl
        String currentUrl = driver.getCurrentUrl();
        System.out.println("current URL is : "+currentUrl);

       // driver.close(); // close the window opened
    }
}
