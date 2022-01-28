package com.example.page;

import com.example.methods.Methods;
import org.openqa.selenium.By;

public class Logout {

    Methods methods;

    public Logout() {

        methods = new Methods();
    }

    public void logoutTest(){

        methods.mouseHover(By.cssSelector(".login.menu.top"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".login ul li:nth-of-type(4)"));
        methods.waitBySeconds(4);

    }
}
