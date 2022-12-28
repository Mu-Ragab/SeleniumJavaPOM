package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    private WebDriver driver;

    WebDriverWait wait;

    private By deleteLink =By.linkText("Delete");
    private By placeOrderButton = By.xpath("//button[@class='btn btn-success']");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public void deleteItemFromCart(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(deleteLink));
        driver.findElement(deleteLink).click();
    }

    public PlaceOrderPage clickPlaceOrder(){
        driver.findElement(placeOrderButton).click();
        return new PlaceOrderPage(driver);
    }


}
