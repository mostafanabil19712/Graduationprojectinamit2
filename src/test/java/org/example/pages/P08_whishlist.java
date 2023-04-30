package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P08_whishlist {
    public P08_whishlist() {
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]")
    public WebElement alb;

    @FindBy(css = "p[class=\"content\"]")
    public WebElement sucmsg;

    @FindBy(css = "div[class=\"bar-notification success\"]")
    public WebElement backgroundColor;

    @FindBy(css = "a[href=\"/wishlist\"]")
    public WebElement whishlistbutton;

    @FindBy(className = "qty-input")
    public WebElement quty;

}
