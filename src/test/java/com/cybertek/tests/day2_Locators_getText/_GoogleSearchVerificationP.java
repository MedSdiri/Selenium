package com.cybertek.tests.day2_Locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// test GitHub
public class _GoogleSearchVerificationP {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);

        String expectedInTitle ="apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification PASSED !");
            System.out.println("Mela Zebbi howa");
        }else{
            System.out.println("Title verification FAILED !!!!!");
            System.out.println("expectedInTitle = " + expectedInTitle);
            System.out.println("actualTitle = " + actualTitle);
        }

        driver.close();
    }
}
