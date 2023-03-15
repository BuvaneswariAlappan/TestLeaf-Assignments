package week3.day4.Week3Day4Programs;

import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");

		Actions actions = new Actions(driver);
		WebElement we = driver.findElement(By.className("catText"));
		driver.findElement(By.className("catText"));
		actions.moveToElement(we).perform();
		driver.findElement(By.xpath("//span[@class='linkTest']")).click();
		List<WebElement> count = driver.findElements(By.xpath("//a[@class='dp-widget-link noUdLine hashAdded']"));
		int num = count.size();
		System.out.println(num);
		driver.findElement(By.xpath("//div[contains(text(),'Training ')]")).click();
		Thread.sleep(5000);
		WebElement we1 = driver.findElement(By.className("sort-selected"));
		we1.click();
		Thread.sleep(5000);
		/*
		 * WebElement we1=driver.findElement(By.
		 * xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")); we1.click();
		 */
		WebElement we2 = driver.findElement(By.xpath("//li[normalize-space()='Price Low To High']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", we2);
	}
}