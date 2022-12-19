package dev.mallory.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Level1Pom
{
    public WebDriver driver;

    public Level1Pom(WebDriver driver, String website)
    {
        this.driver = driver;
        driver.get(website);
        PageFactory.initElements(driver, this); // pre-built class from selenium
    }
    /*@FindBy(id = "nameInput")
    public WebElement whereToType;

    public Level1Pom(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this); // pre-built class from selenium
    }*/
}
