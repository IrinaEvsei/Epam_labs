package com.toptal.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProvideDetailsPage extends HomePage{

    public ProvideDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="talent_skype")
    private WebElement talentSkypeInput;

    @FindBy(id = "talent_legal_name")
    private WebElement fullLegalNameInput;

    @FindBy(id = "talent_country_id")
    private WebElement currentCountrySelect;

    @FindBy(id = "talent_city")
    private WebElement currentCityInput;

    @FindBy(id = "talent_citizenship_id")
    private WebElement citizenshipSelect;

    @FindBy(id = "talent_about")
    private WebElement aboutMeInput;

    @FindBy(id = "talent_primary_skill_id")
    private WebElement skillsSelect;

    @FindBy(id = "talent_resume")
    private WebElement chooseResumInput;

    @FindBy(id = "talent_acknowledge_confidentiality")
    private WebElement asseptedButton;

    @FindBy(className = "js-reg_flow-submit_button")
    private WebElement nextStepButton;

    public void enterData(String fullLegalName,  String aboutMe){
        this.fullLegalNameInput.clear();
        this.fullLegalNameInput.sendKeys(fullLegalName);

        this.aboutMeInput.clear();
        this.aboutMeInput.sendKeys(aboutMe);
    }
    public void fieldIsFilled(String currentCountry, String citizenship, String skills){
        this.currentCountrySelect.getText();
        this.citizenshipSelect.getText();
        this.skillsSelect.getText();
    }

    public ScreeningPage pagesubmit(){
        nextStepButton.click();
        return new ScreeningPage(driver);
    }
}

