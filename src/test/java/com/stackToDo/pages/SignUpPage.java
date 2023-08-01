package com.stackToDo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends DashBoard {

    @FindBy (id ="name")
    public WebElement nameInput;

    @FindBy (id ="email")
    public WebElement emailInput;

    @FindBy (id ="password")
    public WebElement passwordInput;

    @FindBy (id ="agree")
    public WebElement termsCheckbox;

    @FindBy (id ="submit")
    public WebElement submitButton;

}
