
package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.WaitUtil;

public class Base {

    protected WebDriver driver;
    protected WaitUtil wait;

    // Constructor
    public Base(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitUtil(driver);
    }

    // CLICK
    protected void click(By locator) {
        wait.waitforClickable(locator).click();
    }

    // TYPE
    protected void type(By locator, String text) {
       // WebElement element = wait.waitForVisibility(locator);
       // WebElement element=driver.findElement(locator);
    	WebDriverWait wait = new WebDriverWait(
    		    driver, Duration.ofSeconds(15)
    		);

        	WebElement element = wait.until(d ->
        	    d.findElements(locator).stream()
        	        .filter(WebElement::isDisplayed)
        	        .filter(WebElement::isEnabled)
        	        .findFirst()
        	        .orElse(null)
        	);

        
     element.click();
       element.sendKeys(text);
      

 
    }

    // GET TEXT
    protected String getText(By locator) {
        return wait.waitForVisibility(locator)
                   .getText()
                   .trim();
    }

    // IS DISPLAYED
    protected boolean isDisplayed(By locator) {
        try {
            return wait.waitForVisibility(locator).isDisplayed();
        } catch (org.openqa.selenium.TimeoutException e) {
            return false;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    // IS ENABLED
    protected boolean isEnabled(By locator) {
        try {
            return wait.waitForVisibility(locator).isEnabled();
        } catch (org.openqa.selenium.TimeoutException e) {
            return false;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    // CLEAR
    protected void clear(By locator) {
        wait.waitForVisibility(locator).clear();
    }

    // GET ATTRIBUTE
    protected String getAttribute(By locator, String attribute) {
        return wait.waitForVisibility(locator)
                   .getAttribute(attribute);
    }

    // GET CURRENT URL
    protected String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    // GET PAGE TITLE
    protected String getPageTitle() {
        return driver.getTitle();
    }

    // REFRESH PAGE
    protected void refreshPage() {
        driver.navigate().refresh();
    }

    // NAVIGATE BACK
    protected void navigateBack() {
        driver.navigate().back();
    }

    // NAVIGATE FORWARD
    protected void navigateForward() {
        driver.navigate().forward();
    }
}
