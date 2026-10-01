package com.projectoct26.pages;

import com.projectoct26.config.ConfigReader;
import com.projectoct26.utils.WaitUtils;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private final By usernameInput = By.name("username");
    private final By passwordInput = By.name("password");
    private final By loginButton = By.cssSelector("button[type='submit']");
    private final By loginPanel = By.cssSelector(".orangehrm-login-form");

    public LoginPage open() {
        driver.get(ConfigReader.get("baseUrl"));
        WaitUtils.waitForVisibility(driver, loginPanel);
        return this;
    }

    public DashboardPage loginAsConfiguredUser() {
        type(usernameInput, ConfigReader.get("username"));
        type(passwordInput, ConfigReader.get("password"));
        click(loginButton);
        return new DashboardPage();
    }

    public LoginPage login(String username, String password) {
        type(usernameInput, username);
        type(passwordInput, password);
        click(loginButton);
        return this;
    }

    public boolean isLoginPageDisplayed() {
        return WaitUtils.waitForVisibility(driver, loginPanel).isDisplayed();
    }
}
