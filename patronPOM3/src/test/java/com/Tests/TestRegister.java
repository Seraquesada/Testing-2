package com.Tests;

import com.Pages.PageRegister;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestRegister {
    WebDriver driver;
    PageRegister pageRegister;

    @BeforeEach
    public void setUp (){
        pageRegister = new PageRegister(driver);
        driver = pageRegister.chromeDriverConnection();
        pageRegister.link("http://testing.ctd.academy/");
    }
    @AfterEach
    public void tearDown (){
        driver.quit();
    }
    @Test
    @Tag("TestRegresion")
    public void test01 (){
        pageRegister.register();
    }
    @Test
    @Tag("TestRegresion")
    public void test02 (){
        pageRegister.registerfail();
    }

}
