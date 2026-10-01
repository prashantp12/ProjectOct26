package com.projectoct26.utils;

import com.projectoct26.config.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public final class WaitUtils {

    private WaitUtils() {
    }

    public static WebDriverWait getWait(WebDriver driver) {
        return new WebDriverWait(
                driver,
                Duration.ofSeconds(Long.parseLong(ConfigReader.get("explicitWaitSeconds")))
        );
    }

    public static WebElement waitForVisibility(WebDriver driver, By locator) {
        return getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickable(WebDriver driver, By locator) {
        return getWait(driver).until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static boolean waitForUrlContains(WebDriver driver, String value) {
        return getWait(driver).until(ExpectedConditions.urlContains(value));
    }
}
