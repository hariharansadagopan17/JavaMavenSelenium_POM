package com.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ApplyPage {

    private WebDriver driver;

    private final WebElement Heading = driver.findElement(By.xpath("//*[@id='top']/div[1]/div/div/header/div/h1"));

    public ApplyPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, ApplyPage.class);
    }


    

}
