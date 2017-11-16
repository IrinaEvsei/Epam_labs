package com.toptal.pages.login;

import com.toptal.pages.BasePage;
import com.toptal.pages.home.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id="user_email")
    WebElement useremail;

    @FindBy(id="user_password")
    WebElement userpassword;

    @FindBy(name="commit")
    WebElement login;

    @FindBy(className = "notification-message")
    private WebElement massage;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return useremail.isDisplayed();
    }

    public void enterName(String firstName, String lastName){
        this.useremail.clear();
        this.useremail.sendKeys(firstName);

        this.userpassword.clear();
        this.userpassword.sendKeys(lastName);
    }

    public HomePage submit(){
        login.click();
        return new HomePage(driver);
    }

    public boolean isNotifictionEnable(){return massage.isEnabled(); }
    public String getNotificationMassage() {return  massage.getText();}

}