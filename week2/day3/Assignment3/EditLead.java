package week2.day3.Assignment3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
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
		dr.findElement(By.xpath("//input[@type='text' and  @name='firstName']//following::input[28]")).sendKeys("Buvaneswari");
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		dr.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		dr.findElement(By.xpath("//a[@class='linktext' and text()='Buvaneswari']")).click();
		
		 // getTitle() to obtain page title
	      //System.out.println("Page title is : " + dr.getTitle());
	      
	      String Actual = dr.getTitle();
	        String Expected = "View Lead | opentaps CRM";

	        if (Actual.equals(Expected)) {
	                   System.out.println("Test Passed!");
	        } else {
	                   System.out.println("Test Failed");
	        }

		dr.findElement(By.linkText("Edit")).click();
		dr.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
		dr.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("ABC Pvt Ltd");
		dr.findElement(By.xpath("(//input[@class='smallSubmit' and @name='submitButton'])[1]")).click();
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		dr.close();
		
	}

}
