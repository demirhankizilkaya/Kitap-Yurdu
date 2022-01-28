package com.example.test;

import com.example.driver.BaseTest;
import com.example.page.LoginPage;
import com.example.page.Logout;
import org.junit.Test;

public class LogoutTest extends BaseTest {

    @Test
    public void LogoutTest(){

        Logout logout = new Logout();
        logout.logoutTest();
    }


}
