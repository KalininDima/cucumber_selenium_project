package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json","html:target/default-cucumber-reports"},
        features = "src/test/resources/features",
        glue = "com/vytrack/step_defenitions",
        dryRun = false,
        tags ="@driver"
        //tags = "@driver and @new"  // new syntax
        //tags = "@driver and not @new"  // new syntax
        //tags = "@driver or @new"  // new syntax will run all @driver except @new
        //tags = {"@driver", "@new"} // old syntax same as "and"
        //tags = {"@driver , @new"} // old syntax same as "or"
        //tags = {"@driver", "~@new"} // old syntax will run all @driver except @new
)




/*
Create a new feature file NavigationMenu.feature and write scenarios for the given requirement and test cases.
 Try to reuse scenario steps from previous feature file
Requirement:
Logged in sales managers should be able to navigate to pages using the top menu.
 Once in the expected page, users should see correct page url.
TEST CASES:
1. Menu option: Fleet --> Vehicles
Expected url: https://qa3.vytrack.com/entity/Extend_Entity_Carreservation
2. Menu option: Marketing --> Campaigns
Expected url:https://qa3.vytrack.com/campaign/
3. Menu option: Activities --> Calendar Events
Expected url: https://qa3.vytrack.com/calendar/event
After finishing the scenarios, add necessary tags, run through CukesRunner and generate steps defs.
Copy paste the step definitions from console into new Step Definitions class called NavigationMenuStepDefintions.
 Implement the step definitions by adding print statements.

#OPT+CMD+L
#CTRL+ALT+L

 */


public class CukesRunner {

}
