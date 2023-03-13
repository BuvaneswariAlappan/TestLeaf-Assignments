package week4.day1.week4day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class W3SchollspromptMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver dr=new ChromeDriver(option);
		dr.manage().window().maximize();
		Thread.sleep(2000);		
		dr.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
//		dr.switchTo().frame("iframecontainer");
		dr.switchTo().frame("iframeResult");
		dr.findElement(By.tagName("button")).click();
		
		Thread.sleep(5000);

		//dr.findElement(By.id("iframeResult"));
		 
		
		//WebElement findElement = dr.findElement(By.xpath("//button[contains(text(),'Try it')]"));
//		WebElement findElement = dr.findElement(By.xpath("//button[@onclick='myFunction()']"));
		//findElement.click();
	
		Alert alert = dr.switchTo().alert();
		alert.sendKeys("Buvanesari Alappan");
		alert.accept();
		
		String text = dr.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text);
		
	}
	

}
