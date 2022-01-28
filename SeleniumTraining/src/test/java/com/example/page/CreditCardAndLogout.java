package com.example.page;

import com.example.methods.Methods;
import org.openqa.selenium.By;

public class CreditCardAndLogout {
    Methods methods;

    public CreditCardAndLogout(){

        methods = new Methods();
    }

    public void creditCardAndLogout(){

        methods.sendKeys(By.id("credit-card-owner"),"Demirhan Kızılkaya");
        methods.waitBySeconds(2);

        methods.sendKeys(By.id("credit_card_number_1"),"5209");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("credit_card_number_2"),"3271");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("credit_card_number_3"),"1884");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("credit_card_number_4"),"7881");
        methods.waitBySeconds(2);

        methods.selectByText(By.id("credit-card-expire-date-month"),"03");
        methods.waitBySeconds(2);
        methods.selectByText(By.id("credit-card-expire-date-year"),"2024"); // HATALI
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("credit-card-security-code"),"531");
        //methods.sendKeys(By.id("credit-card-security-code"),"532");  // HATALI
        methods.waitBySeconds(2);

        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(1);

        methods.click(By.cssSelector("input[id=checkbox]"));
        methods.waitBySeconds(2);

        methods.click(By.cssSelector("input[id=submit]"));
        methods.waitBySeconds(2);

        methods.click(By.xpath("//img[@alt='kitapyurdu.com']"));
        methods.waitBySeconds(5);
    }
}
