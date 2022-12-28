package categories;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CategoriesPage;

public class CategoriesTests extends BaseTests {

    @Test
    public void checkCategoriesHasItems() {
        CategoriesPage categoriesPage = homePage.clickPhonesCategory();
        Assert.assertNotNull(categoriesPage.getItemsSize());
        homePage.clickLaptopsCategory();
        Assert.assertNotNull(categoriesPage.getItemsSize());
        homePage.clickMonitorsCategory();
        Assert.assertNotNull(categoriesPage.getItemsSize());
    }
}
