package com.Tests;

import com.Pages.PageLogin;
import com.Pages.PageSearch;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestSearch {
    WebDriver driver;
    PageSearch pageSearch;


    @BeforeEach
    public void setUp () throws InterruptedException {
        pageSearch = new PageSearch(driver);
        driver = pageSearch.chromeDriverConnection();
        pageSearch.link("https://opencart.abstracta.us/index.php");
    }

    @Test
    @Tag("TestRegresion")
    public void test() throws InterruptedException
    {
        pageSearch.search();
    }


    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
