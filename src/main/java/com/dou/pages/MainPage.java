package com.dou.pages;

import com.dou.base.BasePageObject;
import org.openqa.selenium.WebDriver;



public class MainPage extends BasePageObject <MainPage>{
    private static final String URL ="https://dou.ua/";
    public MainPage(WebDriver driver) {
        super(driver);
    }
    public void openMainPage(){
        getPage(URL);
    }
}
