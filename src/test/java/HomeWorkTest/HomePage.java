package HomeWorkTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends TestBase {


    @FindBy(xpath = "//span[contains(text(),'Haha haha')]")
    WebElement topFullName;

    public void homePageInfo() {

        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains("My account"));
        String actualFullName = topFullName.getText();

        //Verify the name on top right corner is displayed
        Assert.assertTrue(topFullName.isDisplayed());

    }
}

