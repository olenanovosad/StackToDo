package com.stackToDo.pages;

import com.stackToDo.utilities.ConfigurationReader;
import com.stackToDo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends DashBoard {

    @FindBy(id = "login")
    public WebElement emailLogIn;
    @FindBy(id = "remember")
    public WebElement rememberMeCheckBox;

    @FindBy(id = "password")
    public WebElement passwordLogIn;

    @FindBy(id = "submit")
    public WebElement signInButton;

    @FindBy(xpath = "//label[@class='error text-danger']")
    public WebElement errorMessage;

    public void LogIn() {
        emailLogIn.sendKeys(ConfigurationReader.getProperty("email"));
        passwordLogIn.sendKeys(ConfigurationReader.getProperty("password"));
        signInButton.click();
    }
}
