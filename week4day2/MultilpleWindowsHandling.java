package week4.day2.week4day2;

import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultilpleWindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver dr=new ChromeDriver(option);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		dr.get("https://login.salesforce.com/");		

		dr.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		dr.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@123");
		
		dr.findElement(By.xpath("//input[@id='Login']")).click();
		
		// find mobile publisher
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		dr.findElement(By.xpath("//span[text()='Learn More']")).click();
		Thread.sleep(5000);
		Set<String> windowHandles = dr.getWindowHandles();
		List<String> seperateWindows = new ArrayList<String>(windowHandles);
		dr.switchTo().window(seperateWindows.get(1));
				
		dr.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
				
		String text = dr.findElement(By.xpath("//span[contains(.,'Create and publish custom-branded mobile apps.')]")).getText();
		System.out.println("Inner Window TEXT: "+text);
		
		dr.findElement(By.xpath("//span[contains(.,'Create and publish custom-branded mobile apps.')]")).click();
		dr.close();
		dr.switchTo().window(seperateWindows.get(0));
		
		Set<String> setUpHomewindowHandles = dr.getWindowHandles();
		List<String> setUpWindows = new ArrayList<String>(setUpHomewindowHandles);
		dr.switchTo().window(setUpWindows.get(0));
		//Outer Window title
//		Thread.sleep(3000);
//		String getTiltleOfOuterWindow = dr.findElement(By.xpath("//title[contains(text(),'Home | Salesforce')]")).getText();
		
		String getTiltleOfOuterWindow = dr.getTitle();
		System.out.println("Outer Window Title is : "+getTiltleOfOuterWindow);
		
		Thread.sleep(3000);
		dr.quit();
		
	}

}
