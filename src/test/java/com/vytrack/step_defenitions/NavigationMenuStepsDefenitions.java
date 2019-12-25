package com.vytrack.step_defenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepsDefenitions {

    @When("the user goes to Fleet, Vehicles")
    public void the_user_goes_to_Fleet_Vehicles() {
        System.out.println("opening Fleet, Vehicles");
    }



    @When("the user goes to Marketing, Campaigns")
    public void the_user_goes_to_Marketing_Campaigns() {
        System.out.println("Opening Marketing, Campaigns");
    }



    @When("the user goes to {string} {string}")
    public void the_user_goes_to_Activities_Calendar_Events() {
        System.out.println("Opening Activities, Calendar events");
    }

    @Then("the url should be https:\\/\\/qa{int}.vytrack.com\\/entity\\/Extend_Entity_Carreservation")
    public void the_url_should_be_https_qa_vytrack_com_entity_Extend_Entity_Carreservation(Integer int1) {
        System.out.println("Open fleet, Vehicles");
    }




}
