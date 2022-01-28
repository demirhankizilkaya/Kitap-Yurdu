package com.example.test;

import com.example.driver.BaseTest;
import com.example.page.*;
import org.junit.Test;

public class ListPageTest extends BaseTest {

    @Test
    public void listPageTest(){

        ListPage listPage =new ListPage();
        listPage.list();

    }
}
