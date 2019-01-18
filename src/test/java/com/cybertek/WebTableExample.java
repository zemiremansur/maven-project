package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableExample  extends TestBase{
    public void login() {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test" + Keys.ENTER);
    }

    @Test
    public void printWholeTable() {
        login();

        WebElement table = driver.findElement(By.id("ctl00_MainContent_orderGrid"));
        System.out.println(table.getText());
    }

    @Test
    public void printAllHeaders() {
        login();

        List<WebElement> headers =  driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//th"));

        for(WebElement header : headers) {
            System.out.println(header.getText());
        }
    }

    @Test
    public void printAllRows(){

        login();

        List <WebElement> allRows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

        System.out.println("number of rows "+allRows.size());

        for(WebElement header : allRows){
            System.out.println(header.getText());

        }

        System.out.println("======================");
        // print the nth
        System.out.println("printing row "+3);
        System.out.println(allRows.get(2).getText());
    }

    @Test
    public void printTableSize(){
        login();
        List <WebElement> allRows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
        // List<WebElement> cols =  allRows.get(1).findElements(By.tagName("td"));

        List<WebElement>allHeaders=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[1]/th"));
        System.out.println("Size of the table is : " + allRows.size() + " " + allHeaders.size());
    }

    @Test
    public void printRow2(){

        login();
        WebElement row=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[5]"));
        System.out.println(row.getText());
    }

    @Test
    public void  printAllCellsInOneARow(){
        login();
        List<WebElement>cells =driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td"));

        for(WebElement header : cells){
            System.out.println(header.getText());

        }
    }

    @Test
    public void printByCordinates(){
        login();
        WebElement cell =driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[3]/td[3]"));

        System.out.println(cell.getText());
        System.out.println(getCell(3,6).getText());
    }


    //create a methods for calling certain cell
    public WebElement getCell(int row, int col){

        String xPath ="//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+row+"]/td["+col+"]";

        return driver.findElement(By.xpath(xPath));
    }

    @Test
    public void printColumn(){
        login();
        List<WebElement> allNames=driver.findElements(
                By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        for (WebElement header:allNames) {
            System.out.println(header.getText());
        }

    }

    @Test
    public void selectCheckbox(){


        login();
        WebElement checkbox = driver.findElement(By.xpath("//td[.='Susan McLaren']/../td[1]/input"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());

    }


    @Test
    public void test(){
        login();
        int nameIndex=getColumnIndex("Name");
        System.out.println(nameIndex);

        List<WebElement> allnames =driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[3]/" +
                "td["+nameIndex+"]"));

        Boolean found=false;
        for (int i = 0; i <allnames.size() ; i++) {
            if(allnames.get(i).getText().equalsIgnoreCase("Mark Smith")){
                found =true;
                break;
            }

        }
        Assert.assertTrue(found);

    }

    //gets a column as parameters
    public int getColumnIndex(String column){
        List<WebElement> allHeaders=driver.findElements(
                By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[1]/th"));

        for (int i = 0; i <allHeaders.size() ; i++) {
            if(allHeaders.get(i).getText().equals(column)){
                return i+1;
            }

        }

        return allHeaders.indexOf(column);
    }
}