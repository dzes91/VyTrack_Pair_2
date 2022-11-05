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

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a/span")
    public WebElement vehicleOption;

    @FindBy(xpath = "//*[@id=\"bookmark-buttons\"]/div/div/button[1]/i")
    public WebElement vehiclePageStarBtn;

    @FindBy(xpath = "//i[@class='fa-bars']")
    public WebElement dotMenuDropdown;

    @FindBy(xpath = "//*[@id=\"oroplatform-header\"]/div[1]/div/ul/li[2]/a/i")
    public WebElement dropDown;





}
