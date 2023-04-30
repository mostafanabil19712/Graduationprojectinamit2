package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class P04_search {
    public P04_search(){ PageFactory.initElements(driver, this);}
    @FindBy(id="small-searchterms")
    public WebElement searchBar;

    @FindBy(className = "button-1")
    public WebElement clickSearch;

    @FindBy(xpath = "//*[@id=\"ui-id-1\"]/li")
    public List<WebElement> twenty;



    //scenario outline 2 from feature 4
    @FindBy(css = "li[class=\"ui-menu-item\"]")
    public  List<WebElement> outLine2;

    @FindBy(className="value")
    public WebElement sku;
}
