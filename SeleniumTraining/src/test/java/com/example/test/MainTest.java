package com.example.test;

import com.example.driver.BaseTest;
import com.example.page.*;
import org.junit.Test;

public class MainTest extends BaseTest {

    @Test
    public void Test() {

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        ProductPage productPage = new ProductPage();
        productPage.scrollAndSelect();
        productPage.backhome();

        PuanCatalog puanCatalog = new PuanCatalog();
        puanCatalog.puanCatalog();

        ListPage listPage =new ListPage();
        listPage.list();

        CartPage cartPage =new CartPage();
        cartPage.cartPage();

        CreditCardAndLogout creditCardAndLogout = new CreditCardAndLogout();
        creditCardAndLogout.creditCardAndLogout();

        Logout logout = new Logout();
        logout.logoutTest();
    }


}

