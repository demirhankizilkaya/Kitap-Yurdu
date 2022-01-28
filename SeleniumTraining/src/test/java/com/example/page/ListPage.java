package com.example.page;

import com.example.methods.Methods;
import org.openqa.selenium.By;

public class ListPage {

    Methods methods;

    public ListPage(){

        methods = new Methods();

    }

    public void list(){
                                //Favori kısmında listeleme şeklinde gelmediği için ürün çıkartılmıyor
        try {
            methods.click(By.cssSelector(".menu.top.my-list"));
            methods.waitBySeconds(4);
            methods.click(By.xpath("//a[@href='https://www.kitapyurdu.com/index.php?route=account/favorite&selected_tags=0']"));
            methods.waitBySeconds(4);
            methods.click(By.cssSelector("div[class='product-list']>:nth-child(3)>:nth-child(2)>:nth-child(4)>:nth-child(3)"));
            //methods.click(By.xpath("//div[@class='product-grid']/div[3]//i[@class='fa fa-heart-o']"));
            methods.waitBySeconds(4);
        } catch (Exception e) {
            e.printStackTrace();
        }

        methods.click(By.cssSelector(".common-sprite.fl"));
        methods.waitBySeconds(2);

        methods.click(By.id("js-cart"));
        methods.waitBySeconds(2);



    }
}
