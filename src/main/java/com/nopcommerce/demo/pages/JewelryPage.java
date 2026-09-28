package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class JewelryPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(linkText = "//li[@class='inactive']//a[normalize-space()='Jewelry']")
    WebElement JewelryLink;

    @CacheLookup
    @FindBy(linkText =  "//h1[normalize-space()='Jewelry']")
    WebElement JewelryPageText;

    public void clickOnJewelryLink() {
        clickOnElement(JewelryLink);
        log.info("Clicking on Jewelry link : " + JewelryLink.toString());
    }

    public String getJewelryPageText(){
        String JewelryText = getTextFromElement(JewelryPageText);
        log.info("Jewelry page text: " + JewelryPageText.toString());
        return JewelryText;

    }

    }
}
