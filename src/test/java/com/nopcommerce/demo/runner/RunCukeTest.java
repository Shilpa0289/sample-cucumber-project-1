package com.nopcommerce.demo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Created by Shilpa Patel
 **/
@CucumberOptions(
        features = "src/test/resources/features",   // Package of feature path//
       glue = "com/nopcommerce/demo/steps",         //  Package path   //
        plugin = {"html:target/cucumber-reports/cucumber.html",    //  plugin for generating HTML report//
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //Extent report//
        tags = "@author_Shilpa"
)
public class RunCukeTest extends AbstractTestNGCucumberTests {

}