package register;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;
import pages.RegisterPage;

public class RegisterTests extends BaseTests {


    @Test
    public void testSuccessfulSignup() {
        RegisterPage registerPage = homePage.clickSignup();
        registerPage.setSignupUsername("muerrccvddccRagabbbghg");
        registerPage.setSignupPassword("Password123");
        AlertsPage alertsPage = registerPage.clickSignupButton();
        String text = alertsPage.getAlertText();
        alertsPage.acceptAlert();
        Assert.assertEquals(text, "Sign up successful.");
    }
}
