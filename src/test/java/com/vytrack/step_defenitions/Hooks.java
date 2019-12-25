package com.vytrack.step_defenitions;


import com.vytrack.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

   @Before
    public void setUp(){
        System.out.println("\tThis is runner before scenario");
    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println("This is runner after scenario\n ");
        if(scenario.isFailed()){
            final byte [] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }
        Driver.closeDriver();
    }

    @After("@sales_manager")
    public void teardownSalesManager(){
        System.out.println("This is runner after scenario only for @sales_manager tag");
    }

}
