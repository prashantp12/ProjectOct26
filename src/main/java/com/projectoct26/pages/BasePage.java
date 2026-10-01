package com.projectoct26.pages;

import com.projectoct26.driver.DriverFactory;
import com.projectoct26.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected final WebDriver driver;

    protected BasePage() {
        this.driver = DriverFactory.getDriver();
    }

    protected void click(By locator) {
        WaitUtils.waitForClickable(driver, locator).click();
    }

    protected void type(By locator, String text) {
        WaitUtils.waitForVisibility(driver, locator).clear();
        WaitUtils.waitForVisibility(driver, locator).sendKeys(text);
    }

    protected String getText(By locator) {
        return WaitUtils.waitForVisibility(driver, locator).getText();
    }
}
