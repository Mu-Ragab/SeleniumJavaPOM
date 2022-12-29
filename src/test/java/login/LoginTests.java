package login;

import base.BaseTests;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTests {
    @Test(dependsOnMethods = "register.RegisterTests.testSuccessfulSignup")
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickLogin();
        loginPage.setUsername("Muhammad");
        loginPage.setPassword("Password123");
        loginPage.clickLoginButton();
        Assert.assertEquals(homePage.getWelcomeText(), "Welcome Muhammad");
    }
}
