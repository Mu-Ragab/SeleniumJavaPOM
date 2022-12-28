package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PlaceOrderPage {

    private WebDriver driver;
    WebDriverWait wait;

    private By nameField = By.id("name");
    private By creditCardField = By.id("card");
    private By purchaseButton = By.xpath("//*[@id='orderModal']//button[@class='btn btn-primary']");

    private By successPurchaseMessage = By.xpath("//div[@class='sweet-alert  showSweetAlert visible']//h2");
    private By okButton = By.xpath("//div[@class='sa-confirm-button-container']//button[@class='confirm btn btn-lg btn-primary']");

    public PlaceOrderPage(WebDriver driver){
        this.driver = driver;
    }

    public void fillPlaceOrderForm(String name, String creditCard){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameField));
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(creditCardField).sendKeys(creditCard);
        driver.findElement(purchaseButton).click();
    }

    public String getSuccessMessageText(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(successPurchaseMessage));
        return driver.findElement(successPurchaseMessage).getText();
    }

    public void clickOk(){
        driver.findElement(okButton).click();
    }
}
