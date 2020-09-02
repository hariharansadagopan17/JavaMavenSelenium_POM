package com.smokeTest.SeleniumJavaMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumJavaMaven {

    public static void main(String args[]){

            System.setProperty("webdriver.chrome.driver", "E:\\Counter-Strike\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.guru99.com/");

            System.out.println("opened url successfully");
            driver.close();

        }



}
