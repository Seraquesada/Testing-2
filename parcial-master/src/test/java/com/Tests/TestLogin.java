package com.Tests;

import com.Pages.PageLogin;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class TestLogin {


	WebDriver driver;
	PageLogin pageLogin;

	@BeforeEach
	public void setUp() throws Exception {
		pageLogin = new PageLogin(driver);
		driver = pageLogin.chromeDriverConnection();
		pageLogin.link("https://opencart.abstracta.us/index.php");

	}

	@Test
	@Tag("TestRegresion")
	public void test() throws InterruptedException {
		pageLogin.iniciarSesion();
	}

}
