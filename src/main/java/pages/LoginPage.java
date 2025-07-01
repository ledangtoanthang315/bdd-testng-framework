package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {

    private final WebDriverWait wait;

    // Locators
    private final By usernameField = By.id("form.email");
    private final By passwordField = By.id("form.password");
    private final By loginButton = By.id("login");
    // --- FINAL CORRECTED LINE ---
    private final By errorMessageLocator = By.xpath("(//*[contains(text(), 'Invalid username or password')])[last()]");

    // Constructor
    public LoginPage(WebDriver driver) {
        // Initialize the wait object. It will wait a maximum of 10 seconds.
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    /**
     * Enters username and password, then clicks the login button.
     * It now waits for each element to be ready before interacting with it.
     */
    public void login(String username, String password) {
        WebElement userField = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
        userField.sendKeys(username);

        WebElement passField = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        passField.sendKeys(password);

        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        button.click();
    }

    /**
     * Checks if the login was successful by waiting for the title to change.
     * @return true if the title contains "dashboard", false otherwise.
     */
    public boolean isLoginSuccessful() {
        // Waits for up to 10 seconds for the page title to contain "dashboard"
        return wait.until(ExpectedConditions.titleContains("Admin Portal"));
    }

    /**
     * Gets the login error message from the page.
     * It now waits for the error message element to be visible before getting its text.
     * @return The text of the error message.
     */
    public String getLoginErrorMessage() {
        // Waits for the error message element to be visible before trying to get its text
        WebElement errorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessageLocator));
        return errorMessageElement.getText().trim();
    }
}