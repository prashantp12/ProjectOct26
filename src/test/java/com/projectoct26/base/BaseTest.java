package com.projectoct26.base;

import com.projectoct26.driver.DriverFactory;
import com.projectoct26.extensions.ScreenshotExtension;
import com.projectoct26.pages.LoginPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ScreenshotExtension.class)
public abstract class BaseTest {

    @BeforeAll
    static void setUp() {
        DriverFactory.initializeDriver();

        LoginPage loginPage = new LoginPage().open();
        loginPage.loginAsConfiguredUser();
    }

    @AfterAll
    static void tearDown() {
        DriverFactory.quitDriver();
    }
}