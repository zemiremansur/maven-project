package com.cybertek.tests;

import com.cybertek.Pages.HomePage;
import com.cybertek.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class LoginTestWithProperties extends TestBase {



    @Test
    public void readPropertyTest(){



    //  String browser = ConfigurationReader.getProperty("url");
        HomePage homePage = new HomePage();
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");

       homePage.login(username,password);


    }

}
