package com.projectoct26.tests;

import com.projectoct26.base.BaseTest;
import com.projectoct26.pages.DashboardPage;
import com.projectoct26.pages.LoginPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    @Tag("smoke")
    @Tag("regression")
    @DisplayName("Verify valid user can log in successfully")
    void verifyValidLogin() {
        DashboardPage dashboardPage = new DashboardPage();

        assertTrue(
                dashboardPage.isDashboardDisplayed(),
                "Dashboard should be displayed after successful login"
        );

        assertEquals(
                "Dashboard",
                dashboardPage.getDashboardHeading(),
                "Dashboard heading should be displayed"
        );
    }

//    @Test
//    void znavigateToAdminPage(){
//       try {
//           Thread.sleep(5000);
//       } catch (InterruptedException e) {
//           throw new RuntimeException(e);
//       }
//        DashboardPage dashboardPage = new DashboardPage();
//        dashboardPage.isAdminPageDisplayed();
//    }

    @Test
    void testCase1(){
        System.out.println("Test case 1");
    }

    @Test
    void testCase2(){
        System.out.println("Test case 2");
    }
}
