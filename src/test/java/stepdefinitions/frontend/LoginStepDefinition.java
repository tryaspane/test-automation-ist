package stepdefinitions.frontend;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import steps.LoginStep;

@AllArgsConstructor
public class LoginStepDefinition {
    private LoginStep loginStep;

    @Given("user login page")
    public void loginPage() {
        loginStep.loginPage();
    }

    @When("user login using email {string} and password {string}")
    public void loginUsingInvalidEmailAndPassword(String email, String password) {
        loginStep.loginUsingInvalidEmailAndPassword(email, password);
    }


    @Then("verify user can see login failed")
    public void verifyUserCanSeeLoginFailed() {
        loginStep.verifyUserCanSeeLoginFailed();
    }

    @Then("verify user can see login is success")
    public void verifyUserCanSeeLoginIsSuccess() {
        loginStep.verifyUserCanSeeLoginIsSuccess();
    }
}
