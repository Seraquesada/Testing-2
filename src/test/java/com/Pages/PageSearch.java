package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.Base.BasePage;

public class PageSearch extends BasePage{
	
	By searchBox = By.cssSelector("#ciudad");
	//html/body/div/main/div[1]/form/div/div[1]/div/div[1]/div[2]/input
   //*[@id="ciudad"]
   //*[@id="ciudad"]
	//#ciudad
	By bottonSearch = By.id("btn-buscador");
	By resultado = By.className("card-list");
	
	public PageSearch(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public void search () throws InterruptedException {
		teclear("Punta del este",searchBox);
		tecla(searchBox,"ENTER");
		Thread.sleep(2000);
		oprimir(bottonSearch);
		Thread.sleep(2000);
		obtenerTexto(resultado);
		Thread.sleep(2000);
		comparar(resultado,"Villa Kantounes Studio Ostria");
		Thread.sleep(2000);
	}
	public void search2 () throws InterruptedException {
		teclear("Punta del este",searchBox);
		tecla(searchBox,"ENTER");
		Thread.sleep(2000);
		oprimir(bottonSearch);
		obtenerTexto(resultado);
		Thread.sleep(2000);
		comparar(resultado,"Villa Kantounes Studio Ostria123");
		Thread.sleep(2000);
	}

}

