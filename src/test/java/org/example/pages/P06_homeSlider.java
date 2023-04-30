package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class P06_homeSlider {
    public P06_homeSlider() { PageFactory.initElements(driver, this);}

    @FindBy(className="nivo-imageLink")
    public WebElement slid;

   // @FindBy(css = "a[href=\"#\"]")


}
