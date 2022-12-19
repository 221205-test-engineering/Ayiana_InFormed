package dev.mallory.informed;

import dev.mallory.pom.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class InFormed
{
    static WebDriver driver;

    public static void main (String[] args)
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // LEVEL 1
        Level1Pom l1 = new Level1Pom(driver, "file:///Users/ayianamallory/Desktop/Revature/inFormed/level-1.html");
        WebElement whereToType = driver.findElement(By.id("nameInput"));
        WebElement nameToType = driver.findElement(By.id("randomString"));
        String name = nameToType.getAttribute("innerHTML");
        whereToType.sendKeys(name);
        whereToType.submit();

        //LEVEL 2
        Level2Pom l2 = new Level2Pom(driver, "file:///Users/ayianamallory/Desktop/Revature/inFormed/level-2.html");
        String ddv = l2.driver.findElement(l2.dropdownVal).getText();
        Select dropdown = new Select(l2.driver.findElement(l2.dropdownInput));            // create dropdown object to select from
        dropdown.selectByVisibleText(ddv);

        List<WebElement> checkEm = l2.driver.findElements(l2.checkBoxes); // create list of all check boxes
        for(WebElement check : checkEm){                                    // iterate through list of all checkboxes and click
            check.click();
        }
    }
}
