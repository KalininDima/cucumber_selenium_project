package com.vytrack.step_defenitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.ls.LSOutput;

public class LoginStepDefs {


    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login(){
        System.out.println("Verifying that user is logged in");
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Dashboard", actualTitle);
    }

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Opening the login page");
        //Driver.get() --> this gets the WebDriver
        //Driver.get() === driver
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }
    @When("the users enters the driver information")
    public void the_users_enters_the_driver_information() {
        System.out.println("enters the driver info");
        String dUsername = ConfigurationReader.get("driver_username");
        String dPassword = ConfigurationReader.get("driver_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(dUsername,dPassword);
    }

    @When("the users enters the sales manager information")
    public void the_users_enters_the_manager_information() {
        System.out.println("Enter sales manager info");
        LoginPage loginPage= new LoginPage();
        String salesUsername = ConfigurationReader.get("sales_manager_username");
        String salesPassword = ConfigurationReader.get("sales_manager_password");
        loginPage.login(salesUsername,salesPassword);

    }
    @When("the users enters the store manager information")
    public void the_users_enters_the_store_manager_information() {
        System.out.println("Enter the store manager info");
        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigurationReader.get("store_manager_username"), ConfigurationReader.get("store_manager_password"));
    }
}