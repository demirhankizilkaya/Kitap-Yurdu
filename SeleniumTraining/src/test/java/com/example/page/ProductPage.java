package com.example.page;

import com.example.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;;
import org.openqa.selenium.By;



public class ProductPage {

    Methods methods;


    public ProductPage(){

        methods = new Methods();

    }

    public void scrollAndSelect() {

        methods.sendKeys(By.id("search-input"), "Oyuncak");
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.cssSelector("div[class='product-list']>:nth-child(7)"));
        methods.waitBySeconds(5);

        for (int i = 0; i < 4; i++) {
            methods.selectProducts(By.xpath("//div[@id='product-table']/div//i[@class='fa fa-heart']"), i);
            methods.waitBySeconds(10);
        }
    }

    /*public void assertFavoritePage(){
        methods.click(By.cssSelector(".menu.top.my-list"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[@href='https://www.kitapyurdu.com/index.php?route=account/favorite&selected_tags=0']"));
        methods.waitBySeconds(3);
        methods.assertions((By.cssSelector(".swal2-success-ring")));
        methods.waitBySeconds(3);

        Favorilerime gidip "Etiketsiz 4" taginin karşılaştırması
     */

    public void backhome(){

        methods.click(By.className("logo-icon"));
        methods.waitBySeconds(2);
        System.out.println("Ana Sayfaya Dönüş Başarılı");

    }
}




