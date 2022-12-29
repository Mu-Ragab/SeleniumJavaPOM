package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(items));
        driver.findElements(items).get(0).click();
        return new ItemDetailsPage(driver);
    }

}
