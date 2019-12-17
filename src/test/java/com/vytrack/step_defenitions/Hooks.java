package com.vytrack.step_defenitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

   @Before
    public void setUp(){
        System.out.println("\tThis is runner before scenario");
    }

    @After
    public void tearDown(){
        System.out.println("This is runner after scenario\n ");
    }

    @After("@sales_manager")
    public void teardownSalesManager(){
        System.out.println("This is runner after scenario only for @sales_manager tag");
    }

}
