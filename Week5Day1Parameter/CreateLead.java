package week5.Day1.Week5Day1Parameter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass {
	@Test
	public void createLead() {
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Buvaneswari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Alappan");
		driver.findElement(By.name("submitButton")).click();
		
}
}






