package week4Day3.Week4Day3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import week4.Day4.Week4Day4.BaseClass;



public class CreateLead extends BaseClass{
	
	@Test
	public void createLead1()  {
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Buvaneswari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Alappan");
		driver.findElement(By.name("submitButton")).click();
		
}
	@Test
	public void createLead2()  {
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABCD");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aapthi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Karthik");
		driver.findElement(By.name("submitButton")).click();
		
}
	
	@Test
	public void createLead3()  {
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZ");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhyan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Arivu");
		driver.findElement(By.name("submitButton")).click();
		
}
}






