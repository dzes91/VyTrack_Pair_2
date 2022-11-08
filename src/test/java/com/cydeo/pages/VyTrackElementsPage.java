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

    @FindBy(xpath = "//i[@class='fa-cog hide-text']")
    public WebElement settingButton;

    @FindBy(xpath = "//*[@id=\"column-c121\"]")
    public WebElement selectId;






}
