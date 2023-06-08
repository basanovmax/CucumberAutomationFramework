package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(id = "postal-code")
    WebElement zip;

    @FindBy(id = "continue")
    WebElement continueBtn;

    public void fillShippingDetails() {
        firstName.sendKeys(ConfigReader.getProperty("checkout.firstname"));
        lastName.sendKeys(ConfigReader.getProperty("checkout.lastname"));
        zip.sendKeys(ConfigReader.getProperty("checkout.zipcode"));
    }

    public void clickOnContinueBtn() {
        continueBtn.click();
    }

    public void verifyCheckoutPage() {
        Assert.assertTrue(firstName.isDisplayed());
        Assert.assertTrue(lastName.isDisplayed());
        Assert.assertTrue(zip.isDisplayed());
    }
}
