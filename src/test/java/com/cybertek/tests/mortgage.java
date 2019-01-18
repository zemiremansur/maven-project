package com.cybertek.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class mortgage extends HelpMe {

    @Test
    public void mortgagecalculator() throws InterruptedException {

        driver.get("https://www.mortgagecalculator.org/");
        Thread.sleep(500);

        //Home value text box
        HelpMe.enterMessage(By.id("homeval"),"500000");
        Thread.sleep(500);

        //downpayment
        HelpMe.enterMessage(By.id("downpayment"),"100000");
        Thread.sleep(500);
        //Interest rate
        HelpMe.enterMessage(By.id("intrstsrate"),"5.5");
        Thread.sleep(500);
        //Loan term
        HelpMe.enterMessage(By.id("loanterm"), "15");
        Thread.sleep(500);
        //start month
        HelpMe.selectDropDownByIndex(By.name("param[start_month]"),7);
        Thread.sleep(500);
        //start year
        HelpMe.enterMessage(By.id("start_year"),"2018");
        Thread.sleep(500);
        //property tax
        HelpMe.enterMessage(By.id("pptytax"),"3000");
        Thread.sleep(500);
        //private mortgage insurance
        HelpMe.enterMessage(By.id("pmi"),"1");
        Thread.sleep(500);
        //Home insurance
        HelpMe.enterMessage(By.id("hoi"),"1500");
        Thread.sleep(500);
        //click calculate btn
        HelpMe.clickBtn(By.name("cal"));

        Thread.sleep(5000);
    }
}