package POM;

import Helpers.Synchronization;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    //WebElements
     By pageHeader = By.xpath("//div[@class='lightbox-head']");
     By registerLink = By.xpath("//p[@class='switch-text']//span[@class='text-btn']");
     String header = "כניסה";

    // Actions

    public void ifYouAreInRegistrationPageClickRegister() {
        String actualText = driver.findElement(pageHeader).getText();
        Assert.assertEquals(header,actualText);
        System.out.println("Assertion was succeeded");

        // below this remarks means that the assertion was succeeded
        //get the dynamic element

         WebElement element = Synchronization.getElement(driver,registerLink);
         element.click();
    }

}
