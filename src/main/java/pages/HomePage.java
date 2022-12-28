package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;

    WebDriverWait wait;
    private By signupLink = By.linkText("Sign up");
    private By loginLink = By.linkText("Log in");
    private By welcomeMessage = By.id("nameofuser");
    private By phonesLink = By.linkText("Phones");
    private By laptopsLink = By.linkText("Laptops");
    private By monitorsLink = By.linkText("Monitors");
    private By cartLink = By.linkText("Cart");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public RegisterPage clickSignup() {
        driver.findElement(signupLink).click();
        return new RegisterPage(driver);
    }

    public LoginPage clickLogin(){
        driver.findElement(loginLink).click();
        return new LoginPage(driver);
    }

    public String getWelcomeText(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(welcomeMessage));
        return driver.findElement(welcomeMessage).getText();
    }

    public CategoriesPage clickPhonesCategory(){
        driver.findElement(phonesLink).click();
        return  new CategoriesPage(driver);
    }

    public CategoriesPage clickLaptopsCategory(){
        driver.findElement(laptopsLink).click();
        return  new CategoriesPage(driver);
    }

    public CategoriesPage clickMonitorsCategory(){
        driver.findElement(monitorsLink).click();
        return  new CategoriesPage(driver);
    }

    public CartPage clickCart(){
        driver.findElement(cartLink).click();
        return  new CartPage(driver);
    }

}
