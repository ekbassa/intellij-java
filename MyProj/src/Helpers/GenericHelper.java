package Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenericHelper {
    private  WebDriver driver;

    public GenericHelper(WebDriver driver) {
        this.driver = driver;
    }

    public static boolean isElementSelected(WebDriver driver, By locator){

       return driver.findElement(locator).isSelected();
    }
    public static boolean isElementDisplayed(WebDriver driver, By locator){

        return driver.findElement(locator).isDisplayed();
    }

    public static boolean isElementEnabled(WebDriver driver, By locator){

        return driver.findElement(locator).isEnabled();
    }
    public static String getElementText(WebDriver driver, By locator){

        return driver.findElement(locator).getText();
    }

}
