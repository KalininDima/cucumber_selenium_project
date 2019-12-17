package com.vytrack.step_defenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Opening the login page");
    }
    @When("the users enters the driver information")
    public void the_users_enters_the_driver_information() {
        System.out.println("enters the driver info");
    }
    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("driver must be able to login");
    }
    @When("the users enters the sales manager information")
    public void the_users_enters_the_manager_information() {
        System.out.println("Enter the sales manager info");
    }
    @When("the users enters the store manager information")
    public void the_users_enters_the_store_manager_information() {
        System.out.println("Enter the store manager info");
    }
}