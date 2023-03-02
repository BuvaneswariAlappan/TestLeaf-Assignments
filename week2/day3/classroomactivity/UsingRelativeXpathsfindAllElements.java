package week2.day3.classroomactivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingRelativeXpathsfindAllElements {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		  WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		  username.sendKeys("DemoSalesManager");
		  
		  WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		  pwd.sendKeys("crmsfa");
		  
		  driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

	}

}
