package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpathRegisterForm {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/div[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/input")).sendKeys("Rama Rao");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/input")).sendKeys("Y");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/input")).sendKeys("yramarao99@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/input")).sendKeys("rama1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/input")).sendKeys("rama1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div/div[2]/div[4]/input")).click();
		Thread.sleep(2000);
		driver.close();
	}
}