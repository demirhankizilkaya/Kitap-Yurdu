package com.example.test;

import com.example.driver.BaseTest;
import com.example.page.LoginPage;
import com.example.page.PuanCatalog;
import org.junit.Test;

public class PuanCatalogTest extends BaseTest {

    @Test
    public void puanCatalogTest(){

        PuanCatalog puanCatalog = new PuanCatalog();
        puanCatalog.puanCatalog();

    }
}
