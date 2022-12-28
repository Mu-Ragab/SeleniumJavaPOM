package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {

    private WebDriver driver;

    WebDriverWait wait;

    private By signupUsernameField = By.id("sign-username");
    private By signupPasswordField = By.id("sign-password");
    private By signupButton = By.xpath("//div[@id='signInModal']//button[@class='btn btn-primary']");
    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }

    public void setSignupUsername(String username){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(signupUsernameField));
        driver.findElement(signupUsernameField).sendKeys(username);
    }
    public void setSignupPassword(String password){
        driver.findElement(signupPasswordField).sendKeys(password);
    }
    public AlertsPage clickSignupButton(){
        driver.findElement(signupButton).click();
        return new AlertsPage(driver);
    }
}
