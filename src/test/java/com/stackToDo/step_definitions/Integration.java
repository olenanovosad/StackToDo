package com.stackToDo.step_definitions;

import com.stackToDo.pages.DashBoard;
import io.cucumber.java.en.When;

public class Integration {

DashBoard dashBoard = new DashBoard();
    @When("User clicks integration button")
    public void user_clicks_integration_button() {
       DashBoard.clickMenuByText("Integration");
    }
}
