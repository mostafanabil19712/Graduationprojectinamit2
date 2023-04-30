package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class P05_hover {

    //from here we will start Feature 5

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li")
    public List<WebElement> hovering;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li/ul/li")
    public List<WebElement> hoveringSub;

}
