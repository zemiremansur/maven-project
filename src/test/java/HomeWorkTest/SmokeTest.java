package HomeWorkTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SmokeTest extends TestBase {


    @Test(priority = 1)
    public void homework() {

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login();

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.homePageInfo();

        PersonalPage personalPage = PageFactory.initElements(driver, PersonalPage.class);
        personalPage.verifyPersoalPage();

        AddressSectionPage addressSectionPage = PageFactory.initElements(driver, AddressSectionPage.class);
        addressSectionPage.addresInfo();


    }

}





