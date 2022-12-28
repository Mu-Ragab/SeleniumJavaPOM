package cart;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CartTests extends BaseTests {

    @Test
    public void addItemToCartTest() throws InterruptedException {
        CategoriesPage categoriesPage = homePage.clickLaptopsCategory();
        Thread.sleep(3000);
        ItemDetailsPage itemDetailsPage = categoriesPage.openItemDetails();
        AlertsPage alertsPage = itemDetailsPage.clickAddToCart();
        String text = alertsPage.getAlertText();
        alertsPage.acceptAlert();
        Assert.assertEquals(text, "Product added");
    }

    @Test
    public void deleteItemFromCartTest() throws InterruptedException {
        CartPage cartPage = homePage.clickCart();
        Thread.sleep(3000);
        cartPage.deleteItemFromCart();
    }

}
