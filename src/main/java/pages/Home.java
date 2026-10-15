
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home extends Base {

    private final By signInLink = By.xpath(
        "//a[contains(@class,'nav__button-secondary')"
        + " and normalize-space(.)='Sign in']"
    );

    public Home(WebDriver driver) {
        super(driver);
    }

    public LoginPage openLoginPage() {
        click(signInLink);
        return new LoginPage(driver);
    }
}
