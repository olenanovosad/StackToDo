package com.stackToDo.pages;

import com.stackToDo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LindaFarrow {

    public LindaFarrow() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    public static void  clickMenuByText(String text){
        String locator = "(//a[contains(.,'"+text+"')])[1]";
        WebElement element = Driver.getDriver().findElement(By.xpath(locator));
        element.click();
    }
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    @FindBy(xpath = "//div[@class='d-none d-lg-block col-lg-8 col-xl-8']//li")
    public List<WebElement> menuOptions;

    @FindBy(xpath = "//div[@class='product-related-colours product-colours active']//li")
    public List<WebElement> frameColours;

    @FindBy(xpath = "//button[@name='add']")
    public WebElement addToBasket;

    @FindBy(id = "bookmarkit")
    public WebElement addWishList;
    @FindBy(xpath = "//div[@class='header-search-icon']")
    public WebElement search;

    @FindBy(xpath = "//div[@class='header-account']/a")
    public WebElement logIn;
    @FindBy(xpath = "//div[@class='header-wishlist d-none d-lg-block']/a")
    public WebElement wishList;

    @FindBy(xpath = "//div[@class='header-basket']/a")
    public WebElement basket;
    @FindBy(xpath = "//div[@class='cart-mini-contents']//a[1]")
    public WebElement editBasket;
    @FindBy(xpath = "//div[@class='cart-mini-contents']//a[2]")
    public WebElement checkout;
    @FindBy(xpath = "//div[@class='header-currency-select d-none d-lg-inline-flex']")
    public WebElement currency;
    @FindBy(xpath = "//div[@class='header-currency-select d-none d-lg-inline-flex']//a")
    public WebElement countries;


}
