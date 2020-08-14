package uk.co.natoora.cucumber.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import uk.co.natoora.pages.HomePage;

public class EventsSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {

    }

    @And("^I click on community link$")
    public void iClickOnCommunityLink() {
        new HomePage().clickOnCommunityTab();
    }

    @And("^I click on  events$")
    public void iClickOnEvents() {
        new HomePage().clickOnEventsLink();
    }

    @Then("^I should see events page$")
    public void iShouldSeeEventsPage() {
    }


}
