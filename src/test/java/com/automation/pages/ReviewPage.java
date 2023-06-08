package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewPage extends BasePage {

    @FindBy(id = "finish")
    WebElement finish;

    @FindBy(xpath = "//div[contains(@class, 'summary_total_label')]")
    WebElement total;

    public void printReviewPageDetails() {
        System.out.println(total.getText());
    }

    public void clickOnFinish() {
        finish.click();
    }
}
