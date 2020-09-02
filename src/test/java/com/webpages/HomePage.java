package com.webpages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    //Page URL and Locators
    private static String PAGE_URL="https://www.toptal.com/developers";
    private final WebElement Link_Text = driver.findElement(By.linkText("APPLY AS A DEVELOPER"));
    //Locators

    //Apply as Developer Button
    //@FindBy(how = How.LINK_TEXT, using = "APPLY AS A DEVELOPER")
    //private WebElement developerApplyButton;


    public HomePage(WebDriver driver){
        this.driver=driver;
        driver.get(PAGE_URL);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void clickOnDeveloperApplyButton(){

      Link_Text.click();

    }



}
