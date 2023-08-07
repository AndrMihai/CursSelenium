package curs19;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class CssSelectors extends BaseTest {

	
	@Test(priority=1)
	public void cssSelectorsExample() {
		/**
		 * <ul id="menu_user" class="menu_user_nav inited sf-js-enabled sf-arrows">
		 * ul[id='menu_user']
		 * 
		 * #--> in css # este o referinta catre atributul id
		 * 
		 * ul#menu_user
		 * 
		 * . ---> in css . este o referinta catre atributul class
		 * 
		 * ul[class="menu_user_nav"]
		 * 
		 * .menu_user_nav
		 * ul.menu_user_nav
		 * 
		 * li.menu_user_login>a[href='#popup_login']
		 * li[class='menu_user_login']>a[href='#popup_login']
		 */
		
		//# ---> id
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement loginMenu = driver.findElement(By.cssSelector("#menu_user"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red')", loginMenu);
		//. ---> class
		WebElement logoSlogan = driver.findElement(By.cssSelector(".logo_slogan"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red')", logoSlogan);
		
		WebElement updatesText = driver.findElement(By.cssSelector("div.wpb_wrapper>h3[style=\"text-align:center;color:#ffffff;\"]"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid black')", updatesText);
	}
	@Test(priority=2)
	public void cssSelectorsExample2() {
		
		// * ----> contains
		WebElement bookTitle = driver.findElement(By.cssSelector("h3[class*='sc_title_reg']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid blue')", bookTitle);
		// ~ ----> contains word
		WebElement bookTitle2 = driver.findElement(By.cssSelector("h3[class~='sc_title_regular']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange;border:4px solid blue')", bookTitle2);
		// ^ ----> starts with
		WebElement bookTitle3 = driver.findElement(By.cssSelector("a[href^='life']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange;border:4px solid blue')", bookTitle3);
		// $ ----> ends with
		WebElement bookTitle4 = driver.findElement(By.cssSelector("a[href$='silence']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange;border:4px solid blue')", bookTitle4);
	}
}
