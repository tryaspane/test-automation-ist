package stepdefinitions.frontend;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import steps.LoginStep;

@AllArgsConstructor
public class LoginStepDefinition {
    private LoginStep loginStep;

    @Given("user dashboard page")
    public void accessDashboardPage() {
        loginStep.accessDashboardPage();
    }

    @When("user login using email {string} and password {string}")
    public void loginUsingEmailAndPassword(String email, String password) {
        loginStep.loginUsingEmailAndPassword(email, password);
    }


    @Then("verify user can see login failed")
    public void verifyUserCanSeeLoginFailed() {
        loginStep.verifyUserCanSeeLoginFailed();
    }

    @Then("verify user can see login is success")
    public void verifyUserCanSeeLoginIsSuccess() {
        loginStep.verifyUserCanSeeLoginIsSuccess();
    }


    @When("user login using email or phone {string}")
    public void userLoginUsingEmailOrPhone(String email_phone) {
        loginStep.userLoginUsingEmailOrPhone(email_phone);
    }
}
