package com.toptal.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ScreeningPage extends ProvideDetailsPage {
    public ScreeningPage(WebDriver driver) {
        super(driver);
    }
//You have successfully submitted account details.

    @FindBy(className="is-notice")
    private WebElement successfullySubmitted;

    @FindBy(xpath="//a[contains( text(),'Toptal Freelance')]")
    private WebElement linkForTap;

    public DesignersPage openDesignersPage() {
        Actions actions = new Actions(driver);
        actions
                .click(linkForTap)
                .build()
                .perform();
        return new DesignersPage(driver);
    }

}
