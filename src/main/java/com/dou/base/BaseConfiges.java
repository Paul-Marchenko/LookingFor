package com.dou.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseConfiges {
    protected WebDriver driver;

    @BeforeMethod
    protected void setUp() {
        //System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @AfterMethod
    protected void tearDown() {
        driver.quit();
    }
}
