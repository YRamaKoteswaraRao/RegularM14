package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day35AutomationRegisterFormAssignment1 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Ram");
	driver.findElement(By.cssSelector("input[ng-model='LastName']")).sendKeys("Rao");
	driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Tenali, Guntur Dist, A.P.");
	driver.findElement(By.cssSelector("input[type='email']")).sendKeys("ramrao123@gmail.com");
	driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("9876543210");
	driver.findElement(By.xpath("(//input[@name='radiooptions'])[1]")).click();
	driver.findElement(By.id("checkbox1")).click();
	driver.findElement(By.id("checkbox2")).click();
	driver.findElement(By.xpath("//div[@id='msdd']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='English']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Hindi']")).click();
	Thread.sleep(1000);
    WebElement single_select = driver.findElement(By.cssSelector("select[id='Skills']"));
	Thread.sleep(1000);
	Select s=new Select(single_select);
	Thread.sleep(1000);
	s.selectByVisibleText("Java");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@class='select2-selection__arrow']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[text()='India']")).click();
	Thread.sleep(1000);
	WebElement year = driver.findElement(By.cssSelector("select[id='yearbox']"));
	Thread.sleep(1000);
	Select y=new Select(year);
	Thread.sleep(1000);
	y.selectByValue("1990");
	WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
	Thread.sleep(1000);
	Select m=new Select(month);
	Thread.sleep(1000);
	m.selectByVisibleText("June");
	WebElement day = driver.findElement(By.cssSelector("select[id='daybox']"));
	Thread.sleep(1000);
	Select d=new Select(day);
	Thread.sleep(1000);
	d.selectByIndex(6);
	driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("123456");
	driver.findElement(By.id("submitbtn")).click();
	Thread.sleep(2000);
	driver.close();
}
}
