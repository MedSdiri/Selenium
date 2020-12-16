package com.cybertek.tests.day1_selenium_intro;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        System.out.println("page title is Facebook - Log In or Sign Up : "+driver.getTitle().equalsIgnoreCase("facebook - log in or sign up"));
        driver.close();
    }
}
