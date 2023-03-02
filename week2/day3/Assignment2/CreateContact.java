package week2.day3.Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver dr = new ChromeDriver();		
		
		dr.get("http://leaftaps.com/opentaps/control/login");
		dr.manage().window().maximize();
		
		dr.findElement(By.id("username")).sendKeys("DemoSalesManager");
		dr.findElement(By.id("password")).sendKeys("crmsfa");
		dr.findElement(By.className("decorativeSubmit")).click();
		
		dr.findElement(By.linkText("CRM/SFA")).click();
		dr.findElement(By.xpath("//a[text()='Create Contact']")).click();		
		
		dr.findElement(By.id("firstNameField")).sendKeys("Buvaneswari");
		dr.findElement(By.id("lastNameField")).sendKeys("Alappan");
		dr.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Buvi");
		dr.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Alappan");
		
		dr.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
		
		dr.findElement(By.id("createContactForm_description")).sendKeys("Hi, I am Buvaneswari Alappan. Here i am learning Selenium");
		dr.findElement(By.id("createContactForm_primaryEmail")).sendKeys("buvaneswari.alappan@gmail.com");
		
		Select province = new Select(dr.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
		province.selectByValue("NY");
		
		dr.findElement(By.xpath("//input[@name='submitButton']")).click();
		dr.findElement(By.xpath("//a[text()=\'Edit\']")).click();
		
		dr.findElement(By.id("updateContactForm_description")).clear();
		dr.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important Notes to describe here");
		
		dr.findElement(By.xpath("//input[@name='submitButton'][1]")).click();
		String title = dr.getTitle();
		
		System.out.println("Title of this page is "+title);
		
	}

}
