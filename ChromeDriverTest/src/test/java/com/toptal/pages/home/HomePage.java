package com.toptal.pages.home;

import com.toptal.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "title-text")
    private WebElement heading;

    public boolean isPageOpened() {
        return heading.isDisplayed();
    }

    public String confirmationTitle(){
        return heading.getText();
    }

}
