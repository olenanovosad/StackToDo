package com.stackToDo.step_definitions;

import com.stackToDo.pages.LogInPage;
import com.stackToDo.pages.MyTasksPage;
import com.stackToDo.utilities.ConfigurationReader;
import com.stackToDo.utilities.Driver;
import com.stackToDo.utilities.Extra;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyTasks {
    MyTasksPage myTasks = new MyTasksPage();
    LogInPage logInPage = new LogInPage();

    @Given("User is logged in")
    public void user_is_logged_in() {
        Driver.getDriver().get("http://stackadapt-interview.us-east-1.elasticbeanstalk.com/login");
        logInPage.LogIn();
    }

    @Given("User have created {int} tasks")
    public void user_have_created_tasks(int tasks) {
        for (int i = 0; i < tasks; i++) {
         myTasks.createTask();
        }
    }
    @When("User deletes {int} or more tasks")
    public void userDeletesTwoOrMoreTasks(int clicks) {
        myTasks.deleteTask(clicks);

    }


    @Then("User sees only one task being displayed on task table")
    public void user_sees_only_one_task_being_displayed_on_task_table() {
        Assert.assertTrue(myTasks.allTasks.size()==1);
        Extra.LogOut();
    }


}
