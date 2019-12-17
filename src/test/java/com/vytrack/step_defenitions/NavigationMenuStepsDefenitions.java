package com.vytrack.step_defenitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepsDefenitions {
    @When("user navigates to Fleet module, Vehicle sub-module")
    public void user_navigates_to_Fleet_module_Vehicle_sub_module() {
        System.out.println("user navigates to Fleet module, Vehicle sub-module");
    }

    @When("user navigates to Marketing  module, Campaigns sub-module")
    public void user_navigates_to_Marketing_module_Campaigns_sub_module() {
        System.out.println("user navigates to Marketing  module, Campaigns sub-module");
    }

    @When("user navigates to Activities module, Calendar sub-module")
    public void user_navigates_to_Activities_module_Calendar_sub_module() {
        System.out.println("user navigates to Activities module, Calendar sub-module");
    }

    @Then("the url should be https:\\/\\/qa{int}.vytrack.com\\/entity\\/Extend_Entity_Carreservation")
    public void the_url_should_be_https_qa_vytrack_com_entity_Extend_Entity_Carreservation(Integer int1) {
        System.out.println("the url should be https://qa3.vytrack.com/entity/Extend_Entity_Carreservation");
    }

    @Then("the url should be https:\\/\\/qa{int}.vytrack.com\\/campaign")
    public void the_url_should_be_https_qa_vytrack_com_campaign(Integer int1) {
        System.out.println("the url should be https://qa3.vytrack.com/campaign");
    }

    @Then("the url should be  https:\\/\\/qa{int}.vytrack.com\\/calendar\\/event")
    public void the_url_should_be_https_qa_vytrack_com_calendar_event(Integer int1) {
        System.out.println("the url should be https://qa3.vytrack.com/calendar/event");
    }

}
