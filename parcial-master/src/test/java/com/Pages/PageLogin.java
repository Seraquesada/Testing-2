package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PageLogin extends BasePage {
    By botonMiCuenta = By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a" );
    By botonIniciarSesion = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
    By correo = By.name("email");
    By contrasena = By.name("password");
    By botonFinalizar = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
    public PageLogin(WebDriver driver) {}

    public void iniciarSesion() throws InterruptedException {
        oprimir(botonMiCuenta);
        Thread.sleep(2000);
        oprimir(botonIniciarSesion);
        teclear("sera_quesada03@prueba.com",correo);
        teclear("123456",contrasena);
        oprimir(botonFinalizar);
        //Thread.sleep(3000);

    }

}
