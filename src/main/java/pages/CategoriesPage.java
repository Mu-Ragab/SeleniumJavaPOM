package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CategoriesPage {

    private WebDriver driver;

    WebDriverWait wait;

    private By items = By.xpath("//*[@id='tbodyid']/div");

    public CategoriesPage(WebDriver driver){
        this.driver = driver;
    }

    public Integer getItemsSize(){
        return driver.findElements(items).size();
    }

    public ItemDetailsPage openItemDetails(){
        driver.findElements(items).get(0).click();
        return new ItemDetailsPage(driver);
    }

}
