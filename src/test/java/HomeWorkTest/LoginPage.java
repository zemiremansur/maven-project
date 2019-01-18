package HomeWorkTest;

import com.sun.deploy.security.CredentialInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.security.krb5.Credentials;

public class LoginPage extends TestBase{

    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    WebElement homePageSingBtn;

    @FindBy(xpath = "//input[@id='email']")
    WebElement email;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement password;

    @FindBy(xpath = "//button[@id='SubmitLogin']//span")
    WebElement singinBtn;


    public void login() {

        driver.get("http://automationpractice.com/index.php");
        homePageSingBtn.click();
        email.sendKeys(Credential.getUserName());
        password.sendKeys(Credential.getPassword());
        singinBtn.click();



    }

}



