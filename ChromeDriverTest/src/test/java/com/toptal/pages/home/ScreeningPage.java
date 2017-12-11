package com.toptal.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ScreeningPage extends ProvideDetailsPage {
    public ScreeningPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className="is-notice")
    private WebElement successfullySubmitted;

    @FindBy(className = "blog_post-clients")
    private WebElement clientsList;

    @FindBy(xpath="//a[contains( text(),'Toptal Freelance')]")
    private WebElement linkForTap;

    public boolean isClientsListExist() {return clientsList.isDisplayed(); }

    public DesignersPage openDesignersPage() {
        Actions actions = new Actions(driver);
        actions
                .click(linkForTap)
                .build()
                .perform();
        return new DesignersPage(driver);
    }

}
