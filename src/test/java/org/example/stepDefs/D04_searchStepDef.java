package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.example.pages.P04_search;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D04_searchStepDef {
    P04_search search = new P04_search();


    @When("when user go to search field and type {string}")
    public void whenUserGoToSearchFieldAndType(String bar) {
        search.searchBar.sendKeys(bar);

    }

    @And("user click on search field")
    public void userClickOnSearchField() {
        search.clickSearch.click();
    }

    @Then("the page containing product appears")
    public void thePageContainingProductAppears() {
        SoftAssert soft4 = new SoftAssert();
        //1- get Url and verify it contains "https://demo.nopcommerce.com/search?q"
        soft4.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q"));
        soft4.assertAll();
    }

    //2-2.2- Create for loop and verify each result contains the search word
    //You should use toLowerCase() method
    @And("the search contains the {string}")
    public void theSearchContainsThe(String arg0) {
        for (int i = 0; i < search.twenty.size(); i++) {
            Assert.assertTrue(search.twenty.get(i).getText().toLowerCase().contains(arg0));
        }
    }

    @And("user click on search field dynamic")
    public void userClickOnSearchFieldDynamic() throws InterruptedException {
        Thread.sleep(2000);
        search.outLine2.get(0).click();
    }


    @Then("the page containing the sku appears with the {string} in it")
    public void thePageContainingTheSkuAppearsWithTheInIt(String arg0) {
        SoftAssert soft42 = new SoftAssert();

        // Verify it contains the sku that you are using in search"
        soft42.assertTrue(search.sku.getText().contains(arg0), "Error message does not contain expected text.");
    }
}
