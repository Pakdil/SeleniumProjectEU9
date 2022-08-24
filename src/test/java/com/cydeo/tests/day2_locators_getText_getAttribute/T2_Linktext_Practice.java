package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_Linktext_Practice {

    public static void main(String[] args) {

        //1. Opern Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        // 2. Go to http://practice.cydeo.com

        driver.navigate().to("http://practice.cydeo.com");

        // 3. Click to A/B Testing from top of the list

        //driver.findElement(By.linkText("A/B Testing")).click();

        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        // 4.Verify title is:
        // Expected: No A/B Test



        // 5. Go back to home page by using the .back();


    }
}