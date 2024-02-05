package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Day40DWS {
@Test
public void dws(){
	//WebDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//driver.get("https://demowebshop.tricentis.com/");
	//driver.quit();
	Reporter.log("dws",true);
}
@Test
public void test1() {
	System.out.println("Hi i am from test1");
}
@Test
public void cat() {
	System.out.println("Hi i am from cat");
}
}
