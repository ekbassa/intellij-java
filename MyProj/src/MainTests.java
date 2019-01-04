import Helpers.ReadData;
import POM.HomePage;
import POM.RegistrationPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static Helpers.ReadData.getData;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MainTests {
    private static WebDriver driver;

    HomePage home = new HomePage(driver);
    RegistrationPage reg = new RegistrationPage(driver);

    @BeforeClass
    public static void before() throws SAXException, ParserConfigurationException, jdk.internal.org.xml.sax.SAXException, IOException {
        System.setProperty("webdriver.chrome.driver","E:\\Users\\Bassam\\Documents\\Training\\Java\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(getData("url",ReadData.configFilePath));
    }

    @Test
    public void test01_begin() {
        home.clickRegistration(driver);
    }

    @Test
    public void test02_checkIfYouAreInTheRightPage()  {
        System.out.println("test 2 was executed");
        reg.ifYouAreInRegistrationPageClickRegister();
    }
    @Test
    public void test03_do() throws SAXException, ParserConfigurationException, jdk.internal.org.xml.sax.SAXException, IOException {
        System.out.println("we are in test 3 ");
        String text = getData("url",ReadData.configFilePath);
        System.out.println("the xml text is : "+text);
    }
    @Test
    public void test04_fillForm() throws SAXException, ParserConfigurationException, jdk.internal.org.xml.sax.SAXException, IOException {
        System.out.println("we are in test 04");
        String xmlName       = ReadData.getData("FirstName",ReadData.namesFilePath);
        String xmlEmail      = ReadData.getData("Email",ReadData.namesFilePath);
        String xmlPassword   = ReadData.getData("Password",ReadData.namesFilePath);
        String xmlConfirm    = ReadData.getData("Confirm",ReadData.namesFilePath);
        reg.fillRegistrationForm(xmlName,xmlEmail,xmlPassword);
    }



    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
        driver.quit();
    }

}
