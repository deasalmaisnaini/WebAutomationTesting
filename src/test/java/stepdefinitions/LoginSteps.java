package stepdefinitions;

import org.junit.Assert;

import actions.LoginPageActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.HelperClass;

public class LoginSteps {
	
	LoginPageActions objLogin = new LoginPageActions();
	String url = "https://www.saucedemo.com/";
	
	@When("User has opened swag labs browser")
	public void user_has_opened_swag_labs_browser() throws InterruptedException {
        HelperClass.openPage(url);
        Thread.sleep(2000);
	}

	@Then("There are fields for inputting username and password that have not been filled in")
	public void there_are_fields_for_inputting_username_and_password_that_have_not_been_filled_in() {
		Assert.assertTrue(objLogin.isPasswordFieldDisplayed());
		Assert.assertTrue(objLogin.isUsernameFieldDisplayed());
	}

	@Then("There is a green Login Button")
	public void there_is_a_green_login_button() {
		Assert.assertTrue(objLogin.isButtonEnable());
	}

	@Then("There is a Swag Labs logo name")
	public void there_is_a_swag_labs_logo_name() {
		Assert.assertTrue(objLogin.isLogoDisplayed());
	}

	
	

}
