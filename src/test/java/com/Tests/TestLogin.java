package com.Tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import com.Pages.PageLogin;

public class TestLogin {
	
	private WebDriver driver;
	PageLogin pageLogin;
	
	@BeforeEach
	public void setUp() throws Exception {
		pageLogin = new PageLogin(driver);
		driver =pageLogin.chromeDriverConnection();
		pageLogin.link("http://testing.ctd.academy/");
	
	}
	/*@AfterEach
	public void tearDown() throws Exception {
		driver.quit();
	}*/

	@Test
	public void test() throws InterruptedException {
		pageLogin.loginUser();
	}
	@Test
	public void test2() throws InterruptedException {
		pageLogin.loginUserFail();
	}

	@ParameterizedTest
	@ValueSource(strings = {"edisson.g.p@hotmail.com", "edisson.g.p@hotmail.com", "edisson.g.p@hotmail.com"})
	public void test(String correo) throws InterruptedException {
		pageLogin.loginsUser(correo);
		System.out.println("mostrar correo" + correo);
	}

}
