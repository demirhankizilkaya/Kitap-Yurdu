package com.example.page;

import com.example.methods.Methods;
import org.openqa.selenium.By;

public class PuanCatalog {

    Methods methods;

    public PuanCatalog(){

        methods = new Methods();

    }

    public void puanCatalog(){

        methods.click(By.cssSelector(".lvl1catalog"));
        methods.waitBySeconds(3);
        System.out.println("Puan Katoloğuna Geçiş Başarılı");

        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(3);
        System.out.println("Türk Klasiklerine Geçiş Başarılı");

        methods.selectByText(By.xpath("//div[@class='sort']/select"),"Yüksek Oylama");
        methods.waitBySeconds(4);
        System.out.println("Yüksek Oylama Seçildi");

        methods.click(By.xpath("//span[@class='mn-strong common-sprite' and text()='Tüm Kitaplar']"));
        methods.waitBySeconds(4);
        methods.click(By.xpath("//a[@class='mn-icon icon-angleRight' and text()='Hobi']"));
        System.out.println("Hobi Seçildi");
        methods.waitBySeconds(4);

        methods.selectProduct(By.xpath("//a[@class='pr-img-link']"));
        methods.waitBySeconds(4);

        methods.click(By.cssSelector("a[id='button-cart']"));
        methods.waitBySeconds(5);
        System.out.println("Sepete Ürün Eklendi");

        }
}
