package com.stackToDo.step_definitions;

import com.stackToDo.pages.DashBoard;
import io.cucumber.java.en.When;

public class FAQ {

DashBoard dashBoard =new DashBoard();
    @When("User clicks FAQ button")
    public void user_clicks_faq_button() {
        DashBoard.clickMenuByText("FAQ");
    }
}
