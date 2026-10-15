package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Home;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {

    @Test(groups = {"smoke", "regression"})
    public void verifyLoginPageLoads() {
        LoginPage loginPage =
            new Home(driver).openLoginPage();

        Assert.assertTrue(
            loginPage.isLoginPageDisplayed(),
            "Login page or its input fields are not visible"
        );
    }

    @Test(groups = {"regression"})
    public void verifyInvalidCredentials() {
        LoginPage loginPage =
            new Home(driver).openLoginPage();

        Assert.assertTrue(
            loginPage.isLoginPageDisplayed(),
            "Login page is not displayed"
        );

        loginPage
            .enterEmail("invalid-user@example.com")
            .enterPassword("InvalidTestPassword123");

        loginPage.clickSignIn();

      
        Assert.assertTrue(
            loginPage.isDisplayed(),
            "Expected login validation error was not displayed"
        );
    }

    @Test(groups = {"regression"})
    public void verifyEmptyCredentials() {
        LoginPage loginPage =
            new Home(driver).openLoginPage();

        Assert.assertTrue(
            loginPage.isLoginPageDisplayed(),
            "Login page is not displayed"
        );

        loginPage.clickSignIn();

        // Replace this example with the application's actual
        // validation behavior, e.g. required-field message.
        Assert.assertTrue(
            loginPage.isLoginPageDisplayed(),
            "Login form is no longer available"
        );
    }

    @Test(groups = {"regression"})
    public void verifyEmailBoundaryValues() {
        LoginPage loginPage =
            new Home(driver).openLoginPage();

        Assert.assertTrue(
            loginPage.isLoginPageDisplayed(),
            "Login page is not displayed"
        );

        // Example boundary input: empty email.
        // The expected behavior depends on the application.
        loginPage.enterEmail("");

        Assert.assertTrue(
            loginPage.isLoginPageDisplayed(),
            "Login page is not displayed after entering empty email"
        );
    }

    @Test(groups = {"regression"}, enabled = false)
    public void verifySuccessfulLogin() {
        String email = System.getenv("LINKEDIN_EMAIL");
        String password = System.getenv("LINKEDIN_PASSWORD");

        Assert.assertNotNull(email, "LINKEDIN_EMAIL is missing");
        Assert.assertNotNull(password, "LINKEDIN_PASSWORD is missing");

        LoginPage loginPage =
            new Home(driver).openLoginPage();

        Assert.assertTrue(
            loginPage.isLoginPageDisplayed(),
            "Login page is not displayed"
        );

        loginPage
            .enterEmail(email)
            .enterPassword(password);

        loginPage.clickSignIn();

        
    }
}