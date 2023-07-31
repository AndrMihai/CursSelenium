package curs17;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class TestAnnotation {
	//@Test
	public void test1() {
		System.out.println("Test1");
	}
	@Ignore
	public void test2() {
		System.out.println("Test2");
	}
	@Test
	public void test3() {
		System.out.println("Test3");
	}
	@Test
	public void test4() {
		System.out.println("Test4");
	}

}
