package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.example.pages.P01_register;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepdef {
    P01_register signup = new P01_register();

    @Given("user go to registration page")
    public void usergotoregistrationpage() {
        signup.registerLink.click();
        //signup.registerLink().click();
    }

    @When("user select gender type")
    public void userSelectGenderType() {
        signup.male.click();
    }

    @And("user enter {string} and {string}")
    public void userEnterAnd(String firstname, String lastname) {
        signup.firstnamewriting.sendKeys(firstname);
        signup.lastnamewriting.sendKeys(lastname);
    }

    @And("user select date of birth")
    public void userSelectDateOfBirth() {
        //selectDay
        Select selectDay = new Select(signup.dayList);
        selectDay.selectByValue("6");

        //selectMonth
        Select selectMonth = new Select(signup.monthList);
        selectMonth.selectByVisibleText("February");

        //selectYear
        Select selectYear = new Select(signup.yearList);
        selectYear.selectByIndex(9);

    }

    @And("user enter {string}")
    public void userEnter(String mail) {
        signup.email.sendKeys(mail);
    }

    @And("user enter {string} password and confirm password")
    public void userEnterPasswordAndConfirmPassword(String pass) {
        signup.password.sendKeys(pass);
        signup.confirmpass.sendKeys(pass);
    }

    @And("user click on register button")
    public void userClickOnRegisterButton() {
        signup.click.click();
    }

    @Then("account is created successfully")
    public void accountIsCreatedSuccessfully() {
        SoftAssert soft = new SoftAssert();
        //1- get text and verify it contains "Your registration completed"
        soft.assertTrue(signup.msg.getText().contains("Your registration completed"));

        //2- get css value and verify color is green #4cb17c
        String actualColor = signup.msg.getCssValue("color");

        soft.assertEquals(Color.fromString(actualColor).asHex(), "#4cb17c");


        soft.assertAll();
    }
}
