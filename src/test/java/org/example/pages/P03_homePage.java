package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class P03_homePage {
    public P03_homePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "customerCurrency")
    public WebElement currencySelect;

    @FindBy(className = "actual-price")
    public List<WebElement> listOfRaw;

}

