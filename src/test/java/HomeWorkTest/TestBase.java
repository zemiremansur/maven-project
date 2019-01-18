package HomeWorkTest;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static Faker faker;


    @BeforeClass
    public void beforeAllTests() {


    }

    @AfterClass
    public void afterAllTests() {

    }

    @BeforeMethod
    public void beforeEachTest() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        faker = new Faker();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);


    }

    @AfterMethod
    public void afterEachTest() throws InterruptedException {


//        try{
//
//            Thread.sleep(5000);
//        }catch{
//
//
//        }
//
//




        if (driver != null) {

            driver.quit();
        }
    }

}