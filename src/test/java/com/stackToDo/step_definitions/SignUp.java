package com.stackToDo.step_definitions;

import com.stackToDo.pages.DashBoard;
import com.stackToDo.pages.SignUpPage;
import com.stackToDo.utilities.ConfigurationReader;
import com.stackToDo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.time.format.DateTimeFormatter;

public class SignUp {

    SignUpPage signUp = new SignUpPage();

    @Given("User is on signUp page")
    public void user_is_on_sign_up_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        DashBoard.clickMenuByText("Sign");
    }
    @When("User enters name {string} , email {string} and password {string}")
    public void user_enters_name_email_and_password(String name, String email, String password) {
    signUp.nameInput.sendKeys(name);
    signUp.emailInput.sendKeys(email);
    signUp.passwordInput.sendKeys(password);
    }
    @When("User agrees to terms and condition")
    public void user_agrees_to_terms_and_condition() {
       signUp.termsCheckbox.click();
    }
    @When("Clicks signUp button")
    public void clicks_sign_up_button() {
       signUp.submitButton.click();
    }
    @Then("User should be taken to task page and url should contain {string}")
    public void user_should_be_taken_to_task_page_and_title_should_contain(String url) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(url));
    }
}
