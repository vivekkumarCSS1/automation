
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Base {

	By emailField = By.cssSelector("input[type='email']");
	    private final By passwordField =
	        By.id("_R_5fvriejj35656j6_");

	    private final By signInButton =
	        By.cssSelector("//button[@type='button' and @componentkey='e9683fa5-b470-4d9a-b09d-9a89a02cefe1']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Verify that the login page is displayed
    public boolean isLoginPageDisplayed() {
        return isDisplayed(emailField)
                && isDisplayed(passwordField);
    }

    public LoginPage enterEmail(String email) {
        WebElement element = wait.waitForVisibility(emailField);
        element.clear();
        element.sendKeys(email);
        return this;
    }
    public LoginPage enterPassword(String password) {
    	System.out.print("hello i am here in password section");
        type(passwordField, password);
        return this;
    }

    public void clickSignIn() {
        click(signInButton);
    }
}
