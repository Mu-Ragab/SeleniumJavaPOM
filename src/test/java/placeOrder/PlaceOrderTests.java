package placeOrder;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class PlaceOrderTests extends BaseTests {

    @Test(dependsOnMethods = "cart.CartTests.addItemToCartTest")
    public void successfulCheckoutTest() throws InterruptedException {
        //CategoriesPage categoriesPage = homePage.clickLaptopsCategory();
        //Thread.sleep(3000);
        //ItemDetailsPage itemDetailsPage = categoriesPage.openItemDetails();
        //Thread.sleep(3000);
        //AlertsPage alertsPage = itemDetailsPage.clickAddToCart();
        //String text = alertsPage.getAlertText();
        //alertsPage.acceptAlert();
        //Assert.assertEquals(text, "Product added");
        CartPage cartPage = homePage.clickCart();
        PlaceOrderPage placeOrderPage = cartPage.clickPlaceOrder();
        //Thread.sleep(3000);
        placeOrderPage.fillPlaceOrderForm("name test", "12345");
        //Thread.sleep(3000);
        String text2 = placeOrderPage.getSuccessMessageText();
        placeOrderPage.clickOk();
        Assert.assertEquals(text2, "Thank you for your purchase!");
    }
}
