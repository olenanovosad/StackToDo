package com.stackToDo.step_definitions;

import com.stackToDo.pages.DashBoard;
import com.stackToDo.pages.LogInPage;
import com.stackToDo.utilities.ConfigurationReader;
import com.stackToDo.utilities.Driver;
import com.stackToDo.utilities.Extra;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogIn {
    LogInPage logInPage = new LogInPage();

    @Given("User is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        logInPage.loginButton.click();
    }

    @When("User enters valid email {string} and password {string}")
    public void user_enters_valid_email_and_password(String email, String password) {
        logInPage.emailLogIn.sendKeys(email);
        logInPage.passwordLogIn.sendKeys(password);
    }

    @When("Clicks signIn button")
    public void clicks_sign_in_button() {
        logInPage.signInButton.click();
    }


    @When("user enters invalid email {string}")
    public void user_enters_invalid_email(String email) {
        logInPage.emailLogIn.sendKeys(email);
    }

    @When("user enters invalid password {string}")
    public void user_enters_invalid_password(String password) {
        logInPage.passwordLogIn.sendKeys(password);
    }

    @Then("user should see message {string}")
    public void user_should_see_message(String message) {
        Assert.assertEquals(logInPage.errorMessage.getText(), message);


    }


    @And("user is logged out")
    public void userIsLoggedOut() {
        Extra.LogOut();
    }
}
