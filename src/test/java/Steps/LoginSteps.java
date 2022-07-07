package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePO;

public class LoginSteps {

    HomePO homePO = new HomePO();

    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        homePO.openHome();
    }

    @When("the user enters valid credencials")
    public void the_user_enters_valid_credencials() {

    }

    @When("hits submit")
    public void hits_submit() {

    }

    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {

    }
}
