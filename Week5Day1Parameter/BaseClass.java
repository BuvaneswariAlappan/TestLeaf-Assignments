package week5.Day1.Week5Day1Parameter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	public RemoteWebDriver driver;
	
	@Parameters({"url","username","password","browser"})
	
	
	@BeforeMethod
	public void preConditionforAllClass(String url, String username, String password, String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
		
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--remote-allow-origins=*"); 
		driver=new ChromeDriver(options);
		}
		else if(browser.equalsIgnoreCase("edge")) {
			EdgeOptions options = new EdgeOptions(); 
			options.addArguments("--remote-allow-origins=*"); 
			driver=new EdgeDriver(options);
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@AfterMethod
	public void postConditionForAllClasses() {
		driver.close();
	}

}
