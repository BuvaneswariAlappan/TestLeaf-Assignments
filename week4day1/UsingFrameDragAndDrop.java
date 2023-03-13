package week4.day1.week4day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class UsingFrameDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver dr=new ChromeDriver(option);
		dr.manage().window().maximize();
		Thread.sleep(2000);
		dr.get("https://jqueryui.com/droppable/");
		
	Thread.sleep(2000);
	dr.switchTo().frame(0);
	Thread.sleep(2000);
	
	WebElement draggable = dr.findElement(By.id("draggable"));
	
	
	WebElement droppable = dr.findElement(By.id("droppable"));
	
	Actions actions = new Actions(dr);
	actions.dragAndDrop(draggable, droppable).perform();
	
	Thread.sleep(1000);
	dr.close();

	}

}
