package com.cybertek.tests.day2_Locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_SmartBearLoginVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String expectedTitle ="Web Orders Login";

        String actualTitle = driver.getTitle();


        if (actualTitle.equals(expectedTitle)){
            System.out.println("Lading page title verification PASSED !");
        }else{
            System.out.println("Landing page title verification FAILED !!!!");
            System.out.println("expectedTitle = " + expectedTitle);
            System.out.println("actualTitle = " + actualTitle);
        }
        Thread.sleep(3000);

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        Thread.sleep(3000);
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        Thread.sleep(3000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);


        String expectedLoginTitle = "Web Orders";
        String actualLoginTitle = driver.getTitle();

        if (expectedLoginTitle.equals(actualLoginTitle)) {

            System.out.println("Login title verification PASSED !");
        }else{
            System.err.println("Login title verification FAILED !!!!");
            System.out.println("expectedLoginTitle = " + expectedLoginTitle);
            System.out.println("actualLoginTitle = " + actualLoginTitle);
        }
         driver.findElement(By.id("ctl00_logout")).click();
        Thread.sleep(3500);


        driver.close();


    }
}
//TC #5: Basic login authentication
//1- Open a chrome browser
//2- Go to:
//http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//3- Verify title equals:
//Expected: Web Orders Login
//4- Enter username: Tester
//5- Enter password: test
//6- Click "Sign In" button
//7- Verify title equals:
//Expected: Web Orders