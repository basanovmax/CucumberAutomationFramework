package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;

public class HomePage extends BasePage {

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement item1;

    @FindBy(xpath = "//a[@class = 'shopping_cart_link']")
    WebElement cart;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement filter;

    @FindBy(id = "react-burger-menu-btn")
    WebElement burgerIcon;

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutLink;

    public void clickOnAddToCartBtnOfFirstProduct() {
        item1.click();
    }

    public void clickOnCartIcon() {
        cart.click();
    }

    public void verifyHomePage() {
        Assert.assertTrue(cart.isDisplayed());
        Assert.assertTrue(filter.isDisplayed());
    }

    public void clickOnHamburgerIcon() {
        burgerIcon.click();
    }

    public void clickOnLogoutLink() {
        logoutLink.click();
    }
}
