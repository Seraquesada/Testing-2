package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageSearch extends BasePage {
    By inputSearch = By.name("search");
    By botonBusqueda = By.xpath("//*[@id=\"search\"]/span/button");
    By precio = By.className("price");

    public PageSearch(WebDriver driver) {

    }

    public void search ()throws InterruptedException{
        teclear("iphone",inputSearch);
        tecla(inputSearch,"ENTER");
        oprimir(botonBusqueda);
        Thread.sleep(5000);
        comparar(precio,"$101.00");
    }
}
