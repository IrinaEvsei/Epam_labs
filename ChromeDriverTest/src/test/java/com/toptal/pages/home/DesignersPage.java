package com.toptal.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesignersPage extends ScreeningPage {
    private final String BASE_URL = "https://www.toptal.com/designers/ui";

    public DesignersPage(WebDriver driver) {
        super(driver);
        driver.navigate().to(BASE_URL);
    }

    @FindBy(xpath = "//*[@id=\"top\"]/div[1]/div/div/header/div/h1")
    private WebElement titleText;

    @FindBy(xpath = "//*[@id=\"top\"]/div[1]/main/div/div[1]/header/div/div/div[3]/a")
    private WebElement reviewsLink;

    public String getTitle() {
        return titleText.getText();
    }

    public void openFinishPage() {
        reviewsLink.click();
    }
}
