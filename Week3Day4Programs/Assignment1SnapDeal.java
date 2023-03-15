package week3.day4.Week3Day4Programs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Assignment1SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver dr=new ChromeDriver(option);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		dr.get("https://www.snapdeal.com/");
		
		WebElement moveToMensFashion = dr.findElement(By.xpath("//span[@class='catText']"));
		
		Actions builder = new Actions(dr);
		builder.moveToElement(moveToMensFashion).perform();
		
		WebElement sportShoes = dr.findElement(By.xpath("(//span[@class='linkTest'])[1]"));
		System.out.println(sportShoes.getTagName()+"    "+sportShoes.getText());
		builder.moveToElement(sportShoes).perform();
		sportShoes.click();
		
		WebElement menShoestotalCount = dr.findElement(By.xpath("//span[@class='category-name category-count']"));
		String menShoesCount = menShoestotalCount.getText();
		
		System.out.println(menShoesCount);
		
		WebElement trainingShoes = dr.findElement(By.xpath("(//div[@class='child-cat-name '])[2]"));
		trainingShoes.click();
		
		WebElement we2 = dr.findElement(By.xpath("//li[normalize-space()='Price Low To High']"));
		JavascriptExecutor jse = (JavascriptExecutor) dr;
		jse.executeScript("arguments[0].click()", we2);

		

 }//Main method end here
		 	
}

