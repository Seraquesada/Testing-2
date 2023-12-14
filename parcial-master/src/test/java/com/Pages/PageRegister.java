package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.Base.BasePage.oprimir;

public class PageRegister extends BasePage {

    By botonMiCuenta = By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a" );

    By botonCrearUsuario = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
    By nombre = By.name("firstname");
    By apellido = By.name("lastname");
    By correo = By.name("email");
    By celular = By.name("telephone");
    By contrasena = By.name("password");
    By confirmarContrena = By.name("confirm");
    By radioButton = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
    By policy = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
    By botonFinalizarRegistro = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
    By textoConfirmacion = By.xpath("//*[@id=\"content\"]/p[1]");
    By botonContinuar = By.xpath("//*[@id" + "=\"content\"]/div/div/a");

    public PageRegister(WebDriver driver) {

    }

    public void registrarse () throws InterruptedException {
        oprimir(botonMiCuenta);
        Thread.sleep(2000);
        oprimir(botonCrearUsuario);
        Thread.sleep(2000);
        teclear("sera",nombre);
        teclear("quesada",apellido);
        teclear("sera_quesada03@prueba.com",correo);
        teclear("2222222",celular);
        teclear("123456",contrasena);
        teclear("123456",confirmarContrena);
        oprimir(radioButton);
        oprimir(policy);
        oprimir(botonFinalizarRegistro);
        comparar(textoConfirmacion,"Congratulations! Your new account has been successfully created!");
        Thread.sleep(5000);
        oprimir(botonContinuar);

    }
}
