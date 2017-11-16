package com.toptal.tests.login;

import com.toptal.pages.login.LoginPage;
import com.toptal.pages.home.HomePage;
import com.toptal.tests.FunctionalTest;
import org.testng.annotations.Test;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

public class LoginTest extends FunctionalTest {

    @Test(priority = 0)
    public void loginFailed(){
        driver.get("https://www.toptal.com/users/login");

        LoginPage loginPage = new LoginPage(driver);
        assertTrue(loginPage.isInitialized());

        loginPage.enterName("lalala@mail.ru", "Test09");

        loginPage.submit();
        assertTrue(loginPage.isNotifictionEnable());

        assertEquals("Invalid email or password.", loginPage.getNotificationMassage());
    }

    @Test (priority = 1)
    public void login(){
        driver.get("https://www.toptal.com/users/login");

        LoginPage loginPage = new LoginPage(driver);
        assertTrue(loginPage.isInitialized());

        loginPage.enterName("irinaevsei@mail.ru", "Test09");

        HomePage homePage = loginPage.submit();
        assertTrue(homePage.isPageOpened());

        assertEquals("Welcome to the Toptal Onboarding Process", homePage.confirmationTitle());
    }

}