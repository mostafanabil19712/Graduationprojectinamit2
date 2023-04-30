package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P07_followUs;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

import static org.example.stepDefs.Hooks.driver;

public class D07_followUsStepDef {
    P07_followUs follow = new P07_followUs();

    @When("user opens facebook link")
    public void userOpensFacebookLink() {
        follow.face.click();
        //1- get window list inside array
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());


        //2- switch from tab 0 to tab 1
        driver.switchTo().window(tabs.get(1));
    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String arg0) {
        Assert.assertTrue(driver.getCurrentUrl().contains(arg0));
    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() {
        follow.twit.click();
        //1- get window list inside array
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());


        //2- switch from tab 0 to tab 1
        driver.switchTo().window(tabs.get(1));
    }

    @When("user opens rss link")
    public void userOpensRssLink() {
        follow.news.click();
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() {
        follow.youTube.click();
        //1- get window list inside array
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());


        //2- switch from tab 0 to tab 1
        driver.switchTo().window(tabs.get(1));
    }
}
