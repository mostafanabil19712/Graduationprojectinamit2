package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_register {

    //1- constructor (mezto lama agy anady 3la ay method gowa el class dah lazem y7sal running ll constructor el awel)

    public P01_register()
    {
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(className = "ico-register")
    public WebElement registerLink;

    @FindBy(id = "gender-male")
    public WebElement male;

    @FindBy(id = "FirstName")
    public WebElement firstnamewriting;

    @FindBy(id = "LastName")
    public WebElement lastnamewriting;

    @FindBy(name ="DateOfBirthDay")
    public WebElement dayList;

    @FindBy(name ="DateOfBirthMonth")
    public WebElement monthList;

    @FindBy(name = "DateOfBirthYear")
    public WebElement yearList;

    @FindBy(id ="Email")
    public WebElement email;

    @FindBy(id ="Password")
    public WebElement password;

    @FindAll({
            @FindBy(id="ConfirmPassword"),
            @FindBy(name ="ConfirmPassword")
    })
    public WebElement confirmpass;

    @FindBy(name="register-button")
    public WebElement click;

    @FindBy(className="result")
    public WebElement msg;


    /* Another method to implement POM (For studying)
    public WebElement registerLink()
    {
        WebElement register =  Hooks.driver.findElement(By.className("ico-register"));
        return register;
    }
    */

}
