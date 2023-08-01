package com.stackToDo.pages;

import com.stackToDo.utilities.ConfigurationReader;
import com.stackToDo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {
    public DashBoard() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//div[@id='menu']//a)[1]")
    public WebElement signUpButton;

    @FindBy(xpath = "(//div[@id='menu']//a)[2]")
    public WebElement loginButton;

    @FindBy(xpath = "(//div[@id='menu']//a)[3]")
    public WebElement calendarButton;

    @FindBy(xpath = "//h2[.='Coming soon!']")
    public WebElement message;

    @FindBy(xpath = "(//div[@id='menu']//a)[4]")
    public WebElement integrationButton;

    @FindBy(xpath = "(//div[@id='menu']//a)[5]")
    public WebElement faqButton;

    public static void  clickMenuByText(String text){
        String locator = "(//a[contains(.,'"+text+"')])";
        WebElement element = Driver.getDriver().findElement(By.xpath(locator));
        element.click();
    }


}
