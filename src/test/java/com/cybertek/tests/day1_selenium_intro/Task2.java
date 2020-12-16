package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //System.out.println("URL contains cybertekschool ? : "+driver.getCurrentUrl().contains("cybertekschool"));
        //System.out.println("Tite is Practice : "+driver.getTitle().equalsIgnoreCase("practice"));
        String url = driver.getCurrentUrl();
        String reversedUrl = "";
        for (int i= url.length()-1; i >= 0; i--){
            reversedUrl += ""+url.charAt(i);
        }
        System.out.println(reversedUrl);


    }
}
