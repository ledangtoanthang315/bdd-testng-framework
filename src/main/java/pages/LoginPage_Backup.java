package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_Backup {
    WebDriver driver;

    public LoginPage_Backup(WebDriver driver) {
        this.driver = driver;
    }

    private final By usernameField = By.id("form.email");
    private final By passwordField = By.id("form.password");
    private final By loginButton = By.id("login");

    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public boolean isLoginSuccessful() {
        return driver.getTitle().contains("Dashboard");
    }

    By errorMessageLocator = By.id("error-msg");  // Adjust locator as needed

    public String getLoginErrorMessage() {
        return driver.findElement(errorMessageLocator).getText().trim();
    }

}
