package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class HomePage extends BasePage {

    @FindBy(xpath = "//button[contains(@id,'add-to-cart')]")
    WebElement item1;

    @FindBy(xpath = "//a[@class = 'shopping_cart_link']")
    WebElement cart;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement filter;

    @FindBy(id = "react-burger-menu-btn")
    WebElement burgerIcon;

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutLink;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement select;


    List <WebElement> priceItems = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));


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

    public void clickOnSortMenu(){
        Select stat = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
        stat.selectByValue("hilo");
    }

    public void verifyPriceHighToLowAtHomePage() {
        List<String> prices = new ArrayList<>();
        for (WebElement price : priceItems) {
            prices.add(price.getText());
        }

        List<String> sortedPrices = new ArrayList<>();
        Collections.sort(sortedPrices);

        if (sortedPrices.equals(prices)){
            Assert.fail("Not is ascending order");
        }

    }

}
