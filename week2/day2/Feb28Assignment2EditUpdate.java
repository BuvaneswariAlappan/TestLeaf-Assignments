package SeleniumClassFeb28;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb28Assignment2EditUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("http://leaftaps.com/opentaps/control/login");
		
		dr.findElement(By.id("username")).sendKeys("DemoSalesManager");
		dr.findElement(By.id("password")).sendKeys("crmsfa");
		dr.findElement(By.className("decorativeSubmit")).click();
		
		dr.findElement(By.linkText("CRM/SFA")).click();
		dr.findElement(By.linkText("Leads")).click();
		
		dr.findElement(By.linkText("Create Lead")).click();
		
		dr.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeafSeleniumLearning");
		dr.findElement(By.id("createLeadForm_firstName")).sendKeys("Buvaneswari");
		dr.findElement(By.id("createLeadForm_lastName")).sendKeys("Alappan");
		dr.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("buvaneswari.alappan@gmail.com");
		dr.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("6381073094");
		
		dr.findElement(By.name("submitButton")).click();
		
		 dr.findElement(By.linkText("Edit")).click();
		 
		 dr.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf-Selenium-Learning-Feb22-Batch");
		 dr.findElement(By.name("submitButton")).click();
	}
}
