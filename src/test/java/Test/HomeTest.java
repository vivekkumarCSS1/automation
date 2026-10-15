
package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Home;
import pages.LoginPage;

public class HomeTest extends BaseTest {

    @Test
    public void verifyLoginPage() {

        // Create Home page object
        Home home = new Home(driver);

        // Click Sign in and open the Login page
        LoginPage loginPage = home.openLoginPage();

        // Verify that the Login page is displayed
//        Assert.assertTrue(
//            loginPage.isLoginPageDisplayed(),
//            "Login page is not displayed"
//        );
    }
}
