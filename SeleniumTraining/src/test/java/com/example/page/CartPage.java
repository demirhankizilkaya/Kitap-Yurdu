package com.example.page;

import com.example.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CartPage {

    Methods methods;

    public CartPage(){


        methods = new Methods();
    }

    public void cartPage(){

        methods.clear(By.xpath("//input[@style='width:22px']"));
        methods.waitBySeconds(2);

        methods.sendKeys(By.xpath("//input[@style='width:22px']"),"2");
        methods.waitBySeconds(2);

        methods.click(By.xpath("//i[@title='Güncelle']"));
        methods.waitBySeconds(2);

        methods.click(By.xpath("//div[@class='right']/a"));
        methods.waitBySeconds(2);

        methods.click(By.xpath("//a[@href='#tab-shipping-new-adress']"));
        methods.waitBySeconds(2);

        methods.sendKeys(By.id("address-firstname-companyname"),"Demirhan");
        methods.waitBySeconds(2);

        methods.sendKeys(By.id("address-lastname-title"),"Kızılkaya");
        methods.waitBySeconds(2);

        methods.selectByText(By.id("address-zone-id"),"İstanbul");
        methods.waitBySeconds(2);

        methods.selectByText(By.cssSelector("select[id='address-county-id']"),"GÜNGÖREN");
        methods.waitBySeconds(2);

        methods.sendKeys(By.id("district"),"TOZKOPARAN MAH");
        methods.click(By.id("districtautocomplete-list"));
        methods.waitBySeconds(2);

        methods.sendKeys(By.cssSelector("textarea[id=address-address-text]"),"Demirhan Ev Adresi");
        methods.waitBySeconds(2);

        methods.sendKeys(By.cssSelector("input[id=address-postcode]"),"34000");
        methods.waitBySeconds(2);

        methods.sendKeys(By.cssSelector("input[id=address-telephone]"),"2124827351");
        methods.waitBySeconds(2);

        methods.sendKeys(By.cssSelector("input[id=address-mobile-telephone]"),"5346695699");
        methods.waitBySeconds(2);

        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(2);



    }
}
