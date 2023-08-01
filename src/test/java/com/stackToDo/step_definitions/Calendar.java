package com.stackToDo.step_definitions;

import com.stackToDo.pages.DashBoard;
import com.stackToDo.utilities.ConfigurationReader;
import com.stackToDo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Calendar {
   DashBoard dashBoard = new DashBoard();
    @Given("User is on main page")
    public void user_is_on_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("User clicks calendar button")
    public void user_clicks_calendar_button() {
      // dashBoard.calendarButton.click();
        DashBoard.clickMenuByText("Calendar");
    }
    @Then("User should see following message {string}")
    public void user_should_see_following_message(String message) {
        Assert.assertEquals(message,dashBoard.message.getText());
    }

    @And("Url should contain {string}")
    public void urlShouldContain(String url) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(url));
    }
}
