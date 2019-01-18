package HomeWorkTest;

import HomeWorkTest.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AddressSectionPage  extends TestBase {

    @FindBy(xpath = "//span[contains(text(),'My addresses')]")
    WebElement myAddressBtn;

    @FindBy(xpath = "//a[@title='Add an address']//span")
    WebElement addAddressBtn;

    @FindBy(xpath = "//input[@id='firstname']")
    WebElement firstNameInAddressSection;

    @FindBy(xpath = "//input[@id='lastname']")
    WebElement lastNameInAddressSection;

    @FindBy(xpath = "//span[contains(text(),'Haha haha')]")
    WebElement fullNameOntop;

    @FindBy(xpath = "//button[@id='submitAddress']//span")
    WebElement saveBtn;

    @FindBy(xpath = "//ol//li[1]")
    WebElement firstNameErrorMsg;


    public void addresInfo() {

        //13. Click on My addresses
        myAddressBtn.click();

        //14. Click on Add a new address
        addAddressBtn.click();

        //15. Verify that first name and last name matches the full name on top
        String fullname = firstNameInAddressSection.getAttribute("value") + " " + lastNameInAddressSection.getAttribute("value");

        Assert.assertEquals(fullname, fullNameOntop.getText());

        //16. Delete the first name
        firstNameInAddressSection.clear();

        //17. Click save
        saveBtn.click();

        //18. Verify error message "firstname is required."

        String actualMsg = firstNameErrorMsg.getText();

        String expectedMsg = "firstname is required.";

        Assert.assertEquals(actualMsg, expectedMsg);


    }
}