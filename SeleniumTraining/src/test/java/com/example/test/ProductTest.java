package com.example.test;

import com.example.driver.BaseTest;
import com.example.page.LoginPage;
import com.example.page.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void productTest(){              // Oyuncak searched > scrollDown to the 7.element > addFavorites 4 elements and checked

        LoginPage loginPage = new LoginPage();
        loginPage.login();
        loginPage.assertHomePage();

        ProductPage productPage = new ProductPage();
        productPage.scrollAndSelect();
        productPage.backhome();
    }

}
