package POM;

import Helpers.Synchronization;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private  WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // WebElements Section
    By registerLink = By.xpath("//div[@id='ember587']//descendant::li[3]");

    // Actions
    public void clickRegistration(WebDriver driver){
       WebElement element = Synchronization.getElement(driver,registerLink);
       element.click();
    }
}
