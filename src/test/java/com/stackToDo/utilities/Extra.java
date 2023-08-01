package com.stackToDo.utilities;

import org.openqa.selenium.By;

public class Extra {

    public static void LogOut() {
        Driver.getDriver().findElement(By.xpath("(//a[@id='navbarDropdownPages'])[2]"))
                .click();

        Driver.getDriver().findElement(By.xpath("//a[.='Logout']")).click();
    }
}
