package com.Tests;

import com.Pages.PageLogin;
import com.Pages.PageOpenCart;
import com.Pages.PageRegister;
import com.Pages.PageSearch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestOpenCart {
    WebDriver driver;
    PageOpenCart pageOpenCart;
    PageSearch pageSearch;
    PageLogin pageLogin;

    @BeforeEach
    public void setUp () throws InterruptedException {
        pageOpenCart = new PageOpenCart(driver);
        driver = pageOpenCart.chromeDriverConnection();
        pageSearch = new PageSearch(null);
        pageSearch.link("https://opencart.abstracta.us/index.php");
        pageLogin = new PageLogin(null);
        pageLogin.iniciarSesion();
        pageSearch.search();
    }
    @Test
    @Tag("TestRegresion")
    public void cargar() throws InterruptedException {
        pageOpenCart.agregarACarrito();
    }
}
