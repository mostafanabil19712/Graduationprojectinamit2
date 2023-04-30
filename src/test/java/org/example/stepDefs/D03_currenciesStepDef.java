package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P03_homePage flos = new P03_homePage();

    @When("Select Euro currency from the dropdown list on the top left of home page")
    public void userSelctEuro() throws InterruptedException {
        Select select3omla = new Select(flos.currencySelect);
        select3omla.selectByVisibleText("Euro");
        Thread.sleep(2000);
    }


    @Then("verify Euro Symbol is shown on the four products displayed in Home page")
    public void verifyEuroSymbolIsShownOnTheFourProductsDisplayedInHomePage() {
        for (int i = 0; i < flos.listOfRaw.size(); i++) {

            Assert.assertTrue(flos.listOfRaw.get(i).getText().contains("€"));
        }
    }

}
