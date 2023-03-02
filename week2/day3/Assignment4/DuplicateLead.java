package week2.day3.Assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver dr = new ChromeDriver();		
		
		dr.get("http://leaftaps.com/opentaps/control/login");
		dr.manage().window().maximize();
		
//		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		dr.findElement(By.id("username")).sendKeys("DemoSalesManager");
		dr.findElement(By.id("password")).sendKeys("crmsfa");
		dr.findElement(By.className("decorativeSubmit")).click();
		
		dr.findElement(By.linkText("CRM/SFA")).click();
		dr.findElement(By.xpath("//a[text()='Leads']")).click();		
		
	    dr.findElement(By.partialLinkText("Find")).click();
		
		//Email
		dr.findElement(By.linkText("Email")).click();
		dr.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("buvaneswari.alappan@gmail.com");
		
		dr.findElement(By.linkText("Find Leads")).click();
		
//		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		dr.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		
		dr.findElement(By.linkText("Duplicate Lead")).click();
		

		
//		 getTitle() to obtain page title
//	      System.out.println("Page title is : " + dr.getTitle());
	      
	      String Actual = dr.getTitle();
	        String Expected = "Duplicate Lead | opentaps CRM";

	        if (Actual.equals(Expected)) {
	                   System.out.println("Test Passed!");
	        } else {
	                   System.out.println("Test Failed");
	        }
		dr.findElement(By.linkText("Create Lead")).click();
		
		dr.close();
		
	}

}
