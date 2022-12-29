package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ItemDetailsPage {

    private WebDriver driver;

    WebDriverWait wait;

    private By addToCartButton = By.linkText("Add to cart");

    public ItemDetailsPage(WebDriver driver){
        this.driver = driver;
    }

    public AlertsPage clickAddToCart(){
        //wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton));
        driver.findElement(addToCartButton).click();
        return new AlertsPage(driver);
    }
}
