package com.webpages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    private WebDriver driver;

    private final WebElement Join_Portal = driver.findElement(By.xpath("//*[@class='portal_overview-button']/a"));

    private final WebElement Header = driver.findElement(By.xpath("//*[@class='portal_body-header']/h1"));

    public RegisterPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, RegisterPage.class);

    }

    public boolean IsPageOpened() {

        return Header.getText().toString().contains("Developer Portal");

    }

    public void ClickJoinPortal() {

        Join_Portal.click();

    }


}