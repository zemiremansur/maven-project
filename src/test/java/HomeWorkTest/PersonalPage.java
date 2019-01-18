package HomeWorkTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class PersonalPage extends TestBase {


    @FindBy(xpath = "//span[contains(text(),'My personal information')]")
    WebElement myPersonalInfoBtn;

    @FindBy(xpath = "//input[@id='firstname']")
    WebElement firstNameinAddress;

    @FindBy(xpath = "//input[@id='lastname']")
    WebElement lastNameinAddress;

    @FindBy(xpath = "//span[contains(text(),'Haha haha')]")
    WebElement fullNameOnTop;

    @FindBy(xpath = "//button[@name='submitIdentity']//span")
    WebElement saveBtn;

    @FindBy(xpath = "//li[contains(text(),'The password you entered is incorrect.')]")
    WebElement redErrorMsg;

    @FindBy(xpath = "//ul[@class='footer_links clearfix']//li[1]//a[1]//span[1]")
    WebElement backToYourAcctountBtn;

    public void verifyPersoalPage() {

        myPersonalInfoBtn.click();

        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains("Identity"));

        //8. Verify that first name and last name matches the full name on top

        String firstName = firstNameinAddress.getAttribute("value");

        String lasttName = lastNameinAddress.getAttribute("value");

        String actualFullName = firstName + " " + lasttName;

        String fullNameOntopStr = fullNameOnTop.getText();

        Assert.assertEquals(actualFullName, fullNameOntopStr);

        saveBtn.click();

        String errorMsg = redErrorMsg.getText();

        Assert.assertEquals(errorMsg, "The password you entered is incorrect.");

        //11. Click on Back to your account
        backToYourAcctountBtn.click();

        String title = driver.getTitle();

        //12. Verify that title contains My account
        Assert.assertTrue(title.contains("My account"));


    }
}

