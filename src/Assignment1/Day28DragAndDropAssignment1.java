package Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day28DragAndDropAssignment1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source = driver.findElement(By.id("box6"));
		WebElement target = driver.findElement(By.xpath("//div[text()='Italy']"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(source, target).build().perform();
		WebElement source1 = driver.findElement(By.id("box7"));
		WebElement target1 = driver.findElement(By.xpath("//div[text()='Spain']"));
		Actions a2=new Actions(driver);
		a2.dragAndDrop(source1, target1).build().perform();
		WebElement source2 = driver.findElement(By.id("box1"));
		WebElement target2 = driver.findElement(By.xpath("//div[text()='Norway']"));
		Actions a3=new Actions(driver);
		a3.dragAndDrop(source2, target2).build().perform();
		WebElement source3 = driver.findElement(By.id("box4"));
		WebElement target3 = driver.findElement(By.xpath("//div[text()='Denmark']"));
		Actions a4=new Actions(driver);
		a4.dragAndDrop(source3, target3).build().perform();
		WebElement source4 = driver.findElement(By.id("box5"));
		WebElement target4 = driver.findElement(By.xpath("//div[text()='South Korea']"));
		Actions a5=new Actions(driver);
		a5.dragAndDrop(source4, target4).build().perform();
		WebElement source5 = driver.findElement(By.id("box2"));
		WebElement target5 = driver.findElement(By.xpath("//div[text()='Sweden']"));
		Actions a6=new Actions(driver);
		a6.dragAndDrop(source5, target5).build().perform();
		WebElement source6 = driver.findElement(By.id("box3"));
		WebElement target6 = driver.findElement(By.xpath("//div[text()='United States']"));
		Actions a7=new Actions(driver);
		a7.dragAndDrop(source6, target6).build().perform();
		
	}	
}
