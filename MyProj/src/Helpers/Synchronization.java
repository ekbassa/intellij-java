package Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Synchronization {

    private static WebDriver driver;

    public Synchronization(WebDriver driver) {
        this.driver = driver;
    }


    public static WebElement getElement(WebDriver driver,By locator){

        WebElement element = (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.elementToBeClickable(locator));
        return element;
    }

    public static WebElement getElement(WebDriver driver, WebElement anyElement){
        WebDriverWait wait = new WebDriverWait(driver,5);
        return  wait.until(ExpectedConditions.visibilityOf(anyElement));
    }
}
