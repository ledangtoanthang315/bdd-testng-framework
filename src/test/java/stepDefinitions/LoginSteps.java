package stepDefinitions;

import io.cucumber.java.en.*;
import pages.LoginPage;
import utils.DriverManager;

public class LoginSteps {
    LoginPage loginPage = new LoginPage(DriverManager.getDriver());

    @Given("user is on the login page")
    public void user_is_on_login_page() {
        DriverManager.getDriver().get("https://example.com/login");
    }

    @When("user enters username {string} and password {string}")
    public void enter_credentials(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("user should see the dashboard")
    public void verify_dashboard() {
        assert loginPage.isLoginSuccessful();
    }

    @Then("user should see an error message {string}")
    public void user_should_see_an_error_message(String expectedError) {
        String actualError = loginPage.getLoginErrorMessage();
        if (!actualError.equalsIgnoreCase(expectedError)) {
            throw new AssertionError("Expected: " + expectedError + " but got: " + actualError);
        }
    }

}
