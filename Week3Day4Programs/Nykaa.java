package week3.day4.Week3Day4Programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver dr=new ChromeDriver(option);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		dr.get("https://www.nykaa.com/");
		
		WebElement brands = dr.findElement(By.xpath("//a[text()='brands']"));
		
		Actions actionBrands = new Actions(dr);
		actionBrands.moveToElement(brands).perform();
		actionBrands.click();
		
		WebElement searchbrands = dr.findElement(By.xpath("//input[@id='brandSearchBox']"));
		searchbrands.sendKeys("L'Oreal Paris");
		//searchbrands.click();
		
		WebElement clickLoreal = dr.findElement(By.xpath("((//a[text()=\"L'Oreal Paris\"])[1]/parent::div//parent::div)[1]"));
//		clickLoreal.click();	
		
//		JavascriptExecutor jse = (JavascriptExecutor) dr;
//		jse.executeScript("arguments[0].value='L'Oreal Paris'", clickLoreal);
		
		dr.switchTo().activeElement();
		Robot robot = new Robot();
		robot.keyPress
	}

}
