package Homework;

import utils.BaseTest;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Tema18 extends BaseTest {
	
	
	@Test
	public void unoMetodo() throws InterruptedException {
		
		WebElement login = driver.findElement(By.className("menu_user_login"));
		assertTrue(login.isDisplayed());
		WebElement loginField = driver.findElement(By.id("log"));
		WebElement passField = driver.findElement(By.id("password"));
		assertFalse(loginField.isDisplayed());
		assertFalse(passField.isDisplayed());
		driver.findElement(By.className("menu_user_login")).click();
		Thread.sleep(3000);
		assertTrue(loginField.isDisplayed());
		assertTrue(passField.isDisplayed());
	}

}
