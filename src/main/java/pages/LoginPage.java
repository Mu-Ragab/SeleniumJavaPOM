package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;

    WebDriverWait wait;

    private By loginUsernameField = By.id("loginusername");
    private By loginPasswordField = By.id("loginpassword");
    private By loginButton = By.xpath("//div[@id='logInModal']//button[@class='btn btn-primary']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginUsernameField));
        driver.findElement(loginUsernameField).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(loginPasswordField).sendKeys(password);
    }
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
}
