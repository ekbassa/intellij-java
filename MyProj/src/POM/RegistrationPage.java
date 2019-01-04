package POM;

import Helpers.Synchronization;
import Helpers.TextBoxHelper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    private String header = "כניסה";

    //WebElements
    private By pageHeader = By.xpath("//div[@class='lightbox-head']");
    private By registerLink = By.xpath("//p[@class='switch-text']//span[@class='text-btn']");
    private By name_Input = By.id("ember984");
    private By email_Input = By.id("ember986");
    private By password_Input = By.id("valPass");
    private By confirmPassword_Input = By.id("ember990");
    private By iAgreeToTheTerms_chk = By.name("ember991-id");
    By iWouldLikeToBeUpdated_chk = By.id("ember993-id");
    By submit_btn = By.xpath("//form[@id='ember982']//descendant::button[@type='submit']");


    // Actions

    public void ifYouAreInRegistrationPageClickRegister() {
        String actualText = driver.findElement(pageHeader).getText();
        Assert.assertEquals(header, actualText);
        System.out.println("Assertion was succeeded");

        // below this remarks means that the assertion was succeeded
        //get the dynamic element

        WebElement element = Synchronization.getElement(driver, registerLink);
        element.click();
    }

    public void fillRegistrationForm(String name, String email, String password) {
        TextBoxHelper.fillTextBox(driver, name_Input, name);
        TextBoxHelper.fillTextBox(driver, email_Input, email);
        TextBoxHelper.fillTextBox(driver, password_Input, password);
        TextBoxHelper.fillTextBox(driver, confirmPassword_Input, password);
        driver.findElement(iAgreeToTheTerms_chk).click();
        //ButtonHelper.buttonClick(driver, submit_btn);
    }
}

