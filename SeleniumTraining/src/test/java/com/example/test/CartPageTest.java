package com.example.test;

import com.example.driver.BaseTest;
import com.example.page.CartPage;
import com.example.page.LoginPage;
import org.junit.Test;

public class CartPageTest extends BaseTest {

    @Test
    public void cartPage(){

        CartPage cartPage =new CartPage();
        cartPage.cartPage();
    }

}
