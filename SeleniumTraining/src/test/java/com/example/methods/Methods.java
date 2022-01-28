package com.example.methods;

import com.example.driver.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import sun.awt.SunHints;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Methods {                                                              // Bütün Metodları altına yazıyoruz

    WebDriver driver;                                                               // Driver ı tanımladık
    FluentWait<WebDriver> wait;                                                     // WebDriver ın bekleme süresi
    JavascriptExecutor jsdriver;                                                    //Consoldan javascript ile çalışmak istersek

    public Methods(){
        driver = BaseTest.driver;
        wait = new FluentWait<WebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(30))                                    // Maksimum arama süresi
                .pollingEvery(Duration.ofMillis(300))                               // Kaç saniyede bir aramayı yenilensin
                .ignoring(NoSuchElementException.class);                            // Kabul etmeyecekleri
        jsdriver = (JavascriptExecutor) driver;
    }

    public WebElement findElement(By by){                                           // Nesneleri bulmak için find metodu

        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void click(By by){                                                       // Click işlemi için metod

        findElement(by).click();                                                    // Elementi bulsun ve tıklasın
    }

    public void waitBySeconds(long seconds){
        try {
            Thread.sleep(seconds*1000);                                        // Milisaniye cinsinden bekletme işlemi
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public boolean isElementVisible(By by)                                          // Sayfada içerisinde nesnenin görünürlüğü için metod
    {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public void sendKeys(By by, String text)                                        // Yazdırma işlemleri için gerekli metod (Text yazdırmak için)
        {

            findElement(by).sendKeys(text);                                             // Elementi bulsun ve yazdırsın
    }


    public void scrollWithAction(By by) {                                           // Scroll yaptırmak için metod

        Actions actions = new Actions (driver);
        actions.moveToElement(findElement(by)).build().perform();                   // Elementin bulunduğu yere scroll yapsın
    }

    public void scrollWithJavaScript(By by){                                        //javascript ile bulunması istenilen elemete scroll

        jsdriver.executeScript("argument[0].scrollIntoView();",findElement(by));
    }

    public Select getSelect(By by){                                                 // Elementi bulup seçsin

        return new Select(findElement(by));

    }

    public void selectByText(By by,String text){                                    // Görünenlerden texte göre seçim yapsın

        getSelect(by).selectByVisibleText(text);
    }

    public String getAttribute(By by, String attributeName){                        // Attribute u bulup name ini aldırır

        return findElement(by).getAttribute(attributeName);

    }

    public String getText(By by){                                                   // Elemanı bulup textini alır

        return findElement(by).getText();
    }

    public String getValue(By by){                                                  // Elemanti bulup yazılanı alır

        return jsdriver.executeScript("return arguments[0].value",findElement(by)).toString();

    }

    public List<WebElement>  findElements(By by) {

        return driver.findElements(by);
    }

    public void assertPage(String message, String expectedValue, String actual) {
        Assert.assertEquals(message, expectedValue, actual);
    }

    public void assertions(By by){
        try {
            Assert.assertTrue(isElementVisible(by));
            System.out.println("Ürünler favorilere başarılı bir şekilde eklendi.");
        }catch (Exception e){
            System.out.println("Ürünlerin favorilere eklenmesi başarısız.");
        }

    }

    public void selectProduct(By by){
        Random random = new Random();
        List<WebElement> product = findElements(by);
        int index = random.nextInt(product.size());
        product.get(index).click();
    }
    public void selectProducts(By by,int i){
        Random random = new Random(i);
        List<WebElement> products = findElements(by);
        int index = random.nextInt(products.size());
        products.get(index).click();
    }

    public String getUrl() {

        return driver.getCurrentUrl();
    }

    public void clear(By by){
        findElement(by).clear();
    }

    public void mouseHover(By by) {
        WebElement element = driver.findElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }


}


