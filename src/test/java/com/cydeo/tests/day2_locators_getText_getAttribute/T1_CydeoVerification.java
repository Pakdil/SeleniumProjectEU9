package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class T1_CydeoVerification {

    public static void main(String[] args) {

        // TC #1: Cydeo practice tool verifications
        //1. Opern Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new OperaDriver();
        driver.manage().window().maximize();

        // 2. Go to https://parctice.cydeo.com

        driver.navigate().to("https://parctice.cydeo.com");

        // 3. Verify URL contains

        // Expected: cydeo

        String expectedURL = "cydeo";

        String actualURL = driver.getCurrentUrl();


        if (actualURL.contains(expectedURL)) {
            System.out.println("URL verification PASSED!");
        }else {
            System.out.println("URL verification FAILED!!!");
        }

    }
}
