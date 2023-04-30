package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.example.pages.P05_hover;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Locale;

import static org.example.stepDefs.Hooks.driver;

public class D05_hoverStepDef {
    P05_hover hover = new P05_hover();

    @Given("Hover on one of the three main categories")
    public void userHover() throws InterruptedException {
        //1- Create object from Actions class in selenium
        Actions action = new Actions(driver);

        //2- Select random profile, get their size then hover on one of them
        // I'm going to select random value from 0 to 2 that's why  max = count-1
        int count = hover.hovering.size();
        int min = 0;
        int max = 2;
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int min1 = 0;
        int max1 = count - 1;
        int selectedCat = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(selectedCat);
        action.moveToElement(hover.hovering.get(selectedCat)).perform();
        Thread.sleep(2000);

    }

    @When("the three sub-categories appear select one of them and get the text")
    public void theSubCategoriesAppearSelectOneOfThemAndGetTheText() throws InterruptedException {
        Actions action1 = new Actions(driver);
        int count = hover.hoveringSub.size();
        int min = 0;
        int max = 2;
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int min1 = 0;
        int max1 = count - 1;
        int selectedCat = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(selectedCat);
        action1.moveToElement(hover.hoveringSub.get(selectedCat)).perform();
        Thread.sleep(2000);
        hover.hoveringSub.get(selectedCat).click();
    }

    @Then("after opening sub-category page, you need to get text of the page title")
    public void afterOpeningSubCategoryPageYouNeedToGetTextOfThePageTitle() {
    }
}