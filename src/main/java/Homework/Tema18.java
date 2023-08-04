package Homework;

import utils.BaseTest;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Tema18 extends BaseTest {
	
	
	@Test
	public void unoMetodo() {
		
		WebElement login = driver.findElement(By.className("menu_user_login"));
		assertTrue(login.isDisplayed());
		driver.findElement(By.className("menu_user_login")).click();
		WebElement loginField = driver.findElement(By.id("log"));
		assertTrue(loginField.isDisplayed());
		WebElement passField = driver.findElement(By.id("password"));
		assertTrue(passField.isDisplayed());
		
	}

}
