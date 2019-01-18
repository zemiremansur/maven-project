package com.cybertek.Pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ListingPage {

    public ListingPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

     @FindBy(xpath = "dghsfgsf")
     public WebElement address;

    @FindBy(xpath = "dghsfgsfsdgsdf")
    public WebElement agent;

    @FindBy(xpath = "dghsfgssehfge")
    public WebElement map;



}








