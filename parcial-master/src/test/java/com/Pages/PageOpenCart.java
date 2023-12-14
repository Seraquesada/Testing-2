package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageOpenCart extends BasePage {
    By botonAgregarACarrito = By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]");

    public PageOpenCart(WebDriver driver) {
    }
    public void agregarACarrito() throws InterruptedException {
        oprimir(botonAgregarACarrito);
        Thread.sleep(2000);
    }
}
