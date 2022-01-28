package com.example.page;

import com.example.methods.Methods;
import org.openqa.selenium.By;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;


public class LoginPage {

    Methods methods;
    Logger logger = LogManager.getLogger();

    public LoginPage() {

        methods = new Methods();
    }

    public void login() {

        methods.click(By.xpath("//div[@class='menu-top-button login']"));           // Giriş Yap butonuna tıkla
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("login-email"), "demirhan92@gmail.com");      // login-email text alanına maili yazdırdık
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("login-password"), "1q2w3e4r5t");                // login-pass text alanına passi yazdırdık
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));  // Giriş Yap butonuna tıklattık
        methods.waitBySeconds(5);
    }

    public void assertHomePage() {
        String url = methods.getUrl();
        methods.assertPage("Login Kontrolü ", "https://www.kitapyurdu.com/index.php?route=account/account", url);
        logger.info("Hesabım Sayfasındasın " + url);
        if(Objects.equals(url, "https://www.kitapyurdu.com/index.php?route=account/account")){
            System.out.println("Giriş Başarılı");
        }else {
            System.out.println("Giriş başarısız");
        }


    }


}