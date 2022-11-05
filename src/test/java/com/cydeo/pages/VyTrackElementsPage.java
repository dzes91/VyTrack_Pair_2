package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackElementsPage {

    public VyTrackElementsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[1]/a/span")
    public WebElement fleetBtn;

    @FindBy(xpath = "//i[@class='fa-star hide-text']")
    public WebElement vehiclePageStarBtn;

    @FindBy(xpath = "//i[@class='fa-bars']")
    public WebElement dotMenuDropdown;

}
