package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageRegister extends BasePage {
    By buttonCrearUsuario = By.xpath("//*[@id=\'root\']/header/nav/a[1]");
    By nombre = By.name("firstName");
    By apellido = By.id("lastName");
    By correo = By.cssSelector("#email");
    By contrasena = By.xpath("/html/body/div/main/div/form/div[3]/input");
    By ccontrasena = By.name("repassword");
    By buttonResgistrarse = By.xpath("//*[@id=\'root\']/main/div/form/button");
    By resultado = By.className("txt-gracias");
    By resultadoFallido = By.className("form-feedback");

    public PageRegister(WebDriver driver) {
        super();
    }

    public void register (){
        oprimir(buttonCrearUsuario);
        teclear("jose",nombre);
        teclear("pinzon",apellido);
        teclear("pruebas1@prueba.com",correo);
        teclear("123456",contrasena);
        teclear("123456",ccontrasena);
        oprimir(buttonResgistrarse);
        esperaExplicta(5,resultado,"¡Cuenta registrada con éxito!");
        obtenerTexto(resultado);
        comparar(resultado,"¡Cuenta registrada con éxito!");
    }
    public void registerfail (){
        oprimir(buttonCrearUsuario);
        teclear("jose",nombre);
        teclear("pinzon",apellido);
        teclear("pruebas1@prueba.com",correo);
        teclear("123456",contrasena);
        teclear("123456",ccontrasena);
        oprimir(buttonResgistrarse);
        esperaExplicta(5,resultadoFallido,"Ese email ya se encuentra registrado");
        obtenerTexto(resultadoFallido);
        comparar(resultadoFallido,"Ese email ya se encuentra registrado");
    }
}
