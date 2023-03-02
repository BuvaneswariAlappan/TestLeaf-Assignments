package week2.day3.Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FacebookUsingWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.get("https://www.facebook.com/");
		WebElement createAnAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
		createAnAccount.click();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Ravi");
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.sendKeys("Padma");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("buvi.ravipadma@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("buvi.ravipadma@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Aaa@123");
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByValue("13");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByIndex(11);		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1980");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();
		
		//driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		//driver.close();
		
	}

}
