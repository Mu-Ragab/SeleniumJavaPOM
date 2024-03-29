package base;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import pages.HomePage;

public class BaseTests {

    private WebDriver driver;

    protected HomePage homePage;


    public String randomUsername = RandomStringUtils.randomAlphabetic(8);
    public String randomPassword = RandomStringUtils.randomAlphanumeric(8);
    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://subscribe.stctv.com/");
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
