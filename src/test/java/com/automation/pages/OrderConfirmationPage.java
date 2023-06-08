package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPage extends BasePage {

    @FindBy(id = "checkout_complete_container")
    WebElement confirmation;

    public void verifyConfirmationPageDisplayed() {
        System.out.println(confirmation.getText());
    }

}
