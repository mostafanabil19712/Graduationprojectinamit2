package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_login {
    public P02_login()
{
    PageFactory.initElements(Hooks.driver,this);
}
    @FindBy(className="ico-login")
    public WebElement logintoWebSite;

    @FindBy(className ="email")
    public WebElement mailLogin;

    @FindBy(className ="password")
    public WebElement passLogin;

    @FindBy(css = "button[class=\"button-1 login-button\"]")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@class='ico-account']")
    public WebElement myAccount;
    @FindBy(className="message-error")
    public WebElement errorrrr;

}
