package Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxHelper {
    private WebDriver driver;

    public TextBoxHelper(WebDriver driver) {
        this.driver = driver;
    }

    public static void cleanTextBox(WebDriver driver, By locator){
       WebElement input = Synchronization.getElement(driver,locator);
       input.clear();
    }
    public static void fillTextBox(WebDriver driver,By locator,String text){
        WebElement input = Synchronization.getElement(driver,locator);
        input.clear();
        input.sendKeys(text);
    }


}
