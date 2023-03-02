package week2.day3.Assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ChromeDriver dr = new ChromeDriver();		
				
				dr.get("http://leaftaps.com/opentaps/control/login");
				dr.manage().window().maximize();
				
				dr.findElement(By.id("username")).sendKeys("DemoSalesManager");
				dr.findElement(By.id("password")).sendKeys("crmsfa");
				dr.findElement(By.className("decorativeSubmit")).click();
				
				dr.findElement(By.linkText("CRM/SFA")).click();
				dr.findElement(By.xpath("//a[text()='Leads']")).click();		
				
			    dr.findElement(By.partialLinkText("Find")).click();
			    
			    dr.findElement(By.linkText("Phone")).click();
			    
			    dr.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
			    dr.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("+91");			    
			    dr.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("044");			    
			    dr.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9876543210");
			    
			    dr.findElement(By.linkText("Find Leads")).click();
			    
			  
			    String EditaccessibleName = dr.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getAccessibleName();
			    System.out.println(EditaccessibleName);
			    
			    dr.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			    
//			    dr.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();			    
			  
			    dr.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
			    
			    dr.findElement(By.partialLinkText("Find")).click();
			    
			    dr.findElement(By.xpath("//input[@name='id']")).sendKeys(EditaccessibleName);
			    dr.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
			    
			    String ResultNotFound = dr.findElement(By.xpath("//div[@class='x-paging-info']")).getAccessibleName();
			    System.out.println(ResultNotFound);
	}

}
