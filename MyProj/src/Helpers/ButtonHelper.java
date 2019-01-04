package Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonHelper {
    private WebDriver driver;

    public ButtonHelper(WebDriver driver) {
        this.driver = driver;
    }

    public static void buttonClick(WebDriver driver , By locator){
        WebElement btn = Synchronization.getElement(driver,locator);
        btn.click();
    }
}
