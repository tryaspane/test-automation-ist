package stepdefinitions.frontend;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.RegisterStep;

public class RegisterStepDefinition {
    private RegisterStep registerStep;

    public RegisterStepDefinition(RegisterStep registerStep) {
        this.registerStep = registerStep;
    }

    @Given("user register account page")
    public void accessRegisterAccountPage() {
        registerStep.accessRegisterAccountPage();
    }

    @When("user register using valid email")
    public void registerUsingValidEmail() {
        registerStep.registerUsingValidEmail();
    }

    @Then("will navigate to my account page")
    public void navigateToMyAccountPage() {
        registerStep.navigateToMyAccountPage();
    }
}
