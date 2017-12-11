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

    @FindBy(id="hiring-guide")
    private WebElement guid;

    @FindBy(xpath = "//a[contains( text(),'essential UI Design interview questions.')]")
    private WebElement interview;

    @FindBy(xpath = "//*[@id=\"top\"]/div[1]/div/div/header/div/h1")
    private WebElement titleText;

    @FindBy(className = "skill_talent_item-skills")
    private WebElement youngSkillList;

    @FindBy(className = "skill_talent_item-photo_hint")
    private WebElement skillsPhotoHint;

    @FindBy(className = "skill_signup-button_label")
    private WebElement signupLabel;

    @FindBy(xpath = "//*[@id=\"top\"]/div[1]/main/div/div[1]/header/div/div/div[3]/a")
    private WebElement reviewsLink;

    @FindBy(xpath = "//a[contains( text(), 'LinkedIn')]")
    private WebElement linkedinLink;

    public boolean isGuidExist(){ return guid.isDisplayed();}

    public String seeInterview(){ return interview.getText();}

    public String isSkillsTxtHintExist() { return youngSkillList.getText();}

    public boolean linkedinLink() {return linkedinLink.isDisplayed();}

    public String getTitle() {
        return titleText.getText();
    }

    public boolean isLabelExist(){return signupLabel.isDisplayed();}

    public void openFinishPage() {
        reviewsLink.click();
    }

}
