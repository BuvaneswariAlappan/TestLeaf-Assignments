package week3.Week3Day3;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment7AjioBagsSearch {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver dr=new ChromeDriver(option);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		dr.get("https://www.ajio.com/");
		
		dr.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
		WebElement chooseGender = dr.findElement(By.xpath("(//div[@class='facet-linkhead']/label)[1]"));
		chooseGender.click();
		try {
			chooseGender.click();
			}catch(StaleElementReferenceException ex) {
				chooseGender = dr.findElement(By.xpath("(//div[@class='facet-linkhead']/label)[1]"));
				chooseGender.click();
			}
		dr.findElement(By.xpath("(//div[@class='facet-linkhead']/label)[1]")).click();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		//WebElement chooseSelection = dr.findElement(By.xpath("//*[text()='Fashion Bags (613)']/parent::div"));
		WebElement chooseSelection = dr.findElement(By.xpath("(//div[@class='facet-body'])[2]//li[2]"));
		try {
		chooseSelection.click();
		}catch(StaleElementReferenceException ex) {
			chooseSelection = dr.findElement(By.xpath("(//div[@class='facet-body'])[2]//li[2]"));
//			chooseSelection = dr.findElement(By.xpath("//*[text()='Fashion Bags (613)']/parent::div"));
			chooseSelection.click();
		}
//		String itemsFound = dr.findElement(By.xpath("(//div[@class=' filter-container']//div)[2]")).getText();  
		//  (//div[@class=' filter-container']//div)[2]
		String itemsFound = dr.findElement(By.xpath("(//div[@class=' filter-container']//div)[2]")).getText();
		System.out.println(chooseSelection.getText());
		
		
		WebElement brandClick = dr.findElement(By.xpath("//span[text()='brands']"));
		brandClick.click();
		
		
		
	}

}
