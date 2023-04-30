package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class D02_loginStepDefs {
    P02_login login = new P02_login();
    @Given("user go to login page")
    public void userGoToLoginPage() {
        login.logintoWebSite.click();
    }

    @When("user login with {string} and {string}")
    public void userLoginWithAnd(String mail, String pass) {
        login.mailLogin.sendKeys(mail);
        login.passLogin.sendKeys(pass);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.loginButton.click();
    }

        @Then("user login to the system successfully")
        public void userLoginToTheSystemSuccessfully() {
            // Initialize soft assert object
                SoftAssert softAssert = new SoftAssert();
                String expectedUrl = "https://demo.nopcommerce.com/";
                String actualUrl = driver.getCurrentUrl();
                softAssert.assertEquals(actualUrl, expectedUrl, "Current URL is not as expected");
                softAssert.assertTrue(login.myAccount.isDisplayed(), "My Account tab is not displayed");
            // Call assertAll() to ensure all soft assertions are executed
                softAssert.assertAll();
        }


    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {

        // Initialize soft assert object
        SoftAssert softAssert1 = new SoftAssert();

        // Verify error message contains "Login was unsuccessful."
        softAssert1.assertTrue(login.errorrrr.getText().contains("Login was unsuccessful"), "Error message does not contain expected text.");

        // Verify color of error message is red
       String expectedColor = "#e4434b";
       String actualColor = login.errorrrr.getCssValue("color");
       softAssert1.assertEquals(Color.fromString(actualColor).asHex(), expectedColor, "Error message color is not as expected.");

        // Call assertAll() to ensure all soft assertions are executed
        softAssert1.assertAll();
    }
}
