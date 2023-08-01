package com.stackToDo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyTasksPage extends DashBoard {
    @FindBy(id = "navbarDropdownPages")
    public WebElement tasks;

    @FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']/a[1]")
    public WebElement addTask;

    @FindBy(id = "task")
    public WebElement taskInput;

    @FindBy(id = "submit")
    public WebElement saveTask;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> allTasks;

    @FindBy(xpath = "//tbody//tr//a[.='Delete']")
    public WebElement deleteButton;

    public void deleteTask(int clicks) {

        if (clicks >= 2) {
            while (allTasks.size() != 1) {

                deleteButton.click();
            }
        } else {
            deleteButton.click();
        }
    }

    public void createTask() {
        tasks.click();
        addTask.click();
        taskInput.sendKeys("Creating tasks..");
        saveTask.click();

    }
}
