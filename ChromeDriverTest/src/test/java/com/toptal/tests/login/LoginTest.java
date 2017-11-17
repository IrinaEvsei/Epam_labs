package com.toptal.tests.login;

import com.toptal.pages.login.LoginPage;
import com.toptal.pages.home.HomePage;
import com.toptal.tests.FunctionalTest;
import org.testng.annotations.Test;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

public class LoginTest extends FunctionalTest {

    private static final String PATH = "https://www.toptal.com/users/login";
    private static final String USER_VALID_EMAIL = "irinaevsei@mail.ru";
    private static final String USER_VALID_PASSWORD = "Test09";
    private static final String USER_UNVALID_EMAIL = "lalala@mail.ru";
    private static final String LOGINFAILED_EXPECTED_MASSAGE = "Invalid email or password.";
    private static final String LOGIN_EXPECTED_MASSAGE = "Welcome to the Toptal Onboarding Process";

    @Test(priority = 0)
    public void loginFailed(){
        driver.get(PATH);

        LoginPage loginPage = new LoginPage(driver);
        assertTrue(loginPage.isInitialized());

        loginPage.enterName(USER_UNVALID_EMAIL, USER_VALID_PASSWORD);

        loginPage.submit();
        assertTrue(loginPage.isNotifictionEnable());

        assertEquals(LOGINFAILED_EXPECTED_MASSAGE, loginPage.getNotificationMassage());
    }

    @Test (priority = 1)
    public void login(){
        driver.get(PATH);

        LoginPage loginPage = new LoginPage(driver);
        assertTrue(loginPage.isInitialized());

        loginPage.enterName(USER_VALID_EMAIL, USER_VALID_PASSWORD);

        HomePage homePage = loginPage.submit();
        assertTrue(homePage.isPageOpened());

        assertEquals(LOGIN_EXPECTED_MASSAGE, homePage.confirmationTitle());
    }

}