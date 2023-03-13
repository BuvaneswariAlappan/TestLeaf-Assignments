package week4.day1.week4day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PromptAlertClassroomactivity {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver dr=new ChromeDriver(option);
		dr.manage().window().maximize();
		Thread.sleep(2000);
		dr.get("https://www.leafground.com/alert.xhtml");

		Thread.sleep(2000);
		WebElement findFrame = dr.findElement(By.xpath("(//span[text()='Show'])[5]"));
		findFrame.click();
		
		Alert alert = dr.switchTo().alert();
		alert.sendKeys("Buvanesari Alappan");
		alert.accept();
		
		String confirm_resultText = dr.findElement(By.id("confirm_result")).getText();
		
		System.out.println(confirm_resultText);
		
	}

}
