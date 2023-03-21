package week4.Day4.Week4Day4;

import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class EditLead  extends BaseClass{

	@Test
	public void editLead1()  throws InterruptedException {


		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Acube");
		driver.findElement(By.name("submitButton")).click();

	}
//	@Test
//	public void editLead2()  throws InterruptedException {
//
//
//		driver.findElement(By.linkText("Leads")).click();
//		driver.findElement(By.linkText("Find Leads")).click();
//		driver.findElement(By.xpath("//span[text()='Phone']")).click();
//		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
//		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
//		driver.findElement(By.linkText("Edit")).click();
//		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Aequalis");
//		driver.findElement(By.name("submitButton")).click();
//
//	}
//	@Test
//	public void editLead3()  throws InterruptedException {
//
//
//		driver.findElement(By.linkText("Leads")).click();
//		driver.findElement(By.linkText("Find Leads")).click();
//		driver.findElement(By.xpath("//span[text()='Phone']")).click();
//		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
//		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
//		driver.findElement(By.linkText("Edit")).click();
//		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Kyyba");
//		driver.findElement(By.name("submitButton")).click();
//
//	}
}






