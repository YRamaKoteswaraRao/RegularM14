package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day41AddToCartChronologicalOrder {
    public WebDriver driver;
@BeforeClass
public void openTheBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
}
@BeforeMethod(enabled = true)
public void login() {
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.id("Email")).sendKeys("yramarao99@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("rama1234");
	driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
}
@Test
public void addToCart() {
	System.out.println("Sucessfull..............");
	driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
}
@AfterMethod(enabled = true)
public void logout() {
	driver.findElement(By.className("ico-logout")).click();
}
@AfterClass
public void closeBrowser() {
	driver.quit();
}
}
