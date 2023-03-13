package week4.day1.week4day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1Alerts {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver dr=new ChromeDriver(option);
		dr.manage().window().maximize();
		Thread.sleep(2000);
		dr.get("https://www.leafground.com/alert.xhtml");

		Thread.sleep(2000);
		 dr.findElement(By.xpath("//span[text()='Show']")).click();
		 Alert simpleDialogAlert = dr.switchTo().alert();
		 simpleDialogAlert.accept();
		 String simpleDialogText = dr.findElement(By.xpath("//span[@id='simple_result']")).getText();
		 System.out.println("1. Alert (Simple Dialog) Console Text : " +simpleDialogText);
		 
		 Thread.sleep(2000);
		 dr.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		 Alert confirmDialogAlert = dr.switchTo().alert();
		 confirmDialogAlert.accept();
		 String confirmDialogText = dr.findElement(By.xpath("//span[contains(text(),'User Clicked : OK')]")).getText();
		 System.out.println("2. Alert (Confirm Dialog) Console display Text : "+confirmDialogText);
		 
		 Thread.sleep(2000);
		 dr.findElement(By.xpath("//h5[contains(text(),'Sweet Modal Dialog')]/parent::div//following::button")).click();
		 Thread.sleep(2000);
		 String sweetModalDialogText = dr.findElement(By.xpath("//p[contains(text(),'Unless you close this, you cannot interact with other element. But am inspectable !')]")).getText();
		 dr.findElement(By.xpath("//div[@class='grid overlay-demo']//div[4]//span[@class='ui-icon ui-icon-closethick']")).click();
		 System.out.println("3. Sweet Modal Dialog Console display Text : "+sweetModalDialogText);
	
		 Thread.sleep(2000);
		 dr.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		 Thread.sleep(2000);
		 String sweetAlertText = dr.findElement(By.xpath("//p[contains(text(),'Unless you close this, you cannot interact with other element. But am inspectable !')]")).getText();
		 dr.findElement(By.xpath("//div[@class='grid overlay-demo']//div[4]//span[@class='ui-icon ui-icon-closethick']")).click();
		 System.out.println("4. Sweet Modal Dialog Console Display Text :  "+sweetAlertText);
		 
		 Thread.sleep(2000);
		 dr.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		 Alert alert = dr.switchTo().alert();
		 alert.sendKeys("Buvanesari Alappan");
		 alert.accept();
		 String promptDialogText = dr.findElement(By.id("confirm_result")).getText();
		 System.out.println("5. Alert (Prompt Dialog) Console display Text : "+promptDialogText);
		 
		 Thread.sleep(2000);
		 dr.findElement(By.xpath("//span[contains(text(),'Delete')]")).click();
		 dr.findElement(By.xpath("//span[.='No']")).click();
		 
		 Thread.sleep(2000);
		 dr.findElement(By.xpath("//h5[contains(text(),'Minimize and Maximize')]/parent::div//span")).click();
		 String minAndMAxText = dr.findElement(By.xpath("//p[contains(text(),'I am Sweet Alert and can be maximized or minimized. By the way, am not a new window.')]")).getText();
		 System.out.println("6. Minimize and Maximize Console Display Text : "+minAndMAxText);
		 dr.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all' and @aria-label='Close'])[3]")).click();
	
		 Thread.sleep(3000);
		 dr.close();
	}

}
