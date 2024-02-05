package TestNGPrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Orders {
@BeforeSuite 
public void beforeSuit() {
	System.out.println("before suite");
}
@BeforeTest
public void beforeTest() {
	System.out.println("before test");
}
@BeforeClass
public void beforeClass() {
	System.out.println("before class");
}
@BeforeMethod
public void beforeMethod() {
	System.out.println("before Method");
}
@Test
public void test() {
	System.out.println("test");
}
@Test
public void test123() {
	System.out.println("test123");
}
@AfterMethod
public void AfterMethod() {
	System.out.println("after Method");
}
@AfterClass
public void AfterClass() {
    System.out.println("after class");
}
@AfterTest
public void AfterTest() {
	System.out.println("after test");
}
@AfterSuite 
public void AfterSuit() {
	System.out.println("after suite");
}
}
