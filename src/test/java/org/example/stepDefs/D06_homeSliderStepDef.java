package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P06_homeSlider;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D06_homeSliderStepDef {

    P06_homeSlider homeslider = new P06_homeSlider();

    @When("click on first slider")
    public void clickOnFirstSlider() {
        homeslider.slid.click();
    }

    @Then("direct user to the url of iphone")
    public void directUserToThisUrlHttpsDemoNopcommerceComIphone() {
        SoftAssert soft6 = new SoftAssert();
        soft6.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/iphone-6"));
        soft6.assertAll();
    }

    @When("click on second slider")
    public void clickOnSecondSlider() {
    }

}
