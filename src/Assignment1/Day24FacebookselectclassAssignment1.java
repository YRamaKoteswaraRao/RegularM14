package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day24FacebookselectclassAssignment1 {
public static void main(String[] args) throws InterruptedException {
	String user_name="ramarao1023@gmail.com";
	String phone_num="9876543210";
	String user_mail="ramarao1023@gamil.com";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
	Thread.sleep(1000);
	WebElement sign_up = driver.findElement(By.xpath("//div[@class='mbs _52lq fsl fwb fcb']"));
	Thread.sleep(1000);
	if(sign_up.isDisplayed())
	{
		System.out.println("Entering in to sign up page sucessfull");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("rama");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("rao");
		Thread.sleep(1000);
		if (Character.isDigit(phone_num.charAt(0))) {
			System.out.println("sign_up by using mobile Number");
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(phone_num);
			driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("ramrao123");
			Thread.sleep(1000);
			WebElement day = driver.findElement(By.id("day"));
			Thread.sleep(1000);
			Select s1=new Select(day);
			Thread.sleep(1000);
			s1.selectByValue("11");
			Thread.sleep(1000);
			WebElement moth = driver.findElement(By.id("month"));
			Thread.sleep(1000);
			Select s2=new Select(moth);
			Thread.sleep(1000);
			s2.selectByVisibleText("Jun");
			Thread.sleep(1000);
			WebElement year = driver.findElement(By.id("year"));
			Thread.sleep(1000);
			Select s3= new Select(year);
			Thread.sleep(1000);
			s3.selectByVisibleText("1990");
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@name='websubmit']")).click();
			Thread.sleep(1000);
		}
		else
		{
			System.out.println("sign up by using email id");
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(user_mail);
			driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(user_mail);
			driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("ramrao123");
			Thread.sleep(1000);
			WebElement day = driver.findElement(By.id("day"));
			Thread.sleep(1000);
			Select s1=new Select(day);
			Thread.sleep(1000);
			s1.selectByValue("11");
			Thread.sleep(1000);
			WebElement moth = driver.findElement(By.id("month"));
			Thread.sleep(1000);
			Select s2=new Select(moth);
			Thread.sleep(1000);
			s2.selectByVisibleText("Jun");
			Thread.sleep(1000);
			WebElement year = driver.findElement(By.className("birthday_year"));
			Thread.sleep(1000);
			Select s3= new Select(year);
			Thread.sleep(1000);
			s3.selectByVisibleText("1990");
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@name='websubmit']")).click();
			Thread.sleep(1000);
		}
	}
	else
	{
		System.out.println("Entering in to sign up page unsucessfull");
	}
}	
}
