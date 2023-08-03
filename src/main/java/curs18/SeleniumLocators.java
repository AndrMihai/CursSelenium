package curs18;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.*;

import utils.BaseTest;

public class SeleniumLocators extends BaseTest {

	/**
	 * tagName
	 * linkTest
	 * partialLinkText
	 * id
	 * name
	 * class name
	 * xpath
	 * Css Selector
	 */
	@Test(priority=1)
	public void tagNameLocator() {
		WebElement discoverText = driver.findElement(By.tagName("em"));
		System.out.println(discoverText.getText());
		//discoverText.click();
		assertEquals(discoverText.getText(), "Discover");
		//driver.findElement(By.tagName("em")).getText();
		//driver.findElement(By.tagName("em")).click();
	}
	@Test(priority=2)
	public void linkTextLocator() {
		//linkText se aplica doar pe taguri de tip <a>
		//<a href="https://keybooks.ro/shop/">Books</a>
		driver.findElement(By.linkText("BOOKS")).click();
		assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/shop/");
	}
	@Test(priority=3)
	public void partialLinkTextLocator() {
		driver.findElement(By.partialLinkText("Cooking")).click();
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/cooking-with-love/");
		
		//<a href="https://keybooks.ro/shop/cooking-with-love/">Cooking with love</a>
		/*
		 * LINK TEXT: Cooking with love
		 * Partial link text: Cooking
		 * Partial link text: with
		 * Partial link text: love
		 * Partial link text: cook
		 */
	}
	@Test(priority=4)
	public void classNameLocator() {
		//<p class = "price">
		WebElement price = driver.findElement(By.className("price"));
		//isDisplayed() verifica daca un webelement apare (este vizibil) in aplicatie
		assertTrue(price.isDisplayed());
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red')", price);
		System.out.println(price.getText());
		assertTrue(price.getText().contains("20.55"));
	}
	@Test(priority=5)
	public void idLocator() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.id("tab-title-reviews")).click();
		Thread.sleep(2000);
		WebElement commentBox = driver.findElement(By.id("comments"));
		assertTrue(commentBox.isDisplayed());
		
		
	}
	
}
