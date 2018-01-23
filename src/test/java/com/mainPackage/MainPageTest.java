package com.mainPackage;

import com.dou.base.BaseConfiges;
import com.dou.pages.MainPage;
import org.testng.annotations.Test;

public class MainPageTest extends BaseConfiges {



    @Test
    public void openMain() {

        MainPage mainPage=new MainPage(driver);
        mainPage.openMainPage();

    }


}
