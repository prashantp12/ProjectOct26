package com.projectoct26.pages;

import com.projectoct26.utils.WaitUtils;
import org.openqa.selenium.By;

public class DashboardPage extends BasePage {

    private final By dashboardHeading = By.xpath("//h6[normalize-space()='Dashboard']");
    private final By adminButton = By.xpath("//span[text()='Admin']//ancestor::li[@class='oxd-main-menu-item-wrapper']");
    private final By adminPageHeading = By.xpath("//h6[normalize-space()='Admin']");

    public boolean isDashboardDisplayed() {
        WaitUtils.waitForUrlContains(driver, "/dashboard");
        return WaitUtils.waitForVisibility(driver, dashboardHeading).isDisplayed();
    }

    public boolean isAdminPageDisplayed() {
        click(adminButton);
        WaitUtils.waitForUrlContains(driver, "/admin");
        return WaitUtils.waitForVisibility(driver, adminPageHeading).isDisplayed();
    }


    public String getDashboardHeading() {
        return WaitUtils.waitForVisibility(driver, dashboardHeading).getText();
    }
}
