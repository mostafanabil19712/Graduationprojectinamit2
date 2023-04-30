package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P08_whishlist;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class D08_whishlistStepDef {
    P08_whishlist whish = new P08_whishlist();


    @When("pressing on whishList on HTC One M Android L Lollipop")
    public void pressingOnWhishListOnHTCOneMAndroidLLollipop() {
        whish.alb.click();
    }

    @Then("Success msg appears green")
    public void successMsgAppearsGreen() {
        SoftAssert soft = new SoftAssert();
        //1- get text and verify it contains "The product has been added to your wishlist"
        soft.assertTrue(whish.sucmsg.getText().contains("The product has been added to your wishlist"));

        //2- get css value and verify color is green rgba(75, 176, 122, 1)

        String backgroundColor = whish.backgroundColor.getCssValue("background-color");
        soft.assertEquals(backgroundColor, "rgba(75, 176, 122, 1)", "Background color is not green");

        soft.assertAll();
    }

    @And("wait until this success message with green color to disappear then click on Wishlist Tab")
    public void waitUntilThisSuccessMessageWithGreenColorToDisappearThenClickOnWishlistTab() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class=\"bar-notification success\"]")));
    }

    @Then("the quantity is bigger than zero")
    public void theQuantityIsBiggerThanZero() {
        whish.whishlistbutton.click();
        whish.quty.getAttribute("value");
        int qtyInt = Integer.parseInt(whish.quty.getAttribute("value"));
        assert qtyInt > 0 : "Value attribute is not greater than 0";

    }

}