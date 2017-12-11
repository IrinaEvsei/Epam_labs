package com.toptal.tests.login;

import com.toptal.pages.home.DesignersPage;
import com.toptal.pages.home.ProvideDetailsPage;
import com.toptal.pages.home.ScreeningPage;
import com.toptal.pages.login.LoginPage;
import com.toptal.pages.home.HomePage;
import com.toptal.tests.FunctionalTest;
import org.testng.annotations.Test;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

public class LoginTest extends FunctionalTest {

    private static final String PATH = "https://www.toptal.com/users/login";
    private static final String USER_VALID_EMAIL = "Sabinka1999@yandex.ru";
    private static final String USER_VALID_PASSWORD = "test09";
    private static final String USER_UNVALID_EMAIL = "lalala@mail.ru";
    private static final String LOGINFAILED_EXPECTED_MASSAGE = "Invalid email or password.";
    private static final String LOGIN_EXPECTED_MASSAGE = "Welcome to the Toptal Onboarding Process";

    private static final String FULL_LEGAL_NAME = "Irina";
    private static final String COUNTRY = "Belarus";
    private static final String ABOUT_ME = "Lab_5 QA . Set off please.";
    private static final String CITIZENSHIP = "Belarus";
    private static final String EXPECTED_TITLE = "Hire the World's Best Designers";
    private static final String SKILLS = "UI Design";
    private static final String SEE_INTERVIEW = "essential UI Design interview questions.";
    private static final String SKILLS_TXT_HINT = "UI DesignerAdobe Photoshop+5 more";

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

    @Test (priority = 2)
    public void provideDetails(){

        ProvideDetailsPage provideDetailsPage = new ProvideDetailsPage(driver);
        provideDetailsPage.enterData(FULL_LEGAL_NAME, ABOUT_ME);
        provideDetailsPage.fieldIsFilled(COUNTRY,CITIZENSHIP,SKILLS);
        provideDetailsPage.pagesubmit();
    }

    @Test(priority = 3)
    public void screeningPage(){
        ScreeningPage screeningPage = new ScreeningPage(driver);
        assertTrue(screeningPage.isClientsListExist());
    }

    @Test(priority = 4)
    public void screeningPageFirstTest(){
        DesignersPage designersPage = new DesignersPage(driver);
        assertTrue(designersPage.isGuidExist());
        assertEquals(designersPage.seeInterview(),SEE_INTERVIEW);
        assertTrue(designersPage.linkedinLink());
    }

    @Test(priority = 5)
    public void screeningPageSecondTest(){
        DesignersPage designersPage = new DesignersPage(driver);
        assertEquals(designersPage.isSkillsTxtHintExist(),SKILLS_TXT_HINT);

    }

    @Test (priority = 6)
    public void screeningPageThirdTest() {
        DesignersPage designersPage = new DesignersPage(driver);
        if (designersPage.isLabelExist()) {
            designersPage.openFinishPage();
            assertEquals(EXPECTED_TITLE, designersPage.getTitle());
        }
    }

}
