package com.carsguide.steps;

import com.carsguide.pages.CarSearchPage;
import com.carsguide.pages.HomePage;
import com.carsguide.pages.ResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CarSearchSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }


    @When("^I mouse hover on 'buy\\+sell' tab$")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHoverOnBuySellTab();
    }

    @And("^I click 'Search Cars' link$")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnSearchCarsLink();
    }

    @And("^I click 'Used' used car link$")
    public void iClickUsedUsedCarLink() {
        new HomePage().clickOnUsedCarLink();
    }


    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) {
        new CarSearchPage().selectMake(make);

    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) {
        new CarSearchPage().selectModel(model);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) {
        new CarSearchPage().selectLocation(location);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) {
        new CarSearchPage().selectPrice(price);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new CarSearchPage().clickOnFindMyNextCarButton();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String text) {
        Assert.assertTrue("Not naviagate to result page", new ResultPage().getMakeText().contains(text));
    }

    @Then("^I navigate to \"([^\"]*)\" page$")
    public void iNavigateToPage(String headerMessage) {
        Assert.assertEquals("Not navigate to buy car page", headerMessage, new CarSearchPage().getNewAndUsedCarText().replace("&", "and").substring(0, 23));
    }


    @Then("^I navigate to \"([^\"]*)\" used car page$")
    public void iNavigateToUsedCarPage(String usedCarText) {
        System.out.println(new CarSearchPage().getUsedCarText());
        Assert.assertEquals("Not navigate to used car page", usedCarText, new CarSearchPage().getUsedCarText());
    }


}