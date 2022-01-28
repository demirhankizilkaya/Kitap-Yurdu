package com.example.test;

import com.example.driver.BaseTest;
import com.example.page.LoginPage;
import org.junit.Test;



public class LoginTest extends BaseTest {        // BaseTest kuralları

    @Test
    public void loginTest()                     //Login ve Login Olma Kontrolü
    {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        loginPage.assertHomePage();

    }

}
