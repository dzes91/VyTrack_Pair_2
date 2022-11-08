package com.cydeo.step_def;

import com.cydeo.pages.VyTrackElementsPage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class Id_StepDef {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    VyTrackElementsPage vyTrackElementsPage = new VyTrackElementsPage();

    @Given("user is already logged in to the Home Page")
    public void user_is_already_logged_in_to_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        webTableLoginPage.login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));

    }

    @When("user clicks on the Fleet dropdown")
    public void userClicksOnTheFleetDropdown() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(vyTrackElementsPage.fleetBtn).perform();

        vyTrackElementsPage.vehicleOption.click();
    }

    @And("user clicks on the settings button and select Id option")
    public void userClicksOnTheSettingsButtonAndSelectIdOption() throws InterruptedException {
        vyTrackElementsPage.settingButton.click();
        Thread.sleep(3000);

    }


    @Then("user should see the selected option")
    public void userShouldSeeTheSelectedOption() {
        vyTrackElementsPage.selectId.click();

    }
}
