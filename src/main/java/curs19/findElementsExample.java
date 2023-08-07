package curs19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class findElementsExample extends BaseTest {
	
	@Test
	public void findEelementsExample() {
		
		/**
		 * driver.findElement  ---> intoarce un webelement (daca locatorul gaseste mai multe actioneaza doar asupra primului)
		 * Daca nu gaseste niciun element cu locatorul ---> intoarce NoSuchElementException
		 * driver.findElements ----> intoarce o lista de webElemente. Putem sa accesam pe baza de index din interiorul listei
		 * Daca nu gaseste ---> intoarce o lista goala
		 */
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		List<WebElement> bookTitle2 = driver.findElements(By.cssSelector("h3[class~='sc_title_regular']"));
		System.out.println(bookTitle2.size());
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange;border:4px solid blue')", bookTitle2.get(1));
		
	}

}
