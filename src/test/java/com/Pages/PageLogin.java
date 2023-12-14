package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.Base.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageLogin extends BasePage {

	By email = By.name("email");
	By password = By.name("password");
	By bottomLogin = By.xpath("//*[@id=\'root\']/header/nav/a[2]");
	By bottomFinish = By.xpath("//*[@id=\'root\']/main/div/form/button");
	By resultado= By.xpath("//*[@id='root']/header/nav/div/div/div/p[2]");
	By resFail = By.xpath("//*[@id=\'root\']/main/div/form/p[1]");

	
	public PageLogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	
	public void loginUser() throws InterruptedException {
		//new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(bottomLogin));
		waitElementClickable(bottomLogin);
		oprimir(bottomLogin);
		teclear("edisson.g.p@hotmail.com",email);
		//Thread.sleep(2000);
		teclear("pass123",password);
		//Thread.sleep(2000);
		oprimir(bottomFinish);
		//Thread.sleep(2000);
		waitTextToBe(resultado, "edisson esteban gomez pinzon");
		//new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.textToBe(resultado, "edisson esteban gomez pinzon"))
		obtenerTexto(resultado);
		comparar(resultado,"edisson esteban gomez pinzon");
		
	}
	public void loginUserFail() throws InterruptedException {
		oprimir(bottomLogin);
		teclear("prueba6@prueba.com",email);
		//Thread.sleep(2000);
		teclear("321546",password);
		//Thread.sleep(2000);
		oprimir(bottomFinish);
		//Thread.sleep(2000);
		waitTextToBe(resFail, "Sus credenciales son inválidas. Por favor, vuelva a intentarlo");
		obtenerTexto(resFail);
		comparar(resFail,"Sus credenciales son inválidas. Por favor, vuelva a intentarlo");
		
	}

	public void loginsUser(String correo) throws InterruptedException {
		waitElementClickable(bottomLogin);
		oprimir(bottomLogin);
		teclear(correo,email);
		teclear("pass123",password);
		oprimir(bottomFinish);
		waitTextToBe(resultado, "edisson esteban gomez pinzon");
		obtenerTexto(resultado);
		comparar(resultado,"edisson esteban gomez pinzon");

	}
}
