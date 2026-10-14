package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.JewelryPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class JewelrySteps {

    @When("clickOnJewelryLink()")
    public void clickOnJewelryLink() {
        new JewelryPage().clickOnJewelryLink();
    }


    @Then("I should able to click on the Jewelry link successfully")
    public void iShouldAbleToClickOnTheJewelryLinkSuccessfully() {
        String expectedText = "Jewelry";
        String actualText = new JewelryPage.getJewelryPageText();
        Assert.assertEquals(actualText,expectedText  + "Jewelry Page is not displayed" );
    }
}
