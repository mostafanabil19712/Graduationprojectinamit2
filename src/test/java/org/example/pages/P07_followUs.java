package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class P07_followUs {
    public P07_followUs() {
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy(css = "a[href=\"http://www.facebook.com/nopCommerce\"]")
    public WebElement face;

    @FindBy(css = "a[href=\"https://twitter.com/nopCommerce\"]")
    public WebElement twit;

    @FindBy(css = "a[href=\"/news/rss/1\"]")
    public WebElement news;

    @FindBy(css = "a[href=\"http://www.youtube.com/user/nopCommerce\"]")
    public WebElement youTube;
}
