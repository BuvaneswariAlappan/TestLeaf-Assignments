package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPriceList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		dr.get("https://www.amazon.in/");
		dr.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile phones",Keys.ENTER);
		List<WebElement> allPriceValues = dr.findElements(By.className("a-price-whole"));
		
		List<Integer> priceList = new ArrayList<Integer>();
		
		
		int sizeOfallPriceValues = allPriceValues.size();
		
		for(int i=0;i<sizeOfallPriceValues;i++) {
			WebElement setAllPrice = allPriceValues.get(i);
			String textOfsetAllPrice = setAllPrice.getText();
			
			String replaceComma = textOfsetAllPrice.replaceAll(",","");			
			System.out.println(" All Price : "+replaceComma );
			
			if(!replaceComma.trim().equals("")) {
				int intValueOfreplaceComma = Integer.parseInt(replaceComma);
				if(intValueOfreplaceComma>0) {
					priceList.add(intValueOfreplaceComma);
				}
			}
		}
		
		Collections.sort(priceList);
		
		System.out.println("Lowest Price starts from "+priceList.get(0));
	}

}
