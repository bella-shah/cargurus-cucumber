package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarSearchPage extends Utility {
    private static final Logger log = LogManager.getLogger(CarSearchPage.class.getName());

    public CarSearchPage() {
        PageFactory.initElements(driver, this);


    }

    @CacheLookup
    @FindBy(xpath = "//h1[text()='New & Used Car Search - carsguide']")
    WebElement newAndUsedCarText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Used Cars For Sale')]")
    WebElement usedCarText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement makeDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement modelDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement locationDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement priceDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyNextCarButton;

    public String getNewAndUsedCarText(){
        log.info("Getting new and used car text "+newAndUsedCarText.toString());
        return getTextFromElement(newAndUsedCarText);

    }
    public String getUsedCarText(){
        log.info("Getting used car text "+usedCarText.toString());
        return getTextFromElement(usedCarText);
    }

    public void selectMake(String make) {
        selectByVisibleTextFromDropDown(makeDropDown, make);
        log.info("Selecting make  "+make+" from dropdown "+makeDropDown.toString());
    }

    public void selectModel(String model) {
        selectByValueFromDropDown(modelDropDown, model);
        log.info("Selecting model "+model+" from dropdown "+modelDropDown.toString());
    }

    public void selectLocation(String location) {
        selectByVisibleTextFromDropDown(locationDropDown, location);
        log.info("Selecting location "+location+" from dropdown "+locationDropDown.toString());
    }

    public void selectPrice(String price) {
        selectByVisibleTextFromDropDown(priceDropDown, price);
        log.info("Selecting price "+price+" from dropdown "+priceDropDown.toString());
    }


    public void clickOnFindMyNextCarButton() {
        clickOnElement(findMyNextCarButton);
        log.info("Clicking on find my next car btn" + findMyNextCarButton.getText());
    }
}