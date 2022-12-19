package dev.mallory.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Level2Pom
{
    public WebDriver driver;
    public Level2Pom(WebDriver driver, String website)
    {
        this.driver = driver;
        driver.get(website);
        PageFactory.initElements(driver, this); // pre-built class from selenium
    }

    public By dropdownVal = By.xpath("//dl/dd[1]");
    public By dropdownInput = By.xpath("//select[@name='input1']");
    public By checkBoxes = By.xpath("//input[@type='checkbox']");
    public By radioButton = By.xpath("//dl/dd[3]");
    public By date1 = By.xpath("//dd[contains(text(), '-')]");
    public By dateBox = By.xpath("//input[@name='dateInput']");
    public By submitButton = By.xpath("//button[@type='submit']");
}
