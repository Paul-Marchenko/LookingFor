package com.dou.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageObject <T> {
    protected WebDriver driver;
    protected WebDriverWait wait;

    protected BasePageObject (WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, 30);
    }
    protected T getPage(String url){
        driver.get(url);
        return (T) this;
    }

}
